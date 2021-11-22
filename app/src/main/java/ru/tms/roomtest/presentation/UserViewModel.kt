package ru.tms.roomtest.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import ru.tms.roomtest.domain.User
import ru.tms.roomtest.domain.UserInteractor

class UserViewModel(
    private val userInteractor: UserInteractor
) : ViewModel() {

    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> get() = _users

     fun loadUsers() {
        viewModelScope.launch {
            _users.value = userInteractor.getUsers()
        }
    }

     fun insertUser() {
        viewModelScope.launch {
            userInteractor.insertUser(
                User(
                    firstName = "Vlad",
                    lastName = "Anton",
                    age = 45,
                    sex = User.Sex.MALE
                ),
                User(
                    firstName = "Alex",
                    lastName = "Anton",
                    age = 56,
                    sex = User.Sex.MALE
                ),
                User(
                    firstName = "Vlad",
                    lastName = "Fedor",
                    age = 99,
                    sex = User.Sex.MALE
                )
            )
        }
    }

}