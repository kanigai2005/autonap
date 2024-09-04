plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    namespace = "com.example.autonapalarm"
    compileSdk = 33  // Update this to the latest stable version

    defaultConfig {
        applicationId = "com.example.autonapalarm"  // Update this with your app’s package name
        minSdk = 24  // Minimum supported version (API 24 = Android 7.0 Nougat)
        targetSdk = 33  // Targeting the latest stable version
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17  // Match this with your JDK version
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"  // Match this with your JDK version
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:kotlin_version")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("com.google.code.gson:gson:2.10.1")
    
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.0")

}