package com.example.kidslearningapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class AlphabetsDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabets_details)

        var alpha = intent.getStringExtra("alpha")!!.lowercase()
        var iv = findViewById<ImageView>(R.id.imageView)

        var iid = resources.getIdentifier(alpha,"drawable",packageName)
        iv.setImageResource(iid)

        var mid = resources.getIdentifier(alpha,"raw",packageName)
        var mp = MediaPlayer.create(applicationContext,mid)
        mp.start()

    }
}