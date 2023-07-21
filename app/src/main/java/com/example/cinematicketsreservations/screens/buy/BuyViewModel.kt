package com.example.cinematicketsreservations.screens.buy


import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject


@HiltViewModel
class BuyViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow(BuyUiState())
    val state = _state.asStateFlow()


    fun onClickSelected(state: BuyUiState) {
        _state.value = _state.value.copy(isSelected = !state.isSelected)
    }

}