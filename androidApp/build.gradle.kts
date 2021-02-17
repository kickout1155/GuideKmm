plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation ("com.github.bumptech.glide:glide:4.9.0")
    implementation ("androidx.fragment:fragment-ktx:1.3.0")
    implementation ("com.github.bumptech.glide:glide:4.9.0")

}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "com.example.guidekmm.androidApp"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}