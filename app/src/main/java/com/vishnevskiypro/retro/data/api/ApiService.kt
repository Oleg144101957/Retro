package com.vishnevskiypro.retro.data.api

import com.vishnevskiypro.retro.model.beznal.Beznal
import com.vishnevskiypro.retro.model.beznal.BeznalItem
import com.vishnevskiypro.retro.model.nal.Nalichka
import com.vishnevskiypro.retro.model.nal.NalichkaItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoneys(): Response<Nalichka>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBeznalMoneys(): Response<Beznal>





}