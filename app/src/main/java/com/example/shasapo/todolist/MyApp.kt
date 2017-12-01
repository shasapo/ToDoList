package com.example.shasapo.todolist

import android.app.Application
import android.arch.persistence.room.Room
import com.example.shasapo.todolist.Database.MyDatabase




class MyApp : Application() {
    companion object {
        var database : MyDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        MyApp.database = Room.databaseBuilder(this, MyDatabase::class.java, "todo-db").build()
    }
}
