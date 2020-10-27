package com.multiform.androidhandbook.ui.screens.roadmap

import android.view.View
import androidx.fragment.app.Fragment
import com.multiform.androidhandbook.R
import com.multiform.androidhandbook.utils.APP_ACTIVITY
import kotlinx.android.synthetic.main.fragment_roadmap.*

class RoadmapFragment : Fragment(R.layout.fragment_roadmap) {

    override fun onResume() {
        super.onResume()
        APP_ACTIVITY.title = "Roadmap"

        roadBtn1.setOnClickListener {
            if (roadmap1.visibility == View.GONE) roadmap1.visibility = View.VISIBLE
                else roadmap1.visibility = View.GONE
        }

        roadBtn2.setOnClickListener {
            if (roadmap2.visibility == View.GONE) roadmap2.visibility = View.VISIBLE
            else roadmap2.visibility = View.GONE
        }

        roadBtn3.setOnClickListener {
            if (roadmap3.visibility == View.GONE) roadmap3.visibility = View.VISIBLE
            else roadmap3.visibility = View.GONE
        }
    }
}