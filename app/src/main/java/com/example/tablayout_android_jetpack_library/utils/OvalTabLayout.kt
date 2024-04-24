package com.example.tablayout_android_jetpack_library.utils

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import com.google.android.material.tabs.TabLayout
import kotlin.math.min

class OvalTabLayout(context: Context, attrs: AttributeSet) : TabLayout(context, attrs) {

    private val mOvalPaint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas: Canvas) {
        if (canvas != null) {
            super.onDraw(canvas)
        }

        // Draw oval-shaped tabs
        for (i in 0 until tabCount) {
            val tab = getTabAt(i)
            tab?.let {
                val tabWidth = width / tabCount.toFloat()
                val tabHeight = height.toFloat()
                val centerX = tabWidth * i + tabWidth / 2
                val centerY = tabHeight / 2
                val radius = min(tabWidth / 2, tabHeight / 2)
                canvas?.drawCircle(centerX, centerY, radius, mOvalPaint)
            }
        }
    }
}

