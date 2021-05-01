package com.example.mobszoftlabbooks.ui.main

import com.example.mobszoftlabbooks.interactor.book.BookInteractor
import com.example.mobszoftlabbooks.interactor.book.event.GetBooksEvent
import com.example.mobszoftlabbooks.model.Volume
import com.example.mobszoftlabbooks.ui.Presenter
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.util.concurrent.Executor
import javax.inject.Inject

class MainPresenter @Inject constructor(private val executor: Executor, private val bookInteractor: BookInteractor) : Presenter<MainScreen>()  {

    override fun attachScreen(screen: MainScreen) {
        super.attachScreen(screen)
        EventBus.getDefault().register(this)
    }

    override fun detachScreen() {
        EventBus.getDefault().unregister(this)
        super.detachScreen()
    }

    fun showBooksSearchList(bookSearchTerm: String) {
        executor.execute {
            bookInteractor.getBooks(bookSearchTerm)
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEventMainThread(event: GetBooksEvent) {
        if (event.throwable != null) {
            event.throwable?.printStackTrace()
            if (screen != null) {
                screen?.showNetworkError(event.throwable?.message.orEmpty())
            }
        } else {
            if (screen != null) {
                if (event.books != null) {
                    screen?.showBooks(event.books as MutableList<Volume>)
                }

            }
        }
    }
}