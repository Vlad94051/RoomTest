package ru.tms.roomtest.data.storage

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(

    @ColumnInfo(name = "first_name")
    val firstName: String,

    @ColumnInfo(name = "last_name")
    val lastName: String,

    @ColumnInfo(name = "age")
    val age: Int,

    @ColumnInfo(name = "sex")
    val sex: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
