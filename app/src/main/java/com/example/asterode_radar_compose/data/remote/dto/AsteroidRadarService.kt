package com.example.asterode_radar_compose.data.remote.dto

import retrofit2.http.GET
import retrofit2.http.Query

interface AsteroidRadarService {
    companion object {
        const val BASE_URL = "https://api.nasa.gov/"
    }

    @GET("neo/rest/v1/feed")
    suspend fun fetchAsteroidList(
        @Query("start_date") startDate: String,
        @Query("end_date") endDate: String,
    ): AsteroidDto
}