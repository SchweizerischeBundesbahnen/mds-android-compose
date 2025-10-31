[![](https://jitpack.io/v/SchweizerischeBundesbahnen/mds-android-compose.svg)](https://jitpack.io/#SchweizerischeBundesbahnen/mds-android-compose)

#### Table Of Contents

- [Introduction](#Introduction)
- [Getting Started](#Getting-Started)
- [License](#License)

<a id="Introduction"></a>

## Introduction

[SBB Design System Mobile][mds-mobile] in Android Jetpack Compose.

This framework contains SBB (Swiss Federal Railways) UI elements for Android Jetpack Compose Apps. It allows an easy integration of SBB theming to your app.

*Note:* This plugin is still under development and some APIs might change. Feedback and Pull Requests are most welcome!

Please read [CONTRIBUTING][contributing], [CODING_STANDARDS][coding_standards] and [CODE_OF_CONDUCT][code_of_conduct] if you want to contribute.
Changes can be found in the [CHANGELOG][changelog].

<a id="Getting-Started"></a>

## Getting-Started

To import the Design System Mobile, please add the [JitPack][jitpack] repository to your root `settings.gradle.kts` or `build.gradle.kts` at the end of repositories:

``` kotlin                     
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the Design SBB System Mobile dependency to your `app/build.gradle.kts`:

``` kotlin                     
dependencies {
    implementation 'com.github.SchweizerischeBundesbahnen:mds-android-compose:{latest-release}'
}
```

To use the Components in code, make sure to wrap the the App with a `SBBTheme` and `Scaffold` or `Surface`.
```
SBBTheme {
    Scaffold {
        MainPage(navController = rememberNavController())
    }
}
```

To use the Components with the SBB Typography, please find the SBB Font, save it as resources and initialize the `SBBTheme`
```
val fontFamily = FontFamily(
    Font(R.font.sbb_web_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.sbb_web_bold, FontWeight.Bold),
    Font(R.font.sbb_web_light, FontWeight.Light),
    Font(R.font.sbb_web_roman, FontWeight.Normal),
    Font(R.font.sbb_web_thin, FontWeight.Thin),
    Font(R.font.sbb_web_ultra_light, FontWeight.ExtraLight)
)
SBBTheme(fontFamily = fontFamily) {
    ...
}
```

<a id="License"></a>

## Golden File Screenshot Testing

This project uses [Roborazzi](https://github.com/takahirom/roborazzi) for screenshot testing to 
prevent unintended visual regressions. The tests generate "golden file" images from the `@Preview` 
composables located in the `example` module and compare them against previously recorded versions. 

> **Important:**  
> - The `@Preview` composables must **not** be declared as `private`, otherwise Roborazzi will ignore them.
> - When wrapping the preview in `SBBTheme`, set the parameter `includeSurface = true` — otherwise dark mode rendering will not work correctly.

Example:
```kotlin
@PreviewLightDark
@Composable
fun ExamplePagePreview() {
    SBBTheme(includeSurface = true) {
        ExamplePage()
    }
}
```

All golden files are stored in the `/goldenfiles` directory at the root of the project.

### Verifying and Updating Golden Files

**To verify** that your changes have not caused any visual regressions, run the verification task. 
This will compare newly generated screenshots with the existing golden files.
```bash
./gradlew :example:verifyRoborazziDebug
```

**To update** the golden files after making an intentional UI change, you must record the new 
versions. This will overwrite the existing files with the latest output.
```bash
./gradlew :example:recordRoborazziDebug
```

### Workflow for UI Changes

#### Adding a New Component
1.  Create the new component in the `compose-mds` library.
2.  In the `example` module, add a new file with one or more `@Preview` functions to showcase the component's different states.
3.  Generate the initial golden file by running the record task:
    ```bash
    ./gradlew :example:recordRoborazziDebug
    ```
4.  A new image file will be created in the `/goldenfiles` directory. Review it to ensure it matches the component's design.
5.  Commit the new component, the preview file, and the generated golden file.

#### Modifying an Existing Component
1.  Make your intended UI changes to a component in the `compose-mds` library.
2.  Run the verification task. The test for the component you changed should fail.
    ```bash
    ./gradlew :example:verifyRoborazziDebug
    ```
    > **Note:** If the test does *not* fail, your change is likely not covered by the existing `@Preview`. You may need to adjust the preview to properly display the modification.
3.  After confirming the test failure is expected, record the updated golden file:
    ```bash
    ./gradlew :example:recordRoborazziDebug
    ```
4.  Review the modified image in the `/goldenfiles` directory to ensure it correctly reflects your changes.
5.  Commit your code changes along with the updated golden file.

## License

This project is licensed under [MIT](LICENSE.md).

[mds-mobile]: https://digital.sbb.ch/en/design-system/mobile/overview/
[jitpack]: https://jitpack.io/
[contributing]: CONTRIBUTING.md
[coding_standards]: CODING_STANDARDS.md
[code_of_conduct]: CODE_OF_CONDUCT.md
[changelog]: CHANGELOG.md
