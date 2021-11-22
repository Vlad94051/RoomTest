package ru.tms.roomtest.data.di

import androidx.room.Room
import org.koin.dsl.module
import ru.tms.roomtest.data.storage.AppDatabase
import ru.tms.roomtest.data.storage.UserDao

val databaseModule = module {
    single<AppDatabase> {
        Room.databaseBuilder(
            get(),
            AppDatabase::class.java,
            "users"
        ).build()
    }

    single {
        get<AppDatabase>().getUserDao()
    }
}