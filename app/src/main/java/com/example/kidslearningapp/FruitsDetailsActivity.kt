package com.example.kidslearningapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FruitsDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits_details)


        var alpha = intent.getStringExtra("fname")!!.lowercase()
        var iv = findViewById<ImageView>(R.id.imageView2)

        var iid = resources.getIdentifier(alpha,"drawable",packageName)
        iv.setImageResource(iid)

        var mid = resources.getIdentifier(alpha,"raw",packageName)
        var mp = MediaPlayer.create(applicationContext,mid)
        mp.start()
    }
}