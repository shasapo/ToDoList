package com.example.shasapo.todolist

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_todo.*


class ToDoDetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_todo)

        val bundle: Bundle = intent.extras

        titleToDo.text = bundle.getString("judul")
        date.text = bundle.getLong("date").toString()
        when(bundle.getString("priority")) {
            "High" -> priority.setBackgroundColor(Color.RED)
            "Medium" -> priority.setBackgroundColor(Color.GREEN)
            "Low" -> priority.setBackgroundColor(Color.BLUE)
            else -> priority.setBackgroundColor(Color.BLACK)
        }
        description.text = bundle.getString("detail")


    }

}