package com.example.asterode_radar_compose.data.repository

import com.example.asterode_radar_compose.domain.model.Asteroid
import com.example.asterode_radar_compose.domain.repository.AsteroidRepository

class AsteroidRepositoryImpl: AsteroidRepository {
    override suspend fun getAsteroidList(
        startDate: String,
        endDate: String
    ): Result<List<Asteroid>> {
        TODO("Not yet implemented")
    }
}