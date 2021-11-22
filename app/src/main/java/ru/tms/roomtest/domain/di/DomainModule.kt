package ru.tms.roomtest.domain.di

import org.koin.dsl.module
import ru.tms.roomtest.data.UserInteractorImpl
import ru.tms.roomtest.domain.UserInteractor

val domainModule = module {
    single<UserInteractor> {
        UserInteractorImpl(userDao = get())
    }
}