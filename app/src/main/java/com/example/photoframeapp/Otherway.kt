package com.example.photoframeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.photoframeapp.databinding.ActivityOtherwayBinding

class Otherway : AppCompatActivity() {

    private var currentImage = 0
    private lateinit var image: ImageView

    private lateinit var binding: ActivityOtherwayBinding

    @SuppressLint("DiscouragedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOtherwayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.imgPrev.setOnClickListener {

            val idCurrentImgString = "pic$currentImage"

//            convert string id into integer address associated with it
            val idCurrentImgInt =
                this.resources.getIdentifier(idCurrentImgString, "id", packageName)

            image = findViewById(idCurrentImgInt)
            image.alpha = 0f


            currentImage = (4+currentImage-1)%4
            val idImgToShowString = "pic$currentImage"
//            convert string id into integer address associated with it
            val idImgToShowInt =
                this.resources.getIdentifier(idImgToShowString, "id", packageName)


            image = findViewById(idImgToShowInt)
            image.alpha = 1f
        }

        binding.imgNext.setOnClickListener {

            val idCurrentImgString = "pic$currentImage"

//            convert string id into integer address associated with it
            val idCurrentImgInt =
                this.resources.getIdentifier(idCurrentImgString, "id", packageName)

            image = findViewById(idCurrentImgInt)
            image.alpha = 0f

            currentImage = (4+currentImage+1)%4
            val idImgToShowString = "pic$currentImage"
//            convert string id into integer address associated with it
            val idImgToShowInt =
                this.resources.getIdentifier(idImgToShowString, "id", packageName)

            image = findViewById(idImgToShowInt)
            image.alpha = 1f
        }
    }
}