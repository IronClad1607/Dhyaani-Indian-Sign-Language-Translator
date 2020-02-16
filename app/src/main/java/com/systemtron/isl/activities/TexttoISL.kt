package com.systemtron.isl.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.systemtron.isl.R
import kotlinx.android.synthetic.main.activity_textto_isl.*

class TexttoISL : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_textto_isl)


        btnSubmit.setOnClickListener {
            val sentence = etSubmit.text.toString()
            val intent = Intent(applicationContext,ConversionActivity::class.java)
            intent.putExtra("sentence",sentence)
            startActivity(intent)
        }
    }
}
