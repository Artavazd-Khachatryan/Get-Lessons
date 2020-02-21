package com.oqaphwzzza.testlessons.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.oqaphwzzza.testlessons.data.models.LessonModel

@Database(entities = [LessonModel::class], version = 1)
abstract class AppDatabase: RoomDatabase(){

    abstract fun lessonDao(): LessonDao

}