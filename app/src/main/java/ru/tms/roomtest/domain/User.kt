package ru.tms.roomtest.domain

data class User(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val sex: Sex
) {
    enum class Sex(val sexStr: String) {
        MALE("male"),
        FEMALE("female")
    }
}
