package com.systemtron.isl.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.systemtron.isl.R
import com.systemtron.isl.adapter.ViewPagerAdapter

class HomeActivity : AppCompatActivity() {

    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.vpMain)

        tabLayout!!.addTab(tabLayout!!.newTab().setText("Home"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Education"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("History"))

        tabLayout!!.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = ViewPagerAdapter(supportFragmentManager, tabLayout!!.tabCount)
        viewPager!!.adapter = adapter

        viewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
                viewPager!!.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager!!.currentItem = tab!!.position
            }

        })
    }
}
