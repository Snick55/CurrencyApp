package com.snick55.currencyapp.data

import retrofit2.http.GET

interface CurrencyApi {


    @GET("daily_json.js")
    suspend fun getCurrencies(): CurrencyResponse

}