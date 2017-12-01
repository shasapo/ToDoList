package com.example.shasapo.todolist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.example.shasapo.todolist.Model.MyToDoEntity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var toDoAdapter: ToDoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myToDoList = listOf(
            MyToDoEntity(1,"Eat",212L,"High"),
            MyToDoEntity(1,"Sleep",212L,"Medium"),
            MyToDoEntity(1,"Repeat",212L,"Low")
        )

        toDoAdapter = ToDoAdapter()
        toDoAdapter.listOfTodos = myToDoList

        todoList.layoutManager = LinearLayoutManager(this)
        todoList.adapter = toDoAdapter
        todoList.adapter.notifyDataSetChanged()

        Log.e("kektai", "size ${todoList.adapter.itemCount}")
        Log.e("kektai", "size x ${myToDoList.size}")
    }
}
