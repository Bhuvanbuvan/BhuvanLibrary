package com.example.androidlibrary

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.android_demo_lib.helloworld

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
	super.onCreate(savedInstanceState)
	enableEdgeToEdge()
	setContentView(R.layout.activity_main)
	val helloworld=helloworld()
	helloworld.add(50,40)
  }
}