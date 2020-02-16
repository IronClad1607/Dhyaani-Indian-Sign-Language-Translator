package com.systemtron.isl.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.systemtron.isl.R
import kotlinx.android.synthetic.main.activity_islto_text.*

class ISLtoTextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_islto_text)
        cameraView.setLifecycleOwner(this)

    }
}
