package com.example.asterode_radar_compose.domain.repository

import com.example.asterode_radar_compose.domain.model.Asteroid

interface AsteroidRepository {
    suspend fun getAsteroidList(
        startDate: String,
        endDate: String
    ): Result<List<Asteroid>>
}