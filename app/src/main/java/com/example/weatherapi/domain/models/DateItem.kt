package com.example.weatherapi.domain.models

import java.time.LocalDate

data class DateItem(
    val city: String,
    val date: LocalDate,
    val condition: String,
    val image: String,
    val currentTemp: String,
    val minTemp: String,
    val maxTemp: String,
    val hours: String
)
