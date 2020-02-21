package com.oqaphwzzza.testlessons.view.adapters.lessonAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.oqaphwzzza.testlessons.data.models.LessonModel
import com.oqaphwzzza.testlessons.databinding.LessonListItemBinding


class LessonAdapter: ListAdapter<LessonModel, LessonViewHolder>(LessonListDiffUtil()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = LessonListItemBinding.inflate(layoutInflater, parent, false)

        return LessonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


}