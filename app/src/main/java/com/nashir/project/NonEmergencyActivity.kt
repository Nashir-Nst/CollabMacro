package com.nashir.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class NonEmergencyListActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_non_emergency_list)

        val exit : Button = findViewById(R.id.back_image2)
        exit.setOnClickListener(this)

        val grid : ImageView = findViewById(R.id.tgrid_image4)
        grid.setOnClickListener(this)

        val next : ImageView = findViewById(R.id.list_image1)
        next.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
       when (v?.id){
           R.id.back_image2 -> {
               val backintent = Intent(this@NonEmergencyListActivity, MenuActivity::class.java)
               startActivity(backintent)
           }
           R.id.tgrid_image4 -> {
               val gridintent = Intent(this@NonEmergencyListActivity, NonEmergencyGridActivity::class.java)
               startActivity(gridintent)
           }
           R.id.list_image1 -> {
               val nextintent = Intent(this@NonEmergencyListActivity, PenanggananAsmaActivity::class.java)
               startActivity(nextintent)
           }
       }
    }
}