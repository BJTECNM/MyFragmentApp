package com.example.myfragmentapp

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    val operand1 = ObservableField<String>("")
    val operand2 = ObservableField<String>("")
    val result = ObservableField<String>("Result: ")

    fun performOperation(operation: String) {
        val value1 = operand1.get()?.toDoubleOrNull() ?: 0.0
        val value2 = operand2.get()?.toDoubleOrNull() ?: 0.0

        when (operation) {
            "+" -> result.set("Result: ${value1 + value2}")
            "-" -> result.set("Result: ${value1 - value2}")
            "*" -> result.set("Result: ${value1 * value2}")
            "/" -> {
                if (value2 != 0.0) {
                    result.set("Result: ${value1 / value2}")
                } else {
                    result.set("Result: Undefined (Division by zero)")
                }
            }
        }
    }
}