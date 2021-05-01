package com.example.mobszoftlabbooks

import com.example.mobszoftlabbooks.interactor.InteractorModule
import com.example.mobszoftlabbooks.mock.MockNetworkModule
import com.example.mobszoftlabbooks.test.BookTest
import com.example.mobszoftlabbooks.test.MainTest
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MockNetworkModule::class, TestModule::class, InteractorModule::class])
interface TestComponent : MobSzoftlabBooksComponent {
    fun inject(bookTest: BookTest)
    fun inject(mainTest: MainTest)
}
