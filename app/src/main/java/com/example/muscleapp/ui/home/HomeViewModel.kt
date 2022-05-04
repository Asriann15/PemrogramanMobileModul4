package com.example.muscleapp.ui.home

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.muscleapp.R
import com.example.muscleapp.model.homeDataModel

class HomeViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name

    private val _desc = MutableLiveData<String>()
    val desc: LiveData<String> = _desc

    fun loadData(): List<homeDataModel> {
        return listOf(
            homeDataModel(
                R.string.desc_image1,
                R.string.w1,
                R.drawable.image1
            ),
            homeDataModel(
                R.string.desc_image2,
                R.string.w2,
                R.drawable.image2
            ),
            homeDataModel(
                R.string.desc_image3,
                R.string.w3,
                R.drawable.image3
            ),
            homeDataModel(
                R.string.desc_image4,
                R.string.w4,
                R.drawable.image4
            ),
            homeDataModel(
                R.string.desc_image5,
                R.string.w5,
                R.drawable.image5
            ),
            homeDataModel(
                R.string.desc_image6,
                R.string.w6,
                R.drawable.image6
            ),
            homeDataModel(
                R.string.desc_image7,
                R.string.w7,
                R.drawable.image7
            ),
            homeDataModel(
                R.string.desc_image8,
                R.string.w8,
                R.drawable.image8
            ),
            homeDataModel(
                R.string.desc_image9,
                R.string.w9,
                R.drawable.image9
            ),
            homeDataModel(
                R.string.desc_image10,
                R.string.w10,
                R.drawable.image10
            )
        )
    }

    fun setData(data: homeDataModel, context: Context) {
        _name.value = context.getString(data.NameResId)
        _image.value = data.ImageResId
        _desc.value = context.getString(data.DescriptionResId)
    }
}