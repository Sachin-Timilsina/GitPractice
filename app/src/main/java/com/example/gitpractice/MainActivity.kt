package com.example.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hello World. Second Commit")
        println("Local Change")
        println("Change 4")
        println("This line will be merged.")
        println("Hello from your friend.")
    }
}