package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Collections.list

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayBook()
        var recyclerView=findViewById<RecyclerView>(R.id.rvBook)
        recyclerView.layoutManager=LinearLayoutManager(baseContext)
        recyclerView.adapter
    }
    fun displayBook():List<Booklist>{
        return listOf<Booklist>(Booklist("Born a crime","Trevor Noah's mom wed","34"),
            Booklist("Matilda","Matilda at school","300"),
            Booklist("The river and the source","The river on the hill","340"),
            Booklist("Coding","why we should code","204"),
            Booklist("Born a crime","Trevor Noah's mom wed","34"))
    }

}
