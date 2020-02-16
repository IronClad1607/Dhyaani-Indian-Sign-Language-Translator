package com.systemtron.isl.activities

import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.systemtron.isl.R
import kotlinx.android.synthetic.main.activity_conversion.*

class ConversionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversion)

        val sentence = intent.getStringExtra("sentence")
        val senArray = sentence.toCharArray()

        val handler: Handler? = null

        for (char in senArray) {
            val fChar = char.toLowerCase()

            handler!!.postDelayed({
                locate(ivShow, fChar)
            }, 500)


        }
    }


    private fun locate(ivShow: ImageView, fChar: Char) {
        when (fChar) {
            'a' -> {
                ivShow.setImageResource(R.drawable.a)
            }
            'b' -> {
                ivShow.setImageResource(R.drawable.b)
            }
            'c' -> {
                ivShow.setImageResource(R.drawable.c)
            }
            'd' -> {
                ivShow.setImageResource(R.drawable.d)
            }
            'e' -> {
                ivShow.setImageResource(R.drawable.e)
            }
            'f' -> {
                ivShow.setImageResource(R.drawable.f)
            }
            'g' -> {
                ivShow.setImageResource(R.drawable.g)
            }
            'h' -> {
                ivShow.setImageResource(R.drawable.h)
            }
            'i' -> {
                ivShow.setImageResource(R.drawable.i)
            }
            'j' -> {
                ivShow.setImageResource(R.drawable.j)
            }
            'k' -> {
                ivShow.setImageResource(R.drawable.k)
            }
            'l' -> {
                ivShow.setImageResource(R.drawable.l)
            }
            'm' -> {
                ivShow.setImageResource(R.drawable.m)
            }
            'n' -> {
                ivShow.setImageResource(R.drawable.n)
            }
            'o' -> {
                ivShow.setImageResource(R.drawable.o)
            }
            'p' -> {
                ivShow.setImageResource(R.drawable.p)
            }
            'q' -> {
                ivShow.setImageResource(R.drawable.q)
            }
            'r' -> {
                ivShow.setImageResource(R.drawable.r)
            }
            's' -> {
                ivShow.setImageResource(R.drawable.s)
            }
            't' -> {
                ivShow.setImageResource(R.drawable.t)
            }
            'u' -> {
                ivShow.setImageResource(R.drawable.u)
            }
            'v' -> {
                ivShow.setImageResource(R.drawable.v)
            }
            'w' -> {
                ivShow.setImageResource(R.drawable.w)
            }
            'x' -> {
                ivShow.setImageResource(R.drawable.x)
            }
            'y' -> {
                ivShow.setImageResource(R.drawable.y)
            }
            'Z' -> {
                ivShow.setImageResource(R.drawable.z)
            }
            ' ' -> {
                ivShow.setImageResource(R.drawable.space)
            }
            else -> {
                ivShow.setImageResource(R.drawable.fii)
            }
        }
    }
}
