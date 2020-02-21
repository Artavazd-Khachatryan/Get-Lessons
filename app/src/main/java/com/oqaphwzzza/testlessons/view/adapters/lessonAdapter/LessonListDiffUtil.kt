package com.oqaphwzzza.testlessons.view.adapters.lessonAdapter

import androidx.recyclerview.widget.DiffUtil
import com.oqaphwzzza.testlessons.data.models.LessonModel


class LessonListDiffUtil: DiffUtil.ItemCallback<LessonModel>() {

    override fun areItemsTheSame(oldItem: LessonModel, newItem: LessonModel): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: LessonModel, newItem: LessonModel): Boolean {
        return oldItem == newItem
    }

}