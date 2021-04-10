package com.example.mobszoftlabbooks.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mobszoftlabbooks.R
import com.example.mobszoftlabbooks.injector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainScreen {

    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injector.inject(this)
    }

    override fun onStart() {
        super.onStart()
        mainPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        mainPresenter.detachScreen()
    }

    override fun showBooks(bookSearchTerm: String) {
        TODO("Not yet implemented")
    }
}