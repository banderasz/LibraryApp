package com.example.mobszoftlabbooks

import com.example.mobszoftlabbooks.interactor.InteractorModule
import com.example.mobszoftlabbooks.mock.MockNetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MockNetworkModule::class, AndroidTestModule::class, InteractorModule::class])
interface AndroidTestComponent : MobSzoftlabBooksComponent