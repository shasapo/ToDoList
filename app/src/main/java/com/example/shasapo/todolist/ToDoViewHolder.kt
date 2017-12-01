package com.example.shasapo.todolist

import android.content.Intent
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import com.example.shasapo.todolist.Model.MyToDoEntity
import kotlinx.android.synthetic.main.todo_item_row.view.*
import java.util.*

class ToDoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun bind(myToDoEntity: MyToDoEntity){
        itemView.tvTitle.text = myToDoEntity.title
        itemView.tvDate.text = myToDoEntity.date.toString()
        val rnd = Random()
        val color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
        itemView.setBackgroundColor(color)

        itemView.setOnClickListener {
            Log.e("wtf","manggil ga")
            val context = itemView.context
            val detailToDoIntent = Intent(context, ToDoDetailActivity::class.java)
            detailToDoIntent.putExtra("id", myToDoEntity.id)
            detailToDoIntent.putExtra("judul", myToDoEntity.title)
            detailToDoIntent.putExtra("date", myToDoEntity.date)
            detailToDoIntent.putExtra("priority", myToDoEntity.priority)
            detailToDoIntent.putExtra("detail", myToDoEntity.detail)
            context.startActivity(detailToDoIntent)
        }
    }


}