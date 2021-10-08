package com.example.callbacksapp

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Toast.makeText(this,"MainActivity3", Toast.LENGTH_SHORT).show();

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