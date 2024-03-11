package com.kumar.temp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class viewModel : ViewModel() {
    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> = _count

    fun onMinusClicked(){
        _count.value -= 1
    }

    fun onPlusClicked(){
        _count.value += 1
    }

    fun action(operation: operation){
        when(operation){
            com.kumar.temp.operation.onMinusClicked -> onMinusClicked()
            com.kumar.temp.operation.onPlusClicked -> onPlusClicked()
        }
    }


}