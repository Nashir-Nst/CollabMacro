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

        val exit : ImageButton = findViewById(R.id.back)
        val gird : ImageButton = findViewById(R.id.grid)
        gird.setOnClickListener(this)
        exit.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
            when (v?.id) {

                R.id.back -> {
                    val backintent = Intent(this@NonEmergencyActivity, MenuActivity::class.java)
                    startActivity(backintent)
                }
                R.id.grid-> {
                    val girdintent = Intent(this@NonEmergencyActivity, CardActivity::class.java)
                    startActivity(girdintent)
        }

            }


    }
}


