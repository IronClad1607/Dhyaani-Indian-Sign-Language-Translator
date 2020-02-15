package com.systemtron.isl.fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.systemtron.isl.R
import com.systemtron.isl.activities.ISLtoTextActivity
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        btnISLtoText.setOnClickListener {
            val intent = Intent(requireContext(),ISLtoTextActivity::class.java)
            startActivity(intent)
        }

        btnTexttoISL.setOnClickListener {

        }


        return inflater.inflate(R.layout.fragment_home, container, false)
    }


}
