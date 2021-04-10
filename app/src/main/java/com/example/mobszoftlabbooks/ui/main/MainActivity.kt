package com.example.mobszoftlabbooks.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mobszoftlabbooks.R

class MainActivity : AppCompatActivity(), MainScreen {

    override fun onStart() {
        super.onStart()
        MainPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        MainPresenter.detachScreen()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showBooks(bookSearchTerm: String) {
        TODO("Not yet implemented")
    }
}