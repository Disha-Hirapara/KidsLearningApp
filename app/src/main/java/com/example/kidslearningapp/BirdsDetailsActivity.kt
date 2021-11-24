package com.example.kidslearningapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class BirdsDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birds_details)

        var alpha = intent.getStringExtra("bname")!!.lowercase()
        var iv = findViewById<ImageView>(R.id.imageView5)

        var iid = resources.getIdentifier(alpha,"drawable",packageName)
        iv.setImageResource(iid)

        var mid = resources.getIdentifier(alpha,"raw",packageName)
        var mp = MediaPlayer.create(applicationContext,mid)
        if(mp.isPlaying)
            mp.stop()
        else
            mp.start()
        //mp = MediaPlayer.create(this, mid)

    }
}