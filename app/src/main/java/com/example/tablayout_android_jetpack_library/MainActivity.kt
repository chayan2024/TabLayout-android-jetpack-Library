package com.example.tablayout_android_jetpack_library
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.tablayout_android_jetpack_library.adapter.PagerAdapter
import com.example.tablayout_android_jetpack_library.databinding.ActivityMainBinding
import com.example.tablayout_android_jetpack_library.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Initialize ViewModel
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        // Set ViewModel in binding
        binding.viewModel = viewModel

        // Set up ViewPager with PagerAdapter
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewModel.viewPager.set(viewPager)
        val pagerAdapter = PagerAdapter(supportFragmentManager)
        viewPager.adapter = pagerAdapter
    }
}

