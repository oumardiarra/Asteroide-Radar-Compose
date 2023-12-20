package com.example.asterode_radar_compose.util

import org.threeten.bp.LocalDate
import org.threeten.bp.format.DateTimeFormatter
import java.util.Locale


object DateConverterUtil {

    fun toLocalDate(date: String): LocalDate =
        LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.FRANCE))

}