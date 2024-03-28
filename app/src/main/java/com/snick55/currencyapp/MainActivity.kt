package com.snick55.currencyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.snick55.currencyapp.presentation.FragmentCurrency
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, FragmentCurrency()).commit()
        }


    }
}