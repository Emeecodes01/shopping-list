
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.project

object Dependencies {

    object ApplicationId {
        val appId = "com.mobigod.shoppinglist"
    }

    object Releases {
        val versionCode = 1
        val versionName = "1.0.0"
    }

    object  ImageLoadingLibraries {
        val glideLib = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
        val glideProcessor = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"
    }

    object AndroidxCore {
        val andriodxAppCompat = "androidx.appcompat:appcompat:${Versions.androidxCoreVersion}"
        val androidKtx = "androidx.core:core-ktx:${Versions.androidxCoreVersion}"
    }

    object Coroutines {
        val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutineVersion}"
        val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutineVersion}"
    }

    object UIDependency {
        val androidConstraintLayoutDep = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
        val googleMaterialDesign = "com.google.android.material:material:${Versions.googleMaterialVersion}"
        val recyclerView = "androidx.recyclerview:recyclerview:${Versions.googleMaterialVersion}"
    }

    object Dagger2 {
        val daggerCore = "com.google.dagger:dagger:${Versions.daggerVersion}"
        val daggerComplier = "com.google.dagger:dagger-compiler:${Versions.daggerVersion}"
        val daggerAndroid = "com.google.dagger:dagger-android:${Versions.daggerVersion}"
        val daggerSupport = "com.google.dagger:dagger-android-support:${Versions.daggerVersion}"
        val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.daggerVersion}"
    }


    object ArchComponents {
        val room = "androidx.room:room-runtime:${Versions.roomVersion}"
        val roomComplier = "androidx.room:room-compiler:${Versions.roomVersion}"
        val roomKtx = "androidx.room:room-ktx:${Versions.roomVersion}"
        val viewModelliveData = "androidx.lifecycle:lifecycle-extensions:${Versions.liveDataViewModel}"
        val viewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.liveDataViewModel}"
        val liveDataKtx = "androidx.lifecycle:lifecycle-livedata:${Versions.liveDataViewModel}"
    }

    object TestDependencies {
        val junitTestDep = "junit:junit:${Versions.junitVersion}"
        val androidJunitTestDep = "androidx.test.ext:junit:${Versions.androidJUnit}"
        val androidEspressoTestDep = "androidx.test.espresso:espresso-core:${Versions.expressoVersion}"
        val mockitoDep = "org.mockito:mockito-core:${Versions.mockitoVersion}"
        val roomDbTestHelper = "androidx.room:room-testing:${Versions.roomVersion}"
        val liveDataTestHelper = "androidx.arch.core:core-testing:${Versions.liveDataViewModel}"
        val couroutineTestDep = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutineTestVersion}"
    }

    object DevTools{
        val stethoDep = "com.facebook.stetho:stetho:${Versions.stethoVersion}"
    }

}


fun DependencyHandler.kotlinCoroutines() {
    add("implementation", Dependencies.Coroutines.coroutineCore)
    add("implementation", Dependencies.Coroutines.coroutineAndroid)
}

fun DependencyHandler.androidDep() {
    add("implementation", Dependencies.AndroidxCore.andriodxAppCompat)
    add("implementation", Dependencies.AndroidxCore.androidKtx)
}

fun DependencyHandler.UILibraries() {
    add("implementation", Dependencies.UIDependency.androidConstraintLayoutDep)
    add("implementation", Dependencies.ImageLoadingLibraries.glideLib)
    add("implementation", Dependencies.UIDependency.googleMaterialDesign)
    add("implementation", Dependencies.UIDependency.recyclerView)
    add("kapt", Dependencies.ImageLoadingLibraries.glideProcessor)
}

fun DependencyHandler.DI() {
    add("implementation", Dependencies.Dagger2.daggerCore)
    add("implementation", Dependencies.Dagger2.daggerAndroid)
    add("implementation", Dependencies.Dagger2.daggerSupport)
    add("kapt", Dependencies.Dagger2.daggerComplier)
    add("kapt", Dependencies.Dagger2.daggerAndroidProcessor)
}

fun DependencyHandler.ArchComponents() {
    add("implementation", Dependencies.ArchComponents.room)
    add("implementation", Dependencies.ArchComponents.viewModelliveData)
    add("implementation", Dependencies.ArchComponents.liveDataKtx)
    add("implementation", Dependencies.ArchComponents.viewmodelKtx)
    add("implementation", Dependencies.ArchComponents.roomKtx)
    add("kapt", Dependencies.ArchComponents.roomComplier)
}


fun DependencyHandler.TestDependencies() {
    add("testImplementation", Dependencies.TestDependencies.junitTestDep)
    add("testImplementation", Dependencies.TestDependencies.mockitoDep)
    add("testImplementation", Dependencies.TestDependencies.roomDbTestHelper)
    add("testImplementation", Dependencies.TestDependencies.liveDataTestHelper)
    add("testImplementation", Dependencies.TestDependencies.couroutineTestDep)
    add("androidTestImplementation", Dependencies.TestDependencies.androidJunitTestDep)
    add("androidTestImplementation", Dependencies.TestDependencies.androidEspressoTestDep)
}

fun DependencyHandler.DevTools() {
    add("implementation", Dependencies.DevTools.stethoDep)
}

fun DependencyHandler.appDependency() {
    androidDep()
    UILibraries()
    kotlinCoroutines()
    ArchComponents()
    DI()
    DevTools()
    TestDependencies()
}
