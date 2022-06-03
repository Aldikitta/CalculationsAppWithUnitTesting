package com.aldikitta.calculationsappwithunittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class MyCalcTest{
    private lateinit var myCalc: MyCalc

    @Test
    fun calculateCircumference_radiusGiven_returnsCorrectResult(){
        myCalc = MyCalc()
        val result = myCalc.calculateCircumference(2.1)
        assertThat(result).isEqualTo(13.188)
    }
}