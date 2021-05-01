package com.example.mobszoftlabbooks.mock

import com.example.mobszoftlabbooks.model.Volume
import com.example.mobszoftlabbooks.model.VolumeInfo
import com.example.mobszoftlabbooks.model.Volumes
import com.example.mobszoftlabbooks.network.BooksApi
import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.Query
import java.io.IOException

class MockBooksApi: BooksApi {
    override fun searchBooks (@Query("q") q: String?, @Query("key") key: String?): Call<Volumes> {
        val volumes = Volumes()
        volumes.kind = "books#volumes"
        volumes.totalItems = 2

        val item1 = Volume()
        item1.kind = "books#volume"
        item1.id = "NcuHDwAAQBAJ"
        item1.etag = "ZndzG8ghq9I"
        item1.selfLink = "https://www.googleapis.com/books/v1/volumes/NcuHDwAAQBAJ"

        val volumeInfo1 = VolumeInfo()
        volumeInfo1.title = "Head First Kotlin"
        volumeInfo1.authors =  listOf("Dawn Griffiths", "David Griffiths")
        volumeInfo1.publisher = "O'Reilly Media"
        volumeInfo1.publishedDate = "2019-02-13"
        volumeInfo1.description = "What will you learn from this book? Head First Kotlin is a complete introduction to coding in Kotlin. This hands-on book helps you learn the Kotlin language with a unique method that goes beyond syntax and how-to manuals and teaches you how to think like a great Kotlin developer. You’ll learn everything from language fundamentals to collections, generics, lambdas, and higher-order functions. Along the way, you’ll get to play with both object-oriented and functional programming. If you want to really understand Kotlin, this is the book for you. Why does this book look so different? Based on the latest research in cognitive science and learning theory, Head First Kotlin uses a visually rich format to engage your mind rather than a text-heavy approach that puts you to sleep. Why waste your time struggling with new concepts? This multisensory learning experience is designed for the way your brain really works."
        volumeInfo1.pageCount = 480

        item1.volumeInfo = volumeInfo1

        val item2 = Volume()
        item2.kind = "books#volume"
        item2.id = "UYLVDwAAQBAJ"
        item2.etag = "Up2PGNgLO7I"
        item2.selfLink = "https://www.googleapis.com/books/v1/volumes/UYLVDwAAQBAJ"

        val volumeInfo2 = VolumeInfo()
        volumeInfo2.title = "Android Studio 3.6 Development Essentials - Kotlin Edition"
        volumeInfo2.authors =  listOf("Neil Smyth")
        volumeInfo2.publisher = "eBookFrenzy"
        volumeInfo2.publishedDate = "2020-03-09"
        volumeInfo2.description = "Fully updated for Android Studio 3.6, Android 10 (Q), Android Jetpack and the modern architectural guidelines and components, the goal of this book is to teach the skills necessary to develop Android-based applications using the Kotlin programming language. Beginning with the basics, this book provides an outline of the steps necessary to set up an Android development and testing environment followed by an introduction to programming in Kotlin including data types, flow control, functions, lambdas, coroutines and object-oriented programming. An overview of Android Studio is included covering areas such as tool windows, the code editor and the Layout Editor tool. An introduction to the architecture of Android is followed by an in-depth look at the design of Android applications and user interfaces using the Android Studio environment. Chapters are also included covering the Android Architecture Components including view models, lifecycle management, Room databases, app navigation, live data and data binding. More advanced topics such as intents are also covered, as are touch screen handling, gesture recognition and the playback and recording of audio. This edition of the book also covers printing, transitions, cloud-based file storage and foldable device support. The concepts of material design are also covered in detail, including the use of floating action buttons, Snackbars, tabbed interfaces, card views, navigation drawers and collapsing toolbars. In addition to covering general Android development techniques, the book also includes Google Play specific topics such as implementing maps using the Google Maps Android API, and submitting apps to the Google Play Developer Console. Other key features of Android Studio 3.6 and Android 10 are also covered in detail including the Layout Editor, the ConstraintLayout and ConstraintSet classes, constraint chains and barriers, view binding, direct reply notifications and multi-window support. Chapters also cover advanced features of Android Studio such as App Links, Dynamic Feature Modules, the Android Studio Profiler and Gradle build configuration. Assuming you already have some programming experience, are ready to download Android Studio and the Android SDK, have access to a Windows, Mac or Linux system and ideas for some apps to develop, you are ready to get started."
        volumeInfo2.pageCount = 816

        item2.volumeInfo = volumeInfo2

        volumes.items = listOf(item1, item2)

        val call = object : Call<Volumes> {
            @Throws(IOException::class)
            override fun execute(): Response<Volumes> {
                return Response.success(volumes)
            }

            override fun enqueue(callback: Callback<Volumes>) {

            }

            override fun isExecuted(): Boolean {
                return false
            }

            override fun cancel() {

            }

            override fun isCanceled(): Boolean {
                return false
            }

            override fun clone(): Call<Volumes> {
                return this
            }

            override fun request(): Request? {
                return null
            }
        }

        return call



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