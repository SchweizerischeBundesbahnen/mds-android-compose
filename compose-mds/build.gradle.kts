import com.android.build.gradle.tasks.BundleAar

plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.mavenPublish)
}

android {
    namespace = "ch.sbb.compose_mds"
    compileSdk = 36

    defaultConfig {
        minSdk = 29

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
    kotlin {
        jvmToolchain(21)
    }

    configure<PublishingExtension> {
        publications {
            register<MavenPublication>("release") {
                groupId = "ch.sbb.compose_mds"
                artifactId = "compose-mds"
                version = when (val version = project.property("version") as String) {
                    "unspecified" -> "LOCAL-SNAPSHOT"
                    else -> version
                }

                afterEvaluate {
                    from(components["release"])
                }
            }
        }
    }

    tasks.withType<AbstractPublishToMaven> {
        dependsOn(tasks.withType<BundleAar>())
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
}
