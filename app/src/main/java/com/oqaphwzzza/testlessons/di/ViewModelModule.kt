package com.oqaphwzzza.testlessons.di

import com.oqaphwzzza.testlessons.view.mainActivity.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { MainActivityViewModel(get()) }

}