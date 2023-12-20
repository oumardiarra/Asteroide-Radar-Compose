package com.example.asterode_radar_compose.domain.model

import org.threeten.bp.LocalDate


data class Asteroid(
    val id: Long,
    val codeName: String,
    val absoluteMagnitude: Double,
    val closeApproachDate: List<LocalDate>,
    val kilometersPerHour: List<String>,
    val estimatedDiameterMin: Double,
    val missDistance: String,
    val isPotentiallyHazardous: Boolean,
)
