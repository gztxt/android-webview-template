plugins {
    id("com.android.application")
}

android {
    namespace = "com.gztxt.webviewapp"
    compileSdk = 35

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    defaultConfig {
        applicationId = "com.gztxt.webviewapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.webkit:webkit:1.12.1")

    constraints {
        implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.24") {
            because("Force unified Kotlin version to avoid duplicate class conflicts")
        }
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.24") {
            because("Force unified Kotlin version")
        }
    }
}
