import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
}

group = "me.clemo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.gson:gson:2.8.7")
    testImplementation(kotlin("test"))
    testImplementation ("org.spekframework.spek2:spek-dsl-jvm:2.0.11")
    testImplementation ("org.spekframework.spek2:spek-runner-junit5:2.0.11")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "13"
}