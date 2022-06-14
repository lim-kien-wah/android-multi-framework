package com.example.androidhello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.cordovaHello.MainActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun openCDVActivity(view: View) {
        val intent = Intent(this,  MainActivity::class.java)
        // start your next activity
        startActivity(intent)
    }

    fun openNativeActivity(view: View) {
        val intent = Intent(this,  ChildActivity::class.java)
        // start your next activity
        startActivity(intent)
    }
}