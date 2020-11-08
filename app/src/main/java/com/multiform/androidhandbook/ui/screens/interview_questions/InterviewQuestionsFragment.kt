package com.multiform.androidhandbook.ui.screens.interview_questions

import androidx.fragment.app.Fragment
import com.multiform.androidhandbook.R
import com.multiform.androidhandbook.objects.InterviewListItems
import com.multiform.androidhandbook.utils.openArticle
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import kotlinx.android.synthetic.main.fragment_interview_questions.*
import kotlinx.android.synthetic.main.item_list.view.*

class InterviewQuestionsFragment : Fragment(R.layout.fragment_interview_questions) {

    override fun onResume() {
        super.onResume()

        rcViewInterview.hasFixedSize()
        rcViewInterview.adapter = GroupAdapter<GroupieViewHolder>().apply { addAll(InterviewListItems.interviewList) }
    }
}