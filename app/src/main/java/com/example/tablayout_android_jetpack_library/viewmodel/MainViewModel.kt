package com.example.tablayout_android_jetpack_library.viewmodel

import androidx.lifecycle.MutableLiveData

import androidx.lifecycle.ViewModel
import androidx.viewpager.widget.ViewPager
import androidx.databinding.ObservableField

class MainViewModel : ViewModel() {
    val viewPager: ObservableField<ViewPager> = ObservableField()

    // Additional properties and methods with logic
    val tabTitles: List<String> = listOf("Tab 1", "Tab 2", "Tab 3")

    // Logic to handle tab selection
    fun onTabSelected(position: Int) {
        // Add your logic here
    }
}
