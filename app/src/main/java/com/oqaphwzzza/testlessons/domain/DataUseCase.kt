package com.oqaphwzzza.testlessons.domain

import com.oqaphwzzza.testlessons.data.models.LessonModel
import com.oqaphwzzza.testlessons.data.repository.Repository
import kotlinx.coroutines.*

class DataUseCase(
    private val repository: Repository,
    private val networkManager: NetworkConnectionManager,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) {


    suspend fun getLessons() = if (networkManager.isInternetAvailable()) {
        repository.getRemoteLessons()
    } else
        withContext(dispatcher){repository.getLocalLessons()}


    suspend fun saveLessons(lessons: List<LessonModel>) = withContext(dispatcher){
        repository.saveLessons(lessons)
    }


    suspend fun deleteLessons() = withContext(dispatcher){repository.deleteLessons()}


}