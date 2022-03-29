package com.generation.projetointegrador2.api

import com.generation.projetointegrador2.model.Tema
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("tema")
    suspend fun listTema(): Response<List<Tema>>

}