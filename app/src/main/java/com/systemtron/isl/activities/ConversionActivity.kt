package com.systemtron.isl.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.systemtron.isl.R
import kotlinx.android.synthetic.main.activity_conversion.*

class ConversionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversion)

        val sentence = intent.getStringExtra("sentence")
        val senArray = sentence.toCharArray()

        for (char in senArray) {
            tvShow.text = char.toString()

        }
    }
}
