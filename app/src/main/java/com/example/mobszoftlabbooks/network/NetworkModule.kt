package com.example.mobszoftlabbooks.network

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NetworkModule {


    @Provides
    @Singleton
    fun provideBooksApi(): BooksApi {
        TODO("Not yet implemented")
    }
}