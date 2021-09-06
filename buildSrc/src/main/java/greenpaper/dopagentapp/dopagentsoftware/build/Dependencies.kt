private object DependenciesVersions {
    const val APP_COMPAT = "1.2.0"
    const val NAVIGATION = "2.3.3"
    const val NAVIGATION_KTX = "2.3.3"
    const val KOTLIN = "1.4.0"
    const val KTX = "1.3.2"
    const val MATERIAL = "1.3.0"
    const val CONSTRAINT_LAYOUT = "2.0.4"
    const val LIVEDATA = "2.3.0"
    const val VIEWMODEL = "2.3.0"
    const val RECYCLERVIEW = "1.1.0"
    const val MULTIDEX = "2.0.1"
    const val DESUGAR_JDK = "1.1.5"
    const val EPOXY = "4.5.0"
    //const val GLIDE = "3.8.0"
    const val LEGACY_SUPPORT = "1.0.0"
    const val JUNIT = "4.+"
    const val JUNIT_ANDROID = "1.1.2"
    const val ESPRESSO = "3.3.0"
    const val VIEWPAGER2 = "1.0.0"
    const val COROUTINE = "1.4.2"
    const val DAGGER = "2.26"
    const val MOSHI = "1.11.0"
    const val RETROFIT = "2.9.0"
    const val RETROFIT_MOSHI = "2.9.0"
    const val MOSHI_KOTLIN = "1.11.0"
    const val RX_JAVA = "2.1.9"
    const val RX_ANDROID = "2.0.1"
    const val RETROFIT_LOGGING = "4.9.1"
    const val STETHO = "1.5.0"
    const val LOTTIE = "3.7.0"
    const val EXOPLAYER = "2.14.0"
    const val PLAY_SERVICES_AUTH = "17.0.0"
    const val PLAY_SERVICES_AUTH_PHONE = "17.4.0"
    const val SYNERGIAN_WAGON = "0.2.3"
    const val POCKETFIN_CORE = "1.0.0"
    const val POCKETFIN_UICOMPONENTS = "1.0.1"
    const val COUNTRY_CODE_PICKER = "2.5.3"
    const val OTP_VIEW = "2.1.2"
    const val FIREBASE_BOM = "28.1.0"
    const val GRAPHQL = "2.5.9"
    const val PICASSO = "2.71828"
    const val GSON = "2.8.7"
}

object Dependencies {

    //kotlin
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib:${DependenciesVersions.KOTLIN}"
    const val KTX = "androidx.core:core-ktx:${DependenciesVersions.KTX}"
    const val COROUTINE =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${DependenciesVersions.COROUTINE}"
    const val COROUTINE_ANDROID =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${DependenciesVersions.COROUTINE}"

    //core
    const val MATERIAL = "com.google.android.material:material:${DependenciesVersions.MATERIAL}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${DependenciesVersions.APP_COMPAT}"
    const val MULTIDEX = "androidx.multidex:multidex:${DependenciesVersions.MULTIDEX}"
    const val DESUGAR_JDK = "com.android.tools:desugar_jdk_libs:${DependenciesVersions.DESUGAR_JDK}"
    const val LEGACY_SUPPORT =
        "androidx.legacy:legacy-support-v4:${DependenciesVersions.LEGACY_SUPPORT}"

    //view libs
    const val CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${DependenciesVersions.CONSTRAINT_LAYOUT}"
    const val RECYCLERVIEW =
        "androidx.recyclerview:recyclerview:${DependenciesVersions.RECYCLERVIEW}"
    const val VIEWPAGER2 = "androidx.viewpager2:viewpager2:${DependenciesVersions.VIEWPAGER2}"

    //navigation
    const val NAVIGATION_FRAGMENT =
        "androidx.navigation:navigation-fragment:${DependenciesVersions.NAVIGATION}"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui:${DependenciesVersions.NAVIGATION}"
    const val NAVIGATION_FRAGMENT_KTX =
        "androidx.navigation:navigation-fragment-ktx:${DependenciesVersions.NAVIGATION_KTX}"
    const val NAVIGATION_UI_KTX =
        "androidx.navigation:navigation-ui-ktx:${DependenciesVersions.NAVIGATION_KTX}"

    //arch components
    const val LIVEDATA =
        "androidx.lifecycle:lifecycle-livedata-ktx:${DependenciesVersions.LIVEDATA}"
    const val VIEWMODEL =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${DependenciesVersions.VIEWMODEL}"

    //epoxy simplified recyclerview
    const val EPOXY = "com.airbnb.android:epoxy:${DependenciesVersions.EPOXY}"
    const val EPOXY_ANNOTATION = "com.airbnb.android:epoxy-processor:${DependenciesVersions.EPOXY}"
    const val EPOXY_PAGING = "com.airbnb.android:epoxy-paging:${DependenciesVersions.EPOXY}"

