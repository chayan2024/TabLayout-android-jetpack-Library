package com.example.tablayout_android_jetpack_library.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tablayout_android_jetpack_library.fragment.FirstFragment
import com.example.tablayout_android_jetpack_library.fragment.SecondFragment
import com.example.tablayout_android_jetpack_library.fragment.ThirdFragment

class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }

    override fun getCount(): Int = 3
}
