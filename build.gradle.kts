plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.folio.designsystem"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        minSdk = 28
    }
}

dependencies {
    implementation(libs.material)
}
