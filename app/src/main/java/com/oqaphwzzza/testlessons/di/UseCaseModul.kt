package com.oqaphwzzza.testlessons.di


import com.oqaphwzzza.testlessons.domain.DataUseCase
import org.koin.dsl.module

val useCaseModule = module {

    factory {DataUseCase(get(), get())}

}
