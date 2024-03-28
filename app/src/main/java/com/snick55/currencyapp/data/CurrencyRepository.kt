package com.snick55.currencyapp.data

import com.snick55.currencyapp.core.Container
import javax.inject.Inject

interface CurrencyRepository {

    suspend fun getCurrency(): Container<List<CurrencyData>>

    class Base @Inject constructor(
        private val api: CurrencyApi,
        private val errorHandler: ErrorHandler
    ) : CurrencyRepository {

        override suspend fun getCurrency(): Container<List<CurrencyData>> {
            return try {
                val response = api.getCurrencies()
                Container.Success(response.Valute.toList())
            } catch (e: Exception) {
                Container.Error(errorHandler.handle(e))
            }
        }
    }
}

