package com.vishnevskiypro.retro.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishnevskiypro.retro.data.repository.Repository
import com.vishnevskiypro.retro.model.nal.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel: ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Nalichka>> = MutableLiveData()

    fun getNalMoney (){
        viewModelScope.launch {
            myMoneyList.value = repo.getNal()

        }
    }

}