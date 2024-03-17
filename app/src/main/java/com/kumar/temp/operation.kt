package com.kumar.temp

sealed class operation {
    data object OnPlusClicked : operation()

    data object OnMinusClicked : operation()

}