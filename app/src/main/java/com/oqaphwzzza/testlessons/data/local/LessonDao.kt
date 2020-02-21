package com.oqaphwzzza.testlessons.data.local

import androidx.room.*
import com.oqaphwzzza.testlessons.data.models.LessonModel

@Dao
interface LessonDao {
    @Query("SELECT * FROM lessons")
    fun getAll(): List<LessonModel>?


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(lessons: List<LessonModel>): List<Long>

    @Delete
    fun delete(user: LessonModel)

    @Query("DELETE FROM lessons")
    fun deleteAll()
}