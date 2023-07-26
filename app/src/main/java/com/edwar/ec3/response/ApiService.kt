package com.edwar.ec3.response

import retrofit2.http.GET

interface ApiService {
    @GET
    fun getListByBreeds()
}