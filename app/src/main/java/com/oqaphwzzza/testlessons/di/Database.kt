package com.oqaphwzzza.testlessons.di


import com.oqaphwzzza.testlessons.data.local.AppDatabase
import com.oqaphwzzza.testlessons.data.local.Database
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module



val databaseModule = module {

    factory { Database().getAppDatabase(androidApplication()) }

    factory { get<AppDatabase>().lessonDao()}

}