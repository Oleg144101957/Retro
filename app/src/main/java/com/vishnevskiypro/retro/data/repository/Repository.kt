package com.vishnevskiypro.retro.data.repository

import com.vishnevskiypro.retro.data.api.RetrofitInstance
import com.vishnevskiypro.retro.model.beznal.Beznal
import com.vishnevskiypro.retro.model.beznal.BeznalItem
import com.vishnevskiypro.retro.model.nal.Nalichka
import com.vishnevskiypro.retro.model.nal.NalichkaItem
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Nalichka>{
        return RetrofitInstance.api.getNalMoneys()
    }

    suspend fun getBeznal(): Response<Beznal>{
        return RetrofitInstance.api.getBeznalMoneys()
    }

}