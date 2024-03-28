package com.snick55.currencyapp.di

import com.snick55.currencyapp.data.CurrencyRepository
import com.snick55.currencyapp.data.ErrorHandler
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun bindCurrencyRepository(repository: CurrencyRepository.Base): CurrencyRepository

    @Binds
    abstract fun bindErrorHandler(errorHandler: ErrorHandler.Base): ErrorHandler
}