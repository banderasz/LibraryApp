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
    fun provideMainPresenter(bookInteractor: BookInteractor): MainPresenter {
        return uiModule.mainPresenter(bookInteractor)
    }

    @Provides
    @Singleton
    fun provideArtistsPresenter(bookInteractor: BookInteractor): BookPresenter {
        return uiModule.booksPresenter(bookInteractor)
    }


}