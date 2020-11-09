package com.example.draweractivity

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View


class CustomView : View {

    constructor(context: Context) : this(context, null)

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    companion object {
        var DELTA = 10
    }


    private var mPaint = Paint()
    lateinit var mCircle: MagicCircle
    lateinit var mCircle2: MagicCircle
    val magicArray = Array<MagicCircle>(50) { MagicCircle(1400, 2040) }
    // MagicCircle(1400, 2385)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        magicArray.forEach {
            it.move()
            canvas?.drawCircle(it.cx, it.cy, it.rad, it.mPaint)
        }
        invalidate()
    }

    @SuppressLint("DrawAllocation")
    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bot: Int) {
        super.onLayout(changed, left, top, right, bot)
        mCircle = MagicCircle(width, height)
    }


    private fun init() {
        mPaint.color = Color.BLUE
    }


}