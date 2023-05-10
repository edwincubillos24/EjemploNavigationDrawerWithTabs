package com.edwinacubillos.ejemplonavigationdrawerwithtabs.ui.home

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.edwinacubillos.ejemplonavigationdrawerwithtabs.R
import com.edwinacubillos.ejemplonavigationdrawerwithtabs.ui.gallery.GalleryFragment
import com.edwinacubillos.ejemplonavigationdrawerwithtabs.ui.slideshow.SlideshowFragment

private val TAB_TITLES = arrayOf(
    R.string.menu_gallery,
    R.string.menu_slideshow,
)

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> GalleryFragment()
            else -> SlideshowFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 2
    }
}