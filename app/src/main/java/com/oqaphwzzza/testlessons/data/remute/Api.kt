package com.oqaphwzzza.testlessons.data.remute

import com.oqaphwzzza.testlessons.data.models.LessonModel
import io.ktor.client.HttpClient
import io.ktor.client.request.get


private const val LESSON_URL = "https://sample.fitnesskit-admin.ru/schedule/get_group_lessons_v2/1/"
class Api(private val client: HttpClient){

    suspend fun getLessons() = client.get<List<LessonModel>>(LESSON_URL)

}