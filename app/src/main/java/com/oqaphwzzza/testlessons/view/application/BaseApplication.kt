package com.oqaphwzzza.testlessons.view.application

import androidx.multidex.MultiDexApplication
import androidx.room.Room
import com.oqaphwzzza.testlessons.data.local.AppDatabase
import com.oqaphwzzza.testlessons.data.local.Database
import com.oqaphwzzza.testlessons.di.databaseModule
import com.oqaphwzzza.testlessons.di.factoryModule
import com.oqaphwzzza.testlessons.di.useCaseModule
import com.oqaphwzzza.testlessons.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BaseApplication: MultiDexApplication(){

    override fun onCreate() {
        super.onCreate()
        createKoin()

    }



    fun createKoin(){
        val koinModuls = listOf(
            viewModelModule,
            factoryModule,
            useCaseModule,
            databaseModule
        )

        startKoin {
            androidLogger()
            androidContext(this@BaseApplication)
            modules(koinModuls)
        }

    }
}