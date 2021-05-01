package com.example.mobszoftlabbooks.model.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.mobszoftlabbooks.model.Volume

@Dao
interface BookDao {
    @Query("SELECT * FROM volume")
    fun getFavourites(): List<Volume>

    @Query("SELECT EXISTS(SELECT * FROM volume WHERE id = :id)")
    fun isFavourite(id : String) : Boolean

    @Insert
    fun favourite(book: Volume)

    @Delete
    fun unfavourite(book: Volume)
}