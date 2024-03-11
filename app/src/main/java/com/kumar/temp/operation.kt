package com.kumar.temp

sealed class operation {
    data object onPlusClicked : operation()

    data object onMinusClicked : operation()
}