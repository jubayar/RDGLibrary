plugins {
    id ("maven-publish")
    id ("com.android.library")
    id ("org.jetbrains.kotlin.android")
}

android {
    namespace = "net.red.green.rdgmath"
    compileSdk = 32

    defaultConfig {
        minSdk = 23
        targetSdk = 32

        missingDimensionStrategy ("sign", "link")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    flavorDimensions += listOf("Design")
    productFlavors {
        create("sharetrip") {
            dimension = "Design"
        }
        create("banglalink") {
            dimension = "Design"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation (project(":rdgnoti"))

    implementation ("androidx.core:core-ktx:1.7.0")
    implementation ("androidx.appcompat:appcompat:1.4.1")
    implementation ("com.google.android.material:material:1.5.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")

    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
}

afterEvaluate {
    publishing {
        publications {
            register<MavenPublication>("release") {
                from(components["banglalinkRelease"])

                groupId = "com.github.jubayar"
                artifactId = "rdgmath-bl"
                version = "1.0.2"
            }
        }
    }
}
