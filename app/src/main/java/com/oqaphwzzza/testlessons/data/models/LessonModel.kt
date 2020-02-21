package com.oqaphwzzza.testlessons.data.models

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "lessons")
data class LessonModel(

    @SerializedName("appointment")    val appointment: Boolean?,
    @SerializedName("appointment_id") val appointment_id: String?,
    @SerializedName("availability")   val availability: Int?,
    @SerializedName("color")          val color: String?,
    @SerializedName("description")    val description: String?,
    @SerializedName("endTime")        val endTime: String?,
    @SerializedName("name")           val name: String?,
    @SerializedName("pay")            val pay: Boolean?,
    @SerializedName("place")          val place: String?,
    @SerializedName("service_id")     val service_id: String?,
    @SerializedName("startTime")      val startTime: String?,
    @SerializedName("teacher")        val teacher: String?,
    @SerializedName("teacher_v2") @Embedded val teacher_v2: Teacher?,
    @SerializedName("weekDay")        val weekDay: Int?,
    @PrimaryKey(autoGenerate = true)        val id: Int = 0
)


data class Teacher(
    @SerializedName("imageUrl")      val imageUrl: String?,
    @SerializedName("name")          val fullName: String?,
    @SerializedName("position")      val position: String?,
    @SerializedName("short_name")    val short_name: String?
)