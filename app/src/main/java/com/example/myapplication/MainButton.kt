package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_button.*

class MainButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_button)

        mainbtn1.setOnClickListener {
            Toast.makeText(this@MainButton, "학부공지사항 화면 전환", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, Notice::class.java))
        }
        mainbtn2.setOnClickListener {
            Toast.makeText(this@MainButton, "교수/연구실 화면 전환", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, Lab::class.java))
        }
        mainbtn3.setOnClickListener {
            Toast.makeText(this@MainButton, "학사일정 화면 전환", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, Calendar::class.java))
        }
        mainbtn4.setOnClickListener {
            Toast.makeText(this@MainButton, "학부사무실 화면 전환", Toast.LENGTH_SHORT).show()
        }
    }

}