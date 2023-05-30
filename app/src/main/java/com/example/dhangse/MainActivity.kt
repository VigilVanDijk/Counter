package com.example.dhangse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1= findViewById<Button>(R.id.b1)
        val txt2= findViewById<TextView>(R.id.t2)
        val btn2= findViewById<Button>(R.id.b2)
        val btn3= findViewById<Button>(R.id.b4)
        var x=0
        btn1.setOnClickListener {

            if(x!=0)
            {
                x=x-1
            }
            txt2.text=x.toString()

        }

        btn2.setOnClickListener {
            x=0
            txt2.text=x.toString()
        }

        btn3.setOnClickListener {
            x=x+1
            txt2.text=x.toString()
        }

    }
}