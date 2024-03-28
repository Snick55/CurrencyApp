package com.snick55.currencyapp.presentation

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.snick55.currencyapp.databinding.ItemCurrencyBinding

class CurrencyAdapter:
    ListAdapter<CurrencyUi, CurrencyAdapter.CurrencyViewHolder>(DetailUiDiffCallback()) {


    inner class CurrencyViewHolder(private val binding: ItemCurrencyBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(itemUi: CurrencyUi) {

            binding.nameTV.text = itemUi.name
            binding.charCodeTV.text = "${itemUi.nominal} ${itemUi.charCode}"
            binding.priceTV.text = "${itemUi.value}₽"

        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCurrencyBinding.inflate(inflater, parent, false)
        return CurrencyViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: CurrencyViewHolder, position: Int) {
        viewHolder.bind(getItem(position))
    }

    class DetailUiDiffCallback : DiffUtil.ItemCallback<CurrencyUi>() {

        override fun areItemsTheSame(oldItem: CurrencyUi, newItem: CurrencyUi): Boolean {
            return oldItem.charCode == newItem.charCode
        }

        override fun areContentsTheSame(
            oldItem: CurrencyUi,
            newItem: CurrencyUi
        ): Boolean {
            return oldItem == newItem
        }
    }
}