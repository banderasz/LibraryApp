package com.example.mobszoftlabbooks

import com.example.mobszoftlabbooks.interactor.InteractorModule
import com.example.mobszoftlabbooks.network.NetworkModule
import com.example.mobszoftlabbooks.ui.UIModule
import com.example.mobszoftlabbooks.ui.book.BookDetailsActivity
import com.example.mobszoftlabbooks.ui.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UIModule::class, NetworkModule::class, InteractorModule::class])
interface MobSzoftlabBooksComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(mainActivity: BookDetailsActivity)
}