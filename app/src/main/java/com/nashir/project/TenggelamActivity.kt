package com.nashir.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.VideoView

class TenggelamActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tenggelam)

        val back: ImageButton = findViewById(R.id.back6)
        back.setOnClickListener(this)

        val VideoTenggelam: VideoView = findViewById(R.id.video_tenggelam)
        VideoTenggelam.setVideoPath("android.resource://" + packageName + "/" + R.raw.tenggelam)
        VideoTenggelam.start()

        val mediaController = MediaController(this)
        mediaController.setAnchorView(VideoTenggelam)
        VideoTenggelam.setMediaController(mediaController)


    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.back6 -> {
                val backintent = Intent(this@TenggelamActivity, NonEmergencyActivity::class.java)
                startActivity(backintent)
            }
        }
    }
}