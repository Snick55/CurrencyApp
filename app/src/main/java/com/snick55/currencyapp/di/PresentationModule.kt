package com.snick55.currencyapp.di

import com.snick55.currencyapp.core.DateFormatter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class PresentationModule {

    @Binds
    abstract fun bindFormatter(formatter: DateFormatter.DateFormatterImpl):DateFormatter
}