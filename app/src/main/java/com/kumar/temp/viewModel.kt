package com.kumar.temp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class viewModel : ViewModel() {
    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> = _count

    private fun onMinusClicked() {
        _count.value -= 1
    }

    private fun onPlusClicked() {
        _count.value += 1
    }

    // class A : B     ->  class A extends B            A obj = new A()       (java)
    // class A{
    // fun display()
//}
    // obj : A       ->    obj.display();
    fun action(op : operation ){                 // op has access to all the properties of class operation
        when(op){
            operation.OnMinusClicked -> onMinusClicked()
            operation.OnPlusClicked -> onPlusClicked()
        }
    }


}