package com.example.muscleapp.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.muscleapp.R
import com.example.muscleapp.model.galleryDataModel

class GalleryViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    fun loadData(): List<galleryDataModel> {
        return listOf(
            galleryDataModel(R.drawable.image1),
            galleryDataModel(R.drawable.image2),
            galleryDataModel(R.drawable.image3),
            galleryDataModel(R.drawable.image4),
            galleryDataModel(R.drawable.image5),
            galleryDataModel(R.drawable.image6),
            galleryDataModel(R.drawable.image7),
            galleryDataModel(R.drawable.image8),
            galleryDataModel(R.drawable.image9),
            galleryDataModel(R.drawable.image10)
        )
    }

    fun setData(data: galleryDataModel) {
        _image.value = data.ImageResId
    }
}