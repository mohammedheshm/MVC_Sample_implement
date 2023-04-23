package com.example.mvcsampleimpement.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mvcsampleimpement.R
import com.example.mvcsampleimpement.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val api = FakeApiService()
    private val database = Fakedatabase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fetchUserInfoFromDatabase()
    }


    fun fetchUserInfoFromDatabase() {

        val resul = database.getUserInfo()
        binding.tvUsername.text = resul.userName

    }


    fun onFetchLetters(view: View) {

        val result = api.getRandomLetters()
        binding.apply {
            tvDate.text = result.date
            tvRandmoLetters.text = result.letter

        }

    }


}