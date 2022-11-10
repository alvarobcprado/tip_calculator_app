package com.example.tipcalculator

import org.junit.Assert.assertEquals
import org.junit.Test

class TipCalculatorTests {

    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 100.0
        val tipPercentage = 20.0
        val roundUp = false
        val expected = "$20.00"

        val actual = calculateTip(amount, tipPercentage, roundUp)

        assertEquals(expected, actual)
    }
}