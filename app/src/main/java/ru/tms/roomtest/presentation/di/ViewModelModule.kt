package ru.tms.roomtest.presentation.di

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.tms.roomtest.presentation.UserViewModel

val viewModelsModule = module {
    viewModel {
        UserViewModel(get())
    }
}