package com.example.mvcsampleimpement.ui

import com.example.mvcsampleimpement.model.User

class Fakedatabase {


    fun getUserInfo(): User {

        return User("Hi,Mohammed Hesham ", 1998)
    }


}