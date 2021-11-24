package com.example.kidslearningapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    var tabTitle = arrayOf("Alphabets","Fruits","Animal","Birds","Consonant")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        var pager = findViewById<ViewPager2>(R.id.viewPager2)
        pager.adapter = MyAdapter(supportFragmentManager,lifecycle)

        TabLayoutMediator(tabLayout, pager){
            tabs, position ->
            tabs.text = tabTitle[position]
        }.attach()

    }
}