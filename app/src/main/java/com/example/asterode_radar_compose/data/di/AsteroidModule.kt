package com.example.asterode_radar_compose.data.di

import com.example.asterode_radar_compose.data.remote.dto.AsteroidRadarService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

@Module
@InstallIn(SingletonComponent::class)
object AsteroidModule {

    @Provides
    fun provideAsteroidRadarApi(): AsteroidRadarService = Retrofit.Builder()
        .baseUrl(AsteroidRadarService.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
        .create()
}