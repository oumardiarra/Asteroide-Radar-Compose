package com.example.asterode_radar_compose.data.mapper

import com.example.asterode_radar_compose.data.remote.dto.AsteroidDetailsDto
import com.example.asterode_radar_compose.data.remote.dto.AsteroidDto
import com.example.asterode_radar_compose.domain.model.Asteroid
import com.example.asterode_radar_compose.util.DateConverterUtil

class AsteroidMapper {
    internal fun AsteroidDto.toAsteroids(): List<Asteroid> =
        nearEarthObjectsDto.values.flatMap {
              it.toAsteroidsDetails()
          }
}

internal fun List<AsteroidDetailsDto>.toAsteroidsDetails() =
    this.map { asteroidDetails ->
        val closeApproachData = asteroidDetails.closeApproachData
        Asteroid(
            id = asteroidDetails.id,
            codeName = asteroidDetails.codeName,
            absoluteMagnitude = asteroidDetails.absoluteMagnitude,
            closeApproachDate = closeApproachData.map {
                DateConverterUtil.toLocalDate(it.closeApproachDate)
            },
            kilometersPerHour = closeApproachData.map { it.relativeVelocity.kilometersPerHour },
            estimatedDiameterMin = asteroidDetails.estimatedDiameter.kilometers.estimatedDiameterMin,
            isPotentiallyHazardous = asteroidDetails.isPotentiallyHazardous,
            missDistance = asteroidDetails.missDistance.kilometers,
        )
    }