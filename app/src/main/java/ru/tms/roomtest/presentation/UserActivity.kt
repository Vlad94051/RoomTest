package ru.tms.roomtest.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_user.*
import org.koin.android.viewmodel.ext.android.viewModel
import ru.tms.roomtest.R

class UserActivity: AppCompatActivity() {
    private val userViewModel by viewModel<UserViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
    }

    override fun onStart() {
        super.onStart()

        loadBtn.setOnClickListener {
            userViewModel.loadUsers()
        }

        insertBtn.setOnClickListener {
            userViewModel.insertUser()
        }

        userViewModel.users.observe(this) { users ->
            Log.e("USERS:: ", users.toString())
        }
    }


}