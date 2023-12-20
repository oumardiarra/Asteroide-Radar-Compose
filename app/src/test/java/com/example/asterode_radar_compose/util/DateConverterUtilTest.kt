package com.example.asterode_radar_compose.util

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.threeten.bp.LocalDate

class DateConverterUtilTest {

    @Test
    fun `toLocalDate - returns the converted string to localDate`() {
        //Given
        val givenDateString = "2023-11-22"
        //When
        val result = DateConverterUtil.toLocalDate(givenDateString)

        //Then
        assertThat(result).isEqualTo(LocalDate.of(2023, 11, 22))
    }
}