package ru.tms.roomtest.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import ru.tms.roomtest.data.storage.UserDao
import ru.tms.roomtest.domain.User
import ru.tms.roomtest.domain.UserInteractor

class UserInteractorImpl(private val userDao: UserDao) : UserInteractor {
    override suspend fun getUsers(): List<User> {
        return withContext(Dispatchers.IO) {
            userDao.getAll().map { userEntity -> userEntity.toUser() }
        }
    }

    override suspend fun insertUser(vararg user: User) {
        withContext(Dispatchers.IO) {
            user
                .map { domainUser -> domainUser.toUserEntity() }
                .forEach { userEntity -> userDao.insertUser(userEntity) }
        }
    }
}