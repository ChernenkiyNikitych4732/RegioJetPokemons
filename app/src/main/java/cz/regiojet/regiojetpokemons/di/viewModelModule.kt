package cz.regiojet.regiojetpokemons.di

import cz.regiojet.regiojetpokemons.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainActivityViewModel(get()) }
}