package com.example.kidslearningapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class GujaratiAlphabetsDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gujarati_alphabets_details)

        var cons = intent.getStringExtra("Consonant")
        Toast.makeText(applicationContext,cons,Toast.LENGTH_LONG).show()

        var tv = findViewById<TextView>(R.id.textView)


        when(cons){
            "a1" -> {tv.setText("કલમ")}
            "a2" -> {tv.setText("ખટારો")}
            "a3" -> {tv.setText("ગણપતિ")}
            "a4" -> {tv.setText("ઘર")}
            "a5" -> {tv.setText("ચક્લી")}
            "a6" -> {tv.setText("છત્રી")}
            "a7" -> {tv.setText("જમરૂખ")}
            "a8" -> {tv.setText("ઝબલું")}
            "a9" -> {tv.setText("ટપાલી")}
            "a10" -> {tv.setText("ઠળીયો")}
            "a11" -> {tv.setText("ડગલો")}
            "a12" -> {tv.setText("ઢગલો")}
            "a13" -> {tv.setText("બાણ")}
            "a14" -> {tv.setText("તલવાર")}
            "a15" -> {tv.setText("થરમોસ")}
            "a16" -> {tv.setText("દડો")}
            "a17" -> {tv.setText("ધજા")}
            "a18" -> {tv.setText("નળ")}
            "a19" -> {tv.setText("પતંગ")}
            "a20" -> {tv.setText("ફટાકડાં")}
            "a21" -> {tv.setText("બકરી")}
            "a22" -> {tv.setText("ભમરડો")}
            "a23" -> {tv.setText("મરચું")}
            "a24" -> {tv.setText("યતિષ")}
            "a25" -> {tv.setText("રમકડાં")}
            "a26" -> {tv.setText("લખોટા")}
            "a27" -> {tv.setText("વહાણ")}
            "a28" -> {tv.setText("શરણાઈ")}
            "a29" -> {tv.setText("ષટ્કોણ")}
            "a30" -> {tv.setText("સસલું")}
            "a31" -> {tv.setText("હરણ")}
            "a32" -> {tv.setText("ફળ")}
            "a33" -> {tv.setText("ક્ષત્રિય")}
            "a34" -> {tv.setText("જ્ઞાન")}
        }



        var iv = findViewById<ImageView>(R.id.imageView4)

        var iid = resources.getIdentifier(cons,"drawable",packageName)
        iv.setImageResource(iid)

        var mid = resources.getIdentifier(cons,"raw",packageName)
        var mp = MediaPlayer.create(this,mid)
        mp.start()
    }
}