package com.oqaphwzzza.testlessons.view.adapters.lessonAdapter

import androidx.databinding.ObservableField
import androidx.recyclerview.widget.RecyclerView
import com.oqaphwzzza.testlessons.data.models.LessonModel
import com.oqaphwzzza.testlessons.databinding.LessonListItemBinding


const val MONDAY = 1
const val TUESDAY = 2
const val WEDNESDAY = 3
const val THURSDAY = 4
const val FRIDAY = 5
const val SATURDAY = 6
const val SUNDAY = 7

class LessonViewHolder(private val binding: LessonListItemBinding): RecyclerView.ViewHolder(binding.root){

    private lateinit var model: LessonModel

    val name = ObservableField<String>()
    val startTime = ObservableField<String>()
    val endTime = ObservableField<String>()
    val teacher = ObservableField<String>()
    val place = ObservableField<String>()
    val description = ObservableField<String>()
    val weekDay = ObservableField<String>()

    fun bind(model: LessonModel){
        this.model = model
        binding.holder = this
        name.set(model.name)
        startTime.set(model.startTime)
        endTime.set(model.endTime)
        teacher.set(model.teacher)
        place.set(model.place)
        description.set(model.description)
        model.weekDay?.let {  weekDay.set(getWeekDay(it)) }

    }


    fun getWeekDay(day: Int) = when(day){
        MONDAY -> "Monday"
        TUESDAY -> "Tuesday"
        WEDNESDAY -> "Wednesday"
        THURSDAY -> "Thursday"
        FRIDAY -> "Friday"
        SATURDAY -> "Saturday"
        SUNDAY -> "Sunday"
        else -> ""
    }

}