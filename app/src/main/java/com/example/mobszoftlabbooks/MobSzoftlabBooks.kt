package com.example.mobszoftlabbooks

import android.app.Application
import com.example.mobszoftlabbooks.ui.UIModule

class MobSzoftlabBooks  : Application() {
    lateinit var injector: MobSzoftlabBooksComponent

    override fun onCreate() {
        super.onCreate()
        injector = DaggerMobSzoftlabBooksComponent.builder().uIModule(UIModule(this)).build()
    }
}