import com.android.build.api.dsl.LibraryExtension
import com.android.build.gradle.tasks.BundleAar

plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.mavenPublish)
    alias(libs.plugins.ktlint)
    alias(libs.plugins.kotlin.android)
}

// ktlint configuration (modern plugin DSL). Re-add this block to enable
// Gradle tasks `ktlintCheck` and `ktlintFormat` for this module. The plugin
// is applied via the version catalog alias above (`libs.plugins.ktlint`).
ktlint {
    // enable Android-specific rule set
    android.set(true)

    // print results to console and be verbose
    verbose.set(true)
    outputToConsole.set(true)

    // fail the build on violations (set to true to be permissive locally)
    ignoreFailures.set(false)

    // reporters (optional)
    reporters {
        reporter(org.jlleitschuh.gradle.ktlint.reporter.ReporterType.PLAIN)
        reporter(org.jlleitschuh.gradle.ktlint.reporter.ReporterType.CHECKSTYLE)
    }

    // exclude generated code and icon assets from linting
    filter {
        exclude("**/generated/**")
        exclude("**/sbbicons/**")
    }
}

configure<LibraryExtension> {
    namespace = "ch.sbb.compose_mds"
    compileSdk = 36

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

tasks.withType<AbstractPublishToMaven> {
    dependsOn(tasks.withType<BundleAar>())
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("release") {
            groupId = "ch.sbb.compose_mds"
            artifactId = "compose-mds"
            version =
                when (val version = project.property("version") as String) {
                    "unspecified" -> "LOCAL-SNAPSHOT"
                    else -> version
                }

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}

dependencies {
    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.material3)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.foundation)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.androidx.ui.test.android)
    androidTestImplementation(libs.androidx.ui.test.junit4.android)
    debugImplementation(libs.ui.tooling)
    ktlintRuleset(libs.ktlint.composable)
}
