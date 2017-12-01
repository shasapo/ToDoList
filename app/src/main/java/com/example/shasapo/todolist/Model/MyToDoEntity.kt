package com.example.shasapo.todolist.Model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class MyToDoEntity(
        @PrimaryKey(autoGenerate = true)
        val id: Int,
        val title: String,
        val date: Long,
        val priority: String,
        val detail: String? = null
)