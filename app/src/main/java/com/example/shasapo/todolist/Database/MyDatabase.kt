package com.example.shasapo.todolist.Database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.shasapo.todolist.Dao.MyToDoDao
import com.example.shasapo.todolist.Model.MyToDoEntity


@Database(entities = arrayOf(MyToDoEntity::class), version = 1)
abstract class MyDatabase: RoomDatabase() {
    abstract fun myToDoDao(): MyToDoDao
}