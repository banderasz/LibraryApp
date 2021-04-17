package com.example.mobszoftlabbooks.network

import com.example.mobszoftlabbooks.model.Volume
import com.example.mobszoftlabbooks.model.Volumes
import retrofit2.Call
import retrofit2.http.*

interface BooksApi {
    /**
     * searches books
     *
     * @param q pass an optional search string for looking up books
     * @param key API key
     * @return Call<Volumes>
    </Volumes> */
    @GET("volumes")
    fun searchBooks(
        @Query("q") q: String?, @Query("key") key: String?
    ): Call<Volumes>

    /**
     * adds a book
     *
     * @param body Created book object
     * @param key API key
     * @return Call<Void>
    </Void> */
    @POST("volumes")
    fun addInventory(
        @Body body: Volume?, @Query("key") key: String?
    ): Call<Void>

    /**
     * searches book
     *
     * @param id pass an id
     * @param key API key
     * @return Call<Volume>
    </Volume> */
    @GET("volumes/{id}")
    fun searchBook(
        @Path("id") id: String?, @Query("key") key: String?
    ): Call<Volume>

    /**
     * Updated Book
     *
     * @param id Id that need to be updated
     * @param key API key
     * @param body Updated user object
     * @return Call<Void>
    </Void> */
    @PUT("volumes/{id}")
    fun volumesIdPut(
        @Path("id") id: String?, @Query("key") key: String?, @Body body: Volume?
    ): Call<Void>

    /**
     * Delete book
     *
     * @param id The id that needs to be deleted
     * @param key API key
     * @return Call<Void>
    </Void> */
    @DELETE("volumes/{id}")
    fun volumesIdDelete(
        @Path("id") id: String?, @Query("key") key: String?
    ): Call<Void>
}