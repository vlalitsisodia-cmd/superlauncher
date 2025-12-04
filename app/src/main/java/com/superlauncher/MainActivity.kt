package com.superlauncher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.superlauncher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.helloText.text = "Welcome to SuperLauncher!"
    }
}
