plugins {
    kotlin("jvm") version "2.4.21"
    application
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation("com.github.DevSrSouza:svg-to-compose:0.11.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")
}

application {
    mainClass.set("ch.sbb.compose_mds.tool.icons.MainKt")
}

tasks.named<JavaExec>("run") {
    // Resolve relative paths against the repository root instead of tool/sbb-icons.
    workingDir = rootDir.parentFile.parentFile
}