    //glide image loading
    //const val GLIDE = "com.github.bumptech.glide:glide:${DependenciesVersions.GLIDE}"
    //const val GLIDE_ANNOTATION = "com.github.bumptech.glide:compiler:${DependenciesVersions.GLIDE}"

    //dagger dependency injection
    const val DAGGER = "com.google.dagger:dagger:${DependenciesVersions.DAGGER}"
    const val DAGGER_ANNOTATION = "com.google.dagger:dagger-compiler:${DependenciesVersions.DAGGER}"
    const val DAGGER_ANDROID = "com.google.dagger:dagger-android:${DependenciesVersions.DAGGER}"
    const val DAGGER_ANDROID_SUPPORT =
        "com.google.dagger:dagger-android-support:${DependenciesVersions.DAGGER}"
    const val DAGGER_ANDROID_ANNOTATION =
        "com.google.dagger:dagger-android-processor:${DependenciesVersions.DAGGER}"

    //moshi json converter
    const val MOSHI = "com.squareup.moshi:moshi:${DependenciesVersions.MOSHI}"
    const val MOSHI_KOTLIN = "com.squareup.moshi:moshi-kotlin:${DependenciesVersions.MOSHI_KOTLIN}"
    const val MOSHI_ANNOTATION =
        "com.squareup.moshi:moshi-kotlin-codegen:${DependenciesVersions.MOSHI}"

    //retrofit networking library
    const val RETROFIT_MOSHI_CONVERTER =
        "com.squareup.retrofit2:converter-moshi:${DependenciesVersions.RETROFIT_MOSHI}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${DependenciesVersions.RETROFIT}"
    const val RETROFIT_LOGGING_INTERCEPTOR =
        "com.squareup.okhttp3:logging-interceptor:${DependenciesVersions.RETROFIT_LOGGING}"

    //test
    const val JUNIT = "junit:junit:${DependenciesVersions.JUNIT}"
    const val JUNIT_ANDROID = "androidx.test.ext:junit:${DependenciesVersions.JUNIT_ANDROID}"
    const val ESPRESSO = "androidx.test.espresso:espresso-core:${DependenciesVersions.ESPRESSO}"

    //rxjava
    const val RX_JAVA = "io.reactivex.rxjava2:rxjava:${DependenciesVersions.RX_JAVA}"
    const val RX_ANDROID = "io.reactivex.rxjava2:rxandroid:${DependenciesVersions.RX_ANDROID}"

    //stetho
    const val STETHO = "com.facebook.stetho:stetho:${DependenciesVersions.STETHO}"
    const val STETHO_OKHTTP = "com.facebook.stetho:stetho-okhttp3:${DependenciesVersions.STETHO}"

    //lottie
    const val LOTTIE_ANDROID = "com.airbnb.android:lottie:${DependenciesVersions.LOTTIE}"

    //exo player
    const val EXO_PLAYER_CORE =
        "com.google.android.exoplayer:exoplayer-core:${DependenciesVersions.EXOPLAYER}"
    const val EXO_PLAYER_UI =
        "com.google.android.exoplayer:exoplayer-ui:${DependenciesVersions.EXOPLAYER}"

    const val PLAY_SERVICE_AUTH = "com.google.android.gms:play-services-auth:${DependenciesVersions.PLAY_SERVICES_AUTH}"
    const val PLAY_SERVICE_AUTH_PHONE = "com.google.android.gms:play-services-auth-api-phone:${DependenciesVersions.PLAY_SERVICES_AUTH_PHONE}"

    const val OTP_VIEW = "com.github.mukeshsolanki:android-otpview-pinview:${DependenciesVersions.OTP_VIEW}"

    const val FIREBASE_BOM = "com.google.firebase:firebase-bom:${DependenciesVersions.FIREBASE_BOM}"

    const val FIREBASE_REMOTE_CONFIG = "com.google.firebase:firebase-config-ktx"
    const val FIREBASE_ANALYTICS = "com.google.firebase:firebase-analytics-ktx"
    const val FIREBASE_CRASHLYTICS = "com.google.firebase:firebase-crashlytics-ktx"

    const val GRAPHQL_CLIENT = "com.apollographql.apollo:apollo-runtime:${DependenciesVersions.GRAPHQL}"
    const val GRAPHQL_COROUTINES_SUPPORT =  "com.apollographql.apollo:apollo-coroutines-support:${DependenciesVersions.GRAPHQL}"

    const val PICASSO = "com.squareup.picasso:picasso:${DependenciesVersions.PICASSO}"

    const val GSON = "com.google.code.gson:gson:${DependenciesVersions.GSON}"

}

object BaseUrl {
    //const val BASE_URL_DEV = "\"https://13.126.48.195/\""
    const val BASE_URL_DEV = "\"https://www.reddit.com/\""
    const val BASE_URL_STAG = "\"https://www.reddit.com/\""
    const val BASE_URL_PROD = "\"https://www.reddit.com/\""
}