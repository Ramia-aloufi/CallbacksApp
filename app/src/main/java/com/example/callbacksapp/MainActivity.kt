package com.example.callbacksapp

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, Log.INFO.toString(), Toast.LENGTH_SHORT).show();
        btn = findViewById(R.id.button)
        Toast.makeText(this,"on MainActivity2" , Toast.LENGTH_SHORT).show();

        btn.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart Activity 1", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume Activity 1", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause Activity 1", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop Activity 1", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy Activity 1", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy: ")
    }
}