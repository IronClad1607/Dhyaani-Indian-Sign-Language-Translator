package com.systemtron.isl.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.systemtron.isl.fragments.EduFragment
import com.systemtron.isl.fragments.HistoryFragment
import com.systemtron.isl.fragments.HomeFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, private var totalTabs: Int) :
    FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> EduFragment()
            2 -> HistoryFragment()
            else -> Fragment()
        }
    }

    override fun getCount() = totalTabs

}