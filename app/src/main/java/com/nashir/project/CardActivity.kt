package com.nashir.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class NonEmergencyGridActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_non_emergency_grid)

        val exit : Button = findViewById(R.id.back_image6)
        exit.setOnClickListener(this)

        val list : ImageView = findViewById(R.id.tlist_image8)
        list.setOnClickListener(this)

        val next : ImageView = findViewById(R.id.grid_image1)
        next.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.back_image6 -> {
                val backintent = Intent(this@NonEmergencyGridActivity, MenuActivity::class.java)
                startActivity(backintent)
            }
            R.id.tlist_image8 -> {
                val listintent = Intent(this@NonEmergencyGridActivity, NonEmergencyActivity::class.java)
                startActivity(listintent)
            }
            R.id.grid_image1 -> {
                val nextintent = Intent(this@NonEmergencyGridActivity, PenanggananAsmaActivity::class.java)
                startActivity(nextintent)
            }
        }
    }
}