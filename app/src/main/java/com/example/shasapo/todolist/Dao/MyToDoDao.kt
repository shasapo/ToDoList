package com.example.shasapo.todolist.Dao

import android.arch.persistence.room.*
import com.example.shasapo.todolist.Model.MyToDoEntity
import io.reactivex.Flowable

@Dao
interface MyToDoDao{

    @Insert
    fun insertToDo(myToDoEntity: MyToDoEntity)

    @Update
    fun updateToDo(myToDoEntity: MyToDoEntity)

    @Delete
    fun deleteToDo(myToDoEntity: MyToDoEntity)

    @Query("SELECT * FROM MyToDoEntity")
    fun getAllToDo() : Flowable<List<MyToDoEntity>>

}