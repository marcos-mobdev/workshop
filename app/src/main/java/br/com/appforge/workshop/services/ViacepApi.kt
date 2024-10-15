package br.com.appforge.workshop.services

import br.com.appforge.workshop.models.Address
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ViacepApi {

    @GET("{cep}/json/")
    suspend fun getAddress(
        @Path("cep")
        text:String
    ):Response<Address>
}