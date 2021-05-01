package com.example.mobszoftlabbooks

import android.content.Context
import com.example.mobszoftlabbooks.interactor.book.BookInteractor
import com.example.mobszoftlabbooks.ui.book.BookPresenter
import com.example.mobszoftlabbooks.ui.main.MainPresenter
import com.example.mobszoftlabbooks.utils.UiExecutor
import dagger.Module
import dagger.Provides

import java.util.concurrent.Executor
import javax.inject.Singleton

@Module
class TestModule(private val context: Context) {

    @Provides
    fun provideContext() = context


    @Provides
    @Singleton
    fun provideMainPresenter(executor: Executor, bookInteractor: BookInteractor) = MainPresenter(executor, bookInteractor)

    @Provides
    @Singleton
    fun provideBooksPresenter(executor: Executor, bookInteractor: BookInteractor) = BookPresenter(executor, bookInteractor)

    @Provides
    @Singleton
    fun provideNetworkExecutor(): Executor = UiExecutor()
}
