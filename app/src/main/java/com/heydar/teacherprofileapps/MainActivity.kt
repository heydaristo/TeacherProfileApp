package com.heydar.teacherprofileapps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.login_button)
        val btnjurusan = findViewById<Button>(R.id.jurusansmk_button)
        btn.setOnClickListener {
            val Intent = Intent(this,Biodata::class.java)
            startActivity(Intent)
        }
        btnjurusan.setOnClickListener {
            val Intent = Intent(this,JurusanSmk::class.java)
            startActivity(Intent)
        }
    }
}