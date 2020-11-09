package com.example.draweractivity

import android.graphics.Color
import android.graphics.Paint
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import kotlin.random.Random
import kotlin.math.max

data class MagicCircle(val maxX: Int, val maxY: Int) : AnkoLogger {

    var mPaint = Paint()

    var cx: Float = Random.nextInt(50, 1400).toFloat()  //Random.nextInt(maxX).toFloat()
    var cy: Float = Random.nextInt(50, 2000).toFloat() //80F Random.nextInt(maxY).toFloat()
    var dx: Float = Random.nextInt(10).toFloat()
    var dy: Float = Random.nextInt(10).toFloat()
    val rad: Float = Random.nextInt(10, 75).toFloat()    //(20 - dx) + (20 - dy) + 20

    init {
        mPaint.color = Color.rgb(Random.nextInt(255), Random.nextInt(255), Random.nextInt(255))
    }


    fun move() {
        when {
            cx - rad !in 0F..((maxX - rad)) -> dx = -dx
            cy - rad !in 0F..((maxY - rad)) -> dy = -dy
        }
        cx += dx
        cy += dy
    }
}

