package com.example.kidslearningapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle) :FragmentStateAdapter (fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return  5
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return AlphabetsFragment()
            1 -> return FruitsFragment()
            2 -> return AnimalFragment()
            3 ->return BirdsFragment()
            4 ->return GujaratiAlphabetsFragment()
            else -> return AlphabetsFragment()
        }
    }
}