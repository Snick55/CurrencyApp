package com.snick55.currencyapp.core

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.Date
import javax.inject.Inject

interface DateFormatter {

    fun format(time: Long): String

    class DateFormatterImpl @Inject constructor() : DateFormatter {

        @SuppressLint("SimpleDateFormat")
        override fun format(time: Long): String {
            return SimpleDateFormat("yyyy-MM-dd.HH:mm:ss").format(
                Date(
                    time
                )
            )
        }
    }

}