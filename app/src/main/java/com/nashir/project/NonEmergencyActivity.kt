package com.nashir.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.widget.ButtonBarLayout

class NonEmergencyActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_non_emergency)

        val gird : ImageButton = findViewById(R.id.grid)
        gird.setOnClickListener(this)

        val exit : ImageButton = findViewById(R.id.back)
        exit.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.grid -> {
                    val intent = Intent(this@NonEmergencyActivity, CardActivity::class.java)
                    startActivity(intent)
                }
            }
        }

        if (v != null) {
            when(v.id) {
                R.id.back -> {
                    val intent = Intent(this@NonEmergencyActivity, MenuActivity::class.java)
                    startActivity(intent)
                }
            }
        }

        TODO("Not yet implemented")
    }
}