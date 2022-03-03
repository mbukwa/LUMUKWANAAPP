package com.example.lumukwanaandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var Count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val TextViewName=findViewById<TextView>(R.id.textviewname)
        val buttonAdd=findViewById<Button>(R.id.buttonADD)
        val buttonSubtract=findViewById<Button>(R.id.buttonSUBTRACT)
        val TextViewCount=findViewById<TextView>(R.id.textviewcount)
         TextViewCount.text= Count.toString()
        buttonAdd.setOnClickListener {
            val newNumber =add()
        TextViewCount.text=newNumber.toString()
        }
       buttonSubtract.setOnClickListener {
           val newNumber =subtract()
           TextViewCount.text=newNumber.toString()
       }
    }
    private fun add():Int{
        val newNumber= Count++
        return newNumber
    }
    private fun subtract(): Int{
        val newNumber= Count--
        return newNumber
    }

}