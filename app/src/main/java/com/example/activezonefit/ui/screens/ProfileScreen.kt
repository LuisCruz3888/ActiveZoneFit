package com.example.activezonefit.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activezonefit.data.UserProfile
import com.example.activezonefit.ui.theme.*

@Composable
fun ProfileScreen(
    userProfile: UserProfile,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(LightGray)
            .padding(24.dp)
            .verticalScroll(rememberScrollState())
    ) {
        // Header
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 24.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .background(
                        color = Green40,
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "P",
                    color = White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = "Mi Perfil Fitness",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = DarkGray
                )
                Text(
                    text = "Estadísticas físicas y metas personales para alcanzar tus objetivos",
                    fontSize = 14.sp,
                    color = DarkGray.copy(alpha = 0.7f)
                )
            }
        }

        // User Info Card
        UserInfoCard(userProfile = userProfile)
        
        Spacer(modifier = Modifier.height(24.dp))
        
        // Statistics Grid
        StatsGrid(userProfile = userProfile)
    }
}

@Composable
fun UserInfoCard(
    userProfile: UserProfile,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Avatar
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .background(
                        brush = Brush.radialGradient(
                            colors = listOf(GreenGradientStart, GreenGradientEnd)
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = userProfile.name.first().toString(),
                    color = White,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            
            Spacer(modifier = Modifier.width(20.dp))
            
            Column {
                Text(
                    text = userProfile.name,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = DarkGray
                )
                Text(
                    text = "${userProfile.age} años",
                    fontSize = 14.sp,
                    color = DarkGray.copy(alpha = 0.7f)
                )
            }
            
            Spacer(modifier = Modifier.weight(1f))
            
            // Level Badge
            Card(
                colors = CardDefaults.cardColors(containerColor = Orange),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(
                    text = "Nivel\n${userProfile.level}",
                    color = White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
        }
    }
}

@Composable
fun StatsGrid(
    userProfile: UserProfile,
    modifier: Modifier = Modifier
) {
    val stats = listOf(
        listOf(
            com.example.activezonefit.data.StatCard("${userProfile.currentWeight}kg", "Peso Actual"),
            com.example.activezonefit.data.StatCard("${userProfile.height}m", "Estatura")
        ),
        listOf(
            com.example.activezonefit.data.StatCard("${userProfile.goalWeight}kg", "Meta de Peso"),
            com.example.activezonefit.data.StatCard("${userProfile.bodyFat}%", "Grasa Corporal")
        ),
        listOf(
            com.example.activezonefit.data.StatCard("${userProfile.fitnessGoals}", "Objetivos Fitness"),
            com.example.activezonefit.data.StatCard("${userProfile.sessionsActive}", "Sesiones Activas")
        )
    )
    
    Column(modifier = modifier) {
        stats.forEach { rowStats: List<com.example.activezonefit.data.StatCard> ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                rowStats.forEach { stat: com.example.activezonefit.data.StatCard ->
                    StatCardComponent(
                        stat = stat,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun StatCardComponent(
    stat: com.example.activezonefit.data.StatCard,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Progress indicator
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(4.dp)
                    .clip(RoundedCornerShape(2.dp))
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(GreenGradientStart, GreenGradientEnd)
                        )
                    )
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            Text(
                text = stat.value,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Green40
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Text(
                text = stat.label,
                fontSize = 12.sp,
                color = DarkGray.copy(alpha = 0.7f),
                fontWeight = FontWeight.Medium
            )
        }
    }
}