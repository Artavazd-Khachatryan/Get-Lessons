package com.oqaphwzzza.testlessons.di

import com.oqaphwzzza.testlessons.data.remute.Api
import com.oqaphwzzza.testlessons.data.repository.Repository
import com.oqaphwzzza.testlessons.domain.NetworkConnectionManager
import io.ktor.client.HttpClient
import io.ktor.client.features.json.GsonSerializer
import io.ktor.client.features.json.JsonFeature
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val factoryModule = module {

    factory {
        HttpClient {
            install(JsonFeature) {
                serializer = GsonSerializer()
            }
        }
    }

    factory { Api(get()) }

    factory { Repository(get(), get()) }


    factory { NetworkConnectionManager(androidApplication()) }


}

