package com.nashir.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton


class MenuActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnnonemergency : Button = findViewById(R.id.btnnonemergency)
        btnnonemergency.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.btnnonemergency -> {
                    val intent = Intent(this@MenuActivity, NonEmergencyActivity::class.java)
                    startActivity(intent)
                }
            }
        }
//        TODO("Not yet implemented")
    }
}