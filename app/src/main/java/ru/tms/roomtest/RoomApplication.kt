package ru.tms.roomtest

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import ru.tms.roomtest.data.di.databaseModule
import ru.tms.roomtest.domain.di.domainModule
import ru.tms.roomtest.presentation.di.viewModelsModule

class RoomApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@RoomApplication)
            modules(
                databaseModule,
                domainModule,
                viewModelsModule,
            )
        }
    }
}