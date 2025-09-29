package com.example.activezonefit.data

data class UserProfile(
    val name: String = "Juan Pérez",
    val age: Int = 25,
    val level: String = "Intermedio",
    val currentWeight: Double = 75.0,
    val height: Double = 1.75,
    val goalWeight: Double = 70.0,
    val bodyFat: Double = 15.0,
    val fitnessGoals: Int = 45,
    val sessionsActive: Int = 12
)

data class StatCard(
    val value: String,
    val label: String,
    val unit: String = ""
)