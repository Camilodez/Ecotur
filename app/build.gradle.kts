plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}


android {
    namespace = "com.example.ecotur"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.ecotur"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    dependenciesInfo {
        includeInApk = true
        includeInBundle = true
    }
    buildFeatures {
        dataBinding = true
    }
}

val koin_version = "2.1.6"
val lifecycleVersion = "2.2.0"
val retrofitVersion = "2.9.0"
val okhttpVersion = "4.9.0"
val glideVersion = "4.11.0"

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation ("androidx.core:core-ktx:1.9.0")
    implementation ("androidx.appcompat:appcompat:1.5.1")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion")
    implementation ("androidx.lifecycle:lifecycle-extensions:$lifecycleVersion")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion")
    implementation ("androidx.activity:activity-ktx:1.6.1")
    implementation ("androidx.fragment:fragment-ktx:1.5.5")

    implementation("com.google.android.gms:play-services-maps:18.2.0")
    implementation ("io.insert-koin:koin-core:$koin_version")
    implementation ("io.insert-koin:koin-core-ext:$koin_version")
    implementation ("io.insert-koin:koin-androidx-scope:$koin_version")
    implementation ("io.insert-koin:koin-androidx-viewmodel:$koin_version")


    implementation ("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation ("com.squareup.retrofit2:converter-gson:$retrofitVersion")
    implementation ("com.squareup.okhttp3:logging-interceptor:$okhttpVersion")
    implementation ("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")

    implementation ("com.github.bumptech.glide:glide:$glideVersion")
    annotationProcessor ("com.github.bumptech.glide:compiler:$glideVersion")
    implementation ("com.github.mukeshsolanki:android-otpview-pinview:2.1.2")

    testImplementation ("junit:junit:4.+")
    androidTestImplementation ("androidx.test.ext:junit:1.1.4")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.0")

    implementation("androidx.security:security-crypto:1.0.0")
    implementation ("com.airbnb.android:lottie:3.4.0")

    implementation ("com.google.android.gms:play-services-maps:17.0.1")
}