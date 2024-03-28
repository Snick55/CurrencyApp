package com.snick55.currencyapp.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.snick55.currencyapp.R
import com.snick55.currencyapp.core.observe
import com.snick55.currencyapp.core.viewBinding
import com.snick55.currencyapp.databinding.FragmentCurrencyBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentCurrency : Fragment(R.layout.fragment_currency) {

    private val viewModel by viewModels<CurrencyViewModel>()

    private val binding by viewBinding<FragmentCurrencyBinding>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = CurrencyAdapter()

        binding.currencyRV.adapter = adapter

        viewModel.date.observe(viewLifecycleOwner){
            binding.dateTextView.text = getString(R.string.last_update_title,it)
        }

        binding.root.observe(viewLifecycleOwner,viewModel.currency){
            adapter.submitList(it)
        }

        binding.root.setTryAgainListener {
            viewModel.loadCurrency()
        }

    }

    override fun onStop() {
        super.onStop()
        viewModel.stop()
    }

    override fun onStart() {
        super.onStart()
        viewModel.start()
    }

}