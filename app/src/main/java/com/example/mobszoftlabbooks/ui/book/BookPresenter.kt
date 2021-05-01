package com.example.mobszoftlabbooks.ui.book

import com.example.mobszoftlabbooks.interactor.book.BookInteractor
import com.example.mobszoftlabbooks.interactor.book.event.UpdateFavoriteEvent
import com.example.mobszoftlabbooks.model.Volume
import com.example.mobszoftlabbooks.ui.Presenter
import com.example.mobszoftlabbooks.ui.main.MainScreen
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.util.concurrent.Executor
import javax.inject.Inject

class BookPresenter @Inject constructor(private val executor: Executor, private val bookInteractor: BookInteractor) : Presenter<BookScreen>()  {
    private lateinit var selectedBook: Volume

    override fun attachScreen(screen: BookScreen) {
        super.attachScreen(screen)
        EventBus.getDefault().register(this)
    }

    override fun detachScreen() {
        EventBus.getDefault().unregister(this)
        super.detachScreen()
    }

    fun setSelectedCountry(book: Volume) {
        selectedBook = book
    }

//    fun updateFavoriteStatus() {
//        executor.execute {
//            bookInteractor.
//            checkIfFavourite(selectedBook)
//        }
//    }
//
//    fun favoriteBook() {
//        executor.execute {
//            bookInteractor.favoriteBook(selectedBook)
//        }
//    }
//
//    fun unfavoriteBook() {
//        executor.execute {
//            bookInteractor.unfavoriteBook(selectedBook)
//        }
//    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEventMainThread(event: UpdateFavoriteEvent) {
        if (screen != null) {
            screen?.updateFavoriteState(event.isFavorite)
        }
    }
}