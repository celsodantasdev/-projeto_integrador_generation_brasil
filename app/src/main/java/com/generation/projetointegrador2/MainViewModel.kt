package com.generation.projetointegrador2

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.projetointegrador2.model.Tema
import com.generation.projetointegrador2.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val repository: Repository): ViewModel() {

        private var _myTemaResponse = MutableLiveData<Response<List<Tema>>>()

        val myTemaResponse: LiveData<Response<List<Tema>>> = _myTemaResponse

    init {
        listTema()
    }


    fun listTema(){
        viewModelScope.launch {
            try {
                val response = repository.listTema()
                _myTemaResponse.value = response
            }catch (e: Exception){
                Log.d("Error", e.message.toString())
            }
        }
    }
}