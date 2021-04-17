package com.example.mobszoftlabbooks.mock

import com.example.mobszoftlabbooks.model.Volume
import com.example.mobszoftlabbooks.model.Volumes
import com.example.mobszoftlabbooks.network.BooksApi
import retrofit2.Call

class MockBooksApi: BooksApi {
    override fun searchBooks(q: String?, key: String?): Call<Volumes> {
        TODO("Not yet implemented")
    }

    override fun addInventory(body: Volume?, key: String?): Call<Void> {
        TODO("Not yet implemented")
    }

    override fun searchBook(id: String?, key: String?): Call<Volume> {
        TODO("Not yet implemented")
    }

    override fun volumesIdPut(id: String?, key: String?, body: Volume?): Call<Void> {
        TODO("Not yet implemented")
    }

    override fun volumesIdDelete(id: String?, key: String?): Call<Void> {
        TODO("Not yet implemented")
    }
}