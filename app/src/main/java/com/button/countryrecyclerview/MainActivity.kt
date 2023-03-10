package com.button.countryrecyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var gridview : GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridview = findViewById(R.id. gridview)

        fillArray()
        var adapter = foodAdapter(this,nameList,imageList)
        gridview.adapter = adapter
        gridview.setOnItemClickListener { adapterView, view, position, id ->

            Toast.makeText(applicationContext,"You selected the ${nameList[position]}"
                ,Toast.LENGTH_LONG).show()
        }
    }

    fun fillArray(){
        nameList.add("Bird")
        nameList.add("Cat")
        nameList.add("Monkey")
        nameList.add("Lion")
        nameList.add("Rabbit")
        nameList.add("Elephant")
        nameList.add("Snake")
        nameList.add("Peacock")
        nameList.add("Hen")

        imageList.add(R.drawable.ok)
        imageList.add(R.drawable.ok1)
        imageList.add(R.drawable.ok2)
        imageList.add(R.drawable.ok3)
        imageList.add(R.drawable.ok4)
        imageList.add(R.drawable.ok5)
        imageList.add(R.drawable.ok6)
        imageList.add(R.drawable.ok7)
        imageList.add(R.drawable.ok8)



    }
}