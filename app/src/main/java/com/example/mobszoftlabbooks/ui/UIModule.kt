package com.example.mobszoftlabbooks.ui

import android.content.Context
import com.example.mobszoftlabbooks.interactor.book.BookInteractor
import com.example.mobszoftlabbooks.ui.main.MainPresenter
import com.example.mobszoftlabbooks.ui.book.BookPresenter
import dagger.Module
import dagger.Provides
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import javax.inject.Singleton

@Module
class UIModule(private val context: Context) {

    @Provides
    fun context() = context

    @Provides
    @Singleton
    fun mainPresenter(executor: Executor, bookInteractor: BookInteractor) = MainPresenter(executor, bookInteractor)

    @Provides
    @Singleton
    fun booksPresenter(executor: Executor, bookInteractor: BookInteractor) = BookPresenter(executor, bookInteractor)

    @Provides
    @Singleton
    fun networkExecutor(): Executor = Executors.newFixedThreadPool(1)


}
