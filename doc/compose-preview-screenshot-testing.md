# Compose Preview Screenshot Testing (AGP Test Suites)

> ⚠️ **Experimental:** Compose Preview Screenshot Testing with AGP test suites is in active
> development. APIs and DSL syntax are subject to change.

This document describes the proof-of-concept setup used in the `compose-mds` module to evaluate
Google's new, official **Compose Preview Screenshot Testing** tooling as a long-term replacement
for Roborazzi (see [`wyh-roborazzi.md`](./wyh-roborazzi.md)).

`SBBStatus` was chosen as the first component to migrate, since it already ships a set of
`@PreviewLightDark` previews (see
[
`Preview_SBBStatus.kt`](../compose-mds/src/main/java/ch/sbb/compose_mds/composables/status/Preview_SBBStatus.kt)).

## Setup

### 1. Root `gradle.properties`

```properties
android.experimental.enableScreenshotTest=true
android.experimental.testSuiteSupport=true
```

### 2. Version catalog (`gradle/libs.versions.toml`)

* `agp` bumped to `9.5.0-alpha03` (minimum required for AGP test suite support).
* Added `composeScreenshotEngine = "0.0.1-alpha16"` and the
  `com.android.tools.screenshot:screenshot-validation-api` library coordinate.

### 3. `compose-mds/build.gradle.kts`

A `screenshotTest` test suite is configured for the `debug` variant of the library:

```kotlin
testOptions {
    screenshotTests.create("screenshotTest") {
        engineVersion = libs.versions.composeScreenshotEngine.get()
        targetVariants.add("debug")

        dependencies {
            implementation(libs.ui.tooling)
            implementation(libs.screenshot.validation.api)
            // Workaround, see "Known issues" below.
            implementation("org.jetbrains.kotlin:kotlin-reflect:${libs.versions.kotlin.get()}")
        }
    }
}
```

### 4. Test source set

Preview tests live in a dedicated source set, `compose-mds/src/screenshotTest/kotlin/...`, as
recommended by the official docs. Rather than duplicating preview logic, the test-only composables
simply forward to the existing previews in `Preview_SBBStatus.kt` and add the `@PreviewTest`
annotation required for discovery:

```kotlin
@PreviewTest
@PreviewLightDark
@Composable
fun ScreenshotTest_SBBStatus_Alert(
    @PreviewParameter(SBBThemeConfigProvider::class) config: ThemePreviewConfig,
) = Preview_SBBStatus_Alert(config)
```

See
[
`SBBStatusScreenshotTest.kt`](../compose-mds/src/screenshotTest/kotlin/ch/sbb/compose_mds/composables/status/SBBStatusScreenshotTest.kt)
for the full example (covering `Alert`, `Warning`, `Success`, `Information` and the custom styled
status).

## Running the tests

AGP generates tasks named `{update|test}{SuiteName}{Target}{Variant}TestSuite`. For our
`screenshotTest` suite / `debug` variant of `compose-mds`, the target defaults to `Default`:

```bash
# Generate / refresh reference ("golden") images
./gradlew :compose-mds:updateScreenshotTestDefaultDebugTestSuite

# Verify current previews against the reference images
./gradlew :compose-mds:testScreenshotTestDefaultDebugTestSuite
```

* Reference images: `compose-mds/src/screenshotTestDefaultDebug/reference/`
* HTML report: `compose-mds/build/reports/tests/testScreenshotTestDefaultDebugTestSuite/index.html`

## Known issues

* The `compose-preview-renderer`/`screenshot-validation-api` artifacts at `0.0.1-alpha16`
  transitively resolve an older `kotlin-reflect` version than the one used to compile this project.
  This causes a `KotlinReflectionInternalError: ... no members found` failure when rendering
  previews. The fix is to force a matching `kotlin-reflect` version (see the `dependencies` block
  above).
* Requires AGP `9.5.0-alpha03+` and JDK 17+; both experimental flags must be enabled in
  `gradle.properties`.

## References

* [Compose Preview Screenshot Testing (Android Developers)](https://developer.android.com/studio/preview/compose-screenshot-testing)
* [
  `AgpTestSuite` DSL reference](https://developer.android.com/reference/tools/gradle-api/9.5/com/android/build/api/dsl/AgpTestSuite)

