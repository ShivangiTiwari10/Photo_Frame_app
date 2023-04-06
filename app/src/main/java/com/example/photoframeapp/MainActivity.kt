package com.example.photoframeapp

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ViewFlipper
import androidx.appcompat.app.AppCompatActivity
import com.example.photoframeapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var viewFlipper: ViewFlipper? = null
    var next: ImageButton? = null
    private var previous: ImageButton? = null


    var counter = 0
    var person = arrayOf("Mangla", "Zain", "Savina", "Babita")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewFlipper = binding.viewFlipper
        next = binding.next
        previous = binding.previous

        binding.next.setOnClickListener {

            counter++
            if (counter == person.size) counter = 0

            binding.Name.text = person[counter]
            onClicked(next!!)

        }

        binding.previous.setOnClickListener {

            counter--
            if(counter<0) counter=person.size-1
            binding.Name.text = person[counter]
            onClicked(previous!!)

        }


    }


    private fun onClicked(view: View) {
        if (view == next) {
            viewFlipper?.showNext()
        } else if (view == previous) {
            viewFlipper?.showPrevious()
        }
    }
}





