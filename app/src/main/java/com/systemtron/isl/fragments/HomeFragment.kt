package com.systemtron.isl.fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.systemtron.isl.R
import com.systemtron.isl.activities.ISLtoTextActivity
import com.systemtron.isl.activities.TexttoISL
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v = inflater.inflate(R.layout.fragment_home, container, false)

        val islToText = v.findViewById<Button>(R.id.btnISLtoText)
        val textToISL = v.findViewById<Button>(R.id.btnTexttoISL)

        islToText.setOnClickListener(this)
        textToISL.setOnClickListener(this)

        return v
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnISLtoText -> {
                startActivity(Intent(requireContext(), ISLtoTextActivity::class.java))
            }

            R.id.btnTexttoISL -> {
                startActivity(Intent(requireContext(), TexttoISL::class.java))
            }
            else -> {

            }
        }

    }


}
