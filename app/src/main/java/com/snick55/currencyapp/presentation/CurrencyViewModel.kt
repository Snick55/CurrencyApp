package com.snick55.currencyapp.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.snick55.currencyapp.core.Container
import com.snick55.currencyapp.core.DateFormatter
import com.snick55.currencyapp.data.CurrencyRepository
import com.snick55.currencyapp.di.IoDispatcher
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CurrencyViewModel @Inject constructor(
    private val repository: CurrencyRepository,
    private val formatter: DateFormatter,
   @IoDispatcher private val ioDispatcher: CoroutineDispatcher
) : ViewModel() {

    private val _currency = MutableLiveData<Container<List<CurrencyUi>>>(Container.Pending)
    val currency: LiveData<Container<List<CurrencyUi>>> = _currency
    private val _date = MutableLiveData<String>()
    val date: LiveData<String> = _date

    private var job: Job? = null
    private var isSuccess = false

    fun loadCurrency() {
        if (job?.isActive == true) {
            job?.cancel()
        }
        job = viewModelScope.launch(ioDispatcher) {
            while (true) {
                val lists = repository.getCurrency().map { list ->
                    list.map {
                        CurrencyUi(it.charCode, it.name, it.nominal, it.value)
                    }
                }
                if (lists is Container.Success || !isSuccess) {
                    isSuccess = true
                    _date.postValue(formatter.format(System.currentTimeMillis()))
                    _currency.postValue(lists)
                }
                delay(DELAY)
            }
        }
    }

    fun stop() {
        job?.cancel()
    }

    fun start(){
        loadCurrency()
    }


   private companion object{
       private const val DELAY = 30000L
   }
}
