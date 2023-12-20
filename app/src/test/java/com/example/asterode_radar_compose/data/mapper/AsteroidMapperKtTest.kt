package com.example.asterode_radar_compose.data.mapper

import com.example.asterode_radar_compose.data.remote.dto.AsteroidDetailsDto
import com.example.asterode_radar_compose.data.remote.dto.AsteroidDto
import com.example.asterode_radar_compose.data.remote.dto.CloseApproachDataDto
import com.example.asterode_radar_compose.data.remote.dto.EstimatedDiameterDto
import com.example.asterode_radar_compose.data.remote.dto.KilometersDto
import com.example.asterode_radar_compose.data.remote.dto.MissDistanceDto
import com.example.asterode_radar_compose.data.remote.dto.RelativeVelocityDto
import com.example.asterode_radar_compose.domain.model.Asteroid
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.threeten.bp.LocalDate


class AsteroidMapperKtTest {

    val asteroidMapper = AsteroidMapper()

    @Test
    fun `toAsteroids - should map an AsteroidDto to an Asteroid`() {
        //Given
        val givenAsteroidDto = AsteroidDto(
            nearEarthObjectsDto = mapOf(
                "2023-12-12" to listOf(
                    AsteroidDetailsDto(
                        id = 2416801,
                        codeName = "codeName",
                        absoluteMagnitude = 19.0,
                        closeApproachData = listOf(
                            CloseApproachDataDto(
                                closeApproachDate = "2023-12-12",
                                relativeVelocity = RelativeVelocityDto(kilometersPerHour = "95403.1427137951")
                            )
                        ),
                        estimatedDiameter = EstimatedDiameterDto(
                            kilometers = KilometersDto(
                                estimatedDiameterMin = 0.3122877701
                            )
                        ),
                        missDistance = MissDistanceDto(kilometers = "kilometers"),
                        isPotentiallyHazardous = false
                    )
                )
            )
        )

        //When
        val result = with(asteroidMapper) {
            givenAsteroidDto.toAsteroids()
        }

        //Then
        assertThat(result).isEqualTo(
            listOf(
                Asteroid(
                    id = 2416801,
                    codeName = "codeName",
                    absoluteMagnitude = 19.0,
                    closeApproachDate = listOf(LocalDate.of(2023, 12, 12)),
                    kilometersPerHour = listOf("95403.1427137951"),
                    estimatedDiameterMin = 0.3122877701,
                    missDistance = "kilometers",
                    isPotentiallyHazardous = false
                )
            )
        )
    }
}