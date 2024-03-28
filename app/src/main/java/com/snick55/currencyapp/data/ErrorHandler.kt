package com.snick55.currencyapp.data

import android.util.Log
import com.snick55.currencyapp.core.AppExceptions
import com.snick55.currencyapp.core.GenericException
import com.snick55.currencyapp.core.NoInternetException
import java.net.UnknownHostException
import javax.inject.Inject
import java.lang.Exception

interface ErrorHandler {

    fun handle(e: Exception): AppExceptions

    class Base @Inject constructor(): ErrorHandler{

        override fun handle(e: Exception): AppExceptions {
            Log.d("TAG","error is $e")
            return when(e){
                is UnknownHostException -> NoInternetException()
                else -> GenericException()
            }
        }
    }

}