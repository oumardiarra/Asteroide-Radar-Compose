package com.example.asterode_radar_compose.data.remote.dto

import com.squareup.moshi.Json


data class AsteroidDto(
    @Json(name = "near_earth_objects")
    val nearEarthObjectsDto: Map<String, List<AsteroidDetailsDto>>
)

data class AsteroidDetailsDto(
    @Json(name = "id")
    val id: Long,
    @Json(name = "name")
    val codeName: String,
    @Json(name = "absolute_magnitude_h")
    val absoluteMagnitude: Double,
    @Json(name = "close_approach_data")
    val closeApproachData: List<CloseApproachDataDto>,
    @Json(name = "estimated_diameter")
    val estimatedDiameter: EstimatedDiameterDto,
    @Json(name = "miss_distance")
    val missDistance: MissDistanceDto,
    @Json(name = "is_potentially_hazardous_asteroid")
    val isPotentiallyHazardous: Boolean,
)

data class MissDistanceDto(
    @Json(name = "kilometers")
    val kilometers: String,
)

data class CloseApproachDataDto(
    @Json(name = "closeApproachDate")
    val closeApproachDate: String,
    @Json(name = "relative_velocity")
    val relativeVelocity: RelativeVelocityDto,
)

data class EstimatedDiameterDto(
    @Json(name = "kilometers")
    val kilometers: KilometersDto,
)

data class KilometersDto(
    @Json(name = "estimated_diameter_min")
    val estimatedDiameterMin: Double,
)

data class RelativeVelocityDto(
    @Json(name = "kilometers_per_hour")
    val kilometersPerHour: String,
)

