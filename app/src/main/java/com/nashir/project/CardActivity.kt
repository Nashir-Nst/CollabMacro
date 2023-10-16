package com.nashir.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class CardActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        val exit : ImageButton = findViewById(R.id.back1)
        exit.setOnClickListener(this)

        val urutan : ImageButton = findViewById(R.id.list)
        urutan.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.back1 -> {
                val backintent = Intent(this@CardActivity, NonEmergencyActivity::class.java)
                startActivity(backintent)
            }
            R.id.list-> {
                val listintent = Intent(this@CardActivity, NonEmergencyActivity::class.java)
                startActivity(listintent)
            }

        }


    }
}