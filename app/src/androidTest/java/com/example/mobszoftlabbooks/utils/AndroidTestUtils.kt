package com.example.mobszoftlabbooks.utils
import android.support.test.InstrumentationRegistry
import com.example.mobszoftlabbooks.AndroidTestModule
import com.example.mobszoftlabbooks.DaggerMobSzoftlabBooksComponent
import com.example.mobszoftlabbooks.MobSzoftlabBooks
import com.example.mobszoftlabbooks.ui.UIModule

object AndroidTestUtils {

    fun setTestInjector() {
        val instrumentation = InstrumentationRegistry.getInstrumentation()
        val app = instrumentation.targetContext.applicationContext as MobSzoftlabBooks
        val androidTestComponent = DaggerMobSzoftlabBooksComponent.builder().uIModule(UIModule(app)).build()

//        val androidTestComponent = DaggerAndroidTestComponent.builder().androidTestModule(
//            AndroidTestModule(app)
//        ).build()
        app.injector = androidTestComponent
    }

    fun setProdutionInjector() {
        val instrumentation = InstrumentationRegistry.getInstrumentation()
        val app = instrumentation.targetContext.applicationContext as MobSzoftlabBooks

        val androidTestComponent = DaggerMobSzoftlabBooksComponent.builder().uIModule(UIModule(app)).build()
        app.injector = androidTestComponent
    }
}
