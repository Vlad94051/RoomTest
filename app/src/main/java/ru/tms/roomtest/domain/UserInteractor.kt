package ru.tms.roomtest.domain

interface UserInteractor {
    suspend fun getUsers(): List<User>

    suspend fun insertUser(vararg user: User)
}