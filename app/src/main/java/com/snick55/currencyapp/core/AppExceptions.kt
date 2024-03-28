package com.snick55.currencyapp.core

open class AppExceptions(errorMessage: String): java.lang.Exception(errorMessage)

class NoInternetException: AppExceptions("No internet connection")

class GenericException:AppExceptions("Something went wrong")