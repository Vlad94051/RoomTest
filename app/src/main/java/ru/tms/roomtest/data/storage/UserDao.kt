package ru.tms.roomtest.data.storage

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Query("SELECT * FROM users")
    fun getAll(): List<UserEntity>

    @Insert
    fun insertUser(user: UserEntity)

    @Delete
    fun deleteUser(user: UserEntity)

}