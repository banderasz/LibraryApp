package com.example.mobszoftlabbooks

import android.app.Activity

val Activity.injector: MobSzoftlabBooksComponent
    get() {
        return (this.applicationContext as MobSzoftlabBooks).injector
    }