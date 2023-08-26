package com.imgur.cats.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.imgur.cats.domain.models.Image
import com.imgur.cats.domain.usecase.GetCatsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val useCase: GetCatsUseCase) : ViewModel() {

    private val _onSuccessGetCats = MutableLiveData<Boolean>()
    val onSuccessGetCats = _onSuccessGetCats
    val mediaItems = mutableListOf<Image>()

    fun getCats(queryParameter: String, authorization: String) {
        viewModelScope.launch {
            try {
                val response = useCase.getCats(queryParameter, authorization)
                response.data.forEach { data ->
                    Log.e("data counter", "oi")
                    data.images.forEach {
                        mediaItems.add(it)
                    }
                }
                _onSuccessGetCats.postValue(true)
            } catch (exception: Exception) {
                Log.e("exception", exception.message!!)
                Log.e("exception", exception.stackTraceToString())
            }
        }
    }
}