package com.example.photoframeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.photoframeapp.databinding.ActivityOtherwayBinding

class Otherway : AppCompatActivity() {

       var currentImage = 0

    private lateinit var binding: ActivityOtherwayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOtherwayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
    }
}