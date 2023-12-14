package com.example.asterode_radar_compose.domain.model

import java.time.LocalDate

data class Asteroid(
    val id: Long,
    val codeName: String,
    val absoluteMagnitude: Double,
    val closeApproachDate: LocalDate,
    val kilometersPerHour: String,
    val estimatedDiameterMin: Double,
    val missDistance: String,
    val isPotentiallyHazardous: Boolean,
)
