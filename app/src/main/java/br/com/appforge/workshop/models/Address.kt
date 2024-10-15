package br.com.appforge.workshop.models

import com.google.gson.annotations.SerializedName


data class Address (
    val cep:String,
    @SerializedName("logradouro") val street:String,
    @SerializedName("bairro")
    val neighborhood:String,
    @SerializedName("localidade")
    val city:String
){
}