package com.example.mobszoftlabbooks

import android.content.Context
import com.example.mobszoftlabbooks.interactor.book.BookInteractor
import com.example.mobszoftlabbooks.ui.UIModule
import com.example.mobszoftlabbooks.ui.book.BookPresenter
import com.example.mobszoftlabbooks.ui.main.MainPresenter
import dagger.Module
import dagger.Provides
import java.util.concurrent.Executor
import javax.inject.Singleton

@Module
class AndroidTestModule(context: Context) {
    private val uiModule: UIModule = UIModule(context)

    @Provides
    fun provideContext(): Context {
        return uiModule.context()
    }

    @Provides
    @Singleton
    fun provideMainPresenter(executor: Executor, bookInteractor: BookInteractor): MainPresenter {
        return uiModule.mainPresenter(executor, bookInteractor)
    }

    @Provides
    @Singleton
    fun provideArtistsPresenter(executor: Executor, bookInteractor: BookInteractor): BookPresenter {
        return uiModule.booksPresenter(executor, bookInteractor)
    }


}