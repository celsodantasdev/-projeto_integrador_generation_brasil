package com.generation.projetointegrador2.repository

import com.generation.projetointegrador2.api.RetrofitInstance
import com.generation.projetointegrador2.model.Tema
import retrofit2.Response

class Repository {

    suspend fun listTema(): Response<List<Tema>>{
        return RetrofitInstance.api.listTema()
    }

}