package com.example.callbacksapp

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    lateinit var btn6:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btn6 = findViewById(R.id.button2)
        btn6.setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }

        Toast.makeText(this,"on MainActivity2" , Toast.LENGTH_SHORT).show();

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart MainActivity2", Toast.LENGTH_SHORT).show();
        Log.d(ContentValues.TAG, "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume MainActivity2", Toast.LENGTH_SHORT).show();
        Log.d(ContentValues.TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause MainActivity2", Toast.LENGTH_SHORT).show();
        Log.d(ContentValues.TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"MainActivity2", Toast.LENGTH_SHORT).show();
        Log.d(ContentValues.TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy MainActivity2", Toast.LENGTH_SHORT).show();
        Log.d(ContentValues.TAG, "onDestroy: ")
    }
}