package com.example.shasapo.todolist

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.shasapo.todolist.Model.MyToDoEntity

class ToDoAdapter: RecyclerView.Adapter<ToDoViewHolder>(){

    var listOfTodos: List<MyToDoEntity> = emptyList()

    override fun getItemCount(): Int = listOfTodos.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ToDoViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.todo_item_row, parent, false)
        return  ToDoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ToDoViewHolder?, position: Int) {
        holder?.bind(listOfTodos[position])
    }

}
