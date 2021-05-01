package com.example.mobszoftlabbooks.model

import android.content.Context
import androidx.room.Room
import com.example.mobszoftlabbooks.model.database.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule(private val context: Context) {
    @Provides
    fun context() = context

    @Provides
    @Singleton
    fun provideDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java, "favourites-db"
        ).build()
    }
}