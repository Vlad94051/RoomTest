package ru.tms.roomtest.data

import ru.tms.roomtest.data.storage.UserEntity
import ru.tms.roomtest.domain.User

fun UserEntity.toUser() =
    User(
        firstName = firstName,
        lastName = lastName,
        age = age,
        sex = resolveSex(sex)
    )

fun resolveSex(sex: String): User.Sex =
    when(sex){
        "male" -> User.Sex.MALE
        "female" -> User.Sex.FEMALE
        else -> throw Exception("This sex does not exist")
    }

fun User.toUserEntity() =
    UserEntity(
        firstName = firstName,
        lastName = lastName,
        age = age,
        sex = sex.sexStr
    )
