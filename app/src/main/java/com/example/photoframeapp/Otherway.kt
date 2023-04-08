package com.example.photoframeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.photoframeapp.databinding.ActivityOtherwayBinding

class Otherway : AppCompatActivity() {

    private lateinit var binding: ActivityOtherwayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOtherwayBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}