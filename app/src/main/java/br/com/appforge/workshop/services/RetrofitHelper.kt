package br.com.appforge.workshop.services

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper {
    companion object{
        private const val BASE_URL = "https://viacep.com.br/ws/"
        //   https://viacep.com.br/ws/ + "04271001/json/"
        val retrofitViacep =
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ViacepApi::class.java)
    }
}