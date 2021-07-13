package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Bookadapter (var booklist:List<Booklist>):RecyclerView.Adapter<Bookadapter.BookadapterHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookadapterHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.book_list, parent,false)
        return BookadapterHolder(view)
    }

    override fun onBindViewHolder(holder: BookadapterHolder, position: Int) {
        var currentbook=booklist[position]
        holder.etName.text=currentbook.bookName
        holder.ettitle.text=currentbook.booktitle
        holder.etpage.text=currentbook.bookpage

    }

    override fun getItemCount(): Int =
        booklist.size



    class BookadapterHolder(itemView: View):RecyclerView.ViewHolder(itemView){
     var etName=itemView.findViewById<TextView>(R.id.etName)
        var ettitle=itemView.findViewById<TextView>(R.id.etTitle)
        var etpage=itemView.findViewById<TextView>(R.id.etPage)

    }
}
