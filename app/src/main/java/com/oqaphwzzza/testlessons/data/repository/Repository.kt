package com.oqaphwzzza.testlessons.data.repository

import com.oqaphwzzza.testlessons.data.local.LessonDao
import com.oqaphwzzza.testlessons.data.models.LessonModel
import com.oqaphwzzza.testlessons.data.remute.Api

class Repository(private val api: Api,
                 private val lessonDao: LessonDao){

    suspend fun getRemoteLessons() = api.getLessons()

    fun getLocalLessons() = lessonDao.getAll()

    fun saveLessons(lessons: List<LessonModel>) = lessonDao.insertAll(lessons)

    fun deleteLessons() = lessonDao.deleteAll()

}