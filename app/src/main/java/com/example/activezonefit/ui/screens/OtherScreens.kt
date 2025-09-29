package com.example.activezonefit.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activezonefit.ui.theme.*

@Composable
fun PhotosScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(LightGray)
            .padding(24.dp)
    ) {
        ScreenHeader(
            initial = "F",
            title = "Galería de Fotos",
            subtitle = "Progreso visual de tu entrenamiento"
        )
        
        Spacer(modifier = Modifier.height(24.dp))
        
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(6) { index ->
                PhotoCard(index = index + 1)
            }
        }
    }
}

@Composable
fun VideosScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(LightGray)
            .padding(24.dp)
    ) {
        ScreenHeader(
            initial = "V",
            title = "Videos de Entrenamiento",
            subtitle = "Rutinas y ejercicios personalizados"
        )
        
        Spacer(modifier = Modifier.height(24.dp))
        
        val videos = listOf(
            "Cardio Intenso - 30min",
            "Fuerza y Resistencia",
            "Yoga Relajante",
            "HIIT Completo",
            "Flexibilidad y Movilidad"
        )
        
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(videos) { video ->
                VideoCard(title = video)
            }
        }
    }
}

@Composable
fun WebScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(LightGray)
            .padding(24.dp)
    ) {
        ScreenHeader(
            initial = "W",
            title = "Recursos Web",
            subtitle = "Enlaces útiles y contenido adicional"
        )
        
        Spacer(modifier = Modifier.height(24.dp))
        
        val webResources = listOf(
            WebResource("Calculadora de IMC", "Calcula tu índice de masa corporal", "C"),
            WebResource("Blog de Nutrición", "Consejos y recetas saludables", "N"),
            WebResource("Tienda de Suplementos", "Los mejores productos fitness", "T"),
            WebResource("Comunidad Fitness", "Conecta con otros atletas", "CF")
        )
        
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(webResources) { resource ->
                WebResourceCard(resource = resource)
            }
        }
    }
}

@Composable
fun ButtonsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(LightGray)
            .padding(24.dp)
    ) {
        ScreenHeader(
            initial = "B",
            title = "Acciones Rápidas",
            subtitle = "Botones para funciones principales"
        )
        
        Spacer(modifier = Modifier.height(24.dp))
        
        val actions = listOf(
            ActionButton("Iniciar Entrenamiento", "IE", Green40),
            ActionButton("Registrar Comida", "RC", Orange),
            ActionButton("Ver Progreso", "VP", Green40),
            ActionButton("Configuraciones", "C", DarkGray),
            ActionButton("Contactar Entrenador", "CE", Green40),
            ActionButton("Compartir Logros", "CL", Orange)
        )
        
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(actions) { action ->
                ActionButtonCard(action = action)
            }
        }
    }
}

@Composable
fun ScreenHeader(
    initial: String,
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
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
                text = initial,
                color = White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = title,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = DarkGray
            )
            Text(
                text = subtitle,
                fontSize = 14.sp,
                color = DarkGray.copy(alpha = 0.7f)
            )
        }
    }
}

@Composable
fun PhotoCard(
    index: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1f),
        colors = CardDefaults.cardColors(containerColor = White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .background(
                            color = Green40,
                            shape = RoundedCornerShape(8.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "$index",
                        color = White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Foto $index",
                    fontSize = 14.sp,
                    color = DarkGray
                )
            }
        }
    }
}

@Composable
fun VideoCard(
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .background(
                        color = Green40,
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "▶",
                    color = White,
                    fontSize = 20.sp
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = DarkGray
                )
                Text(
                    text = "Toca para reproducir",
                    fontSize = 12.sp,
                    color = DarkGray.copy(alpha = 0.6f)
                )
            }
        }
    }
}

data class WebResource(
    val title: String,
    val description: String,
    val initial: String
)

@Composable
fun WebResourceCard(
    resource: WebResource,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
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
                    text = resource.initial,
                    color = White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = resource.title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = DarkGray
                )
                Text(
                    text = resource.description,
                    fontSize = 12.sp,
                    color = DarkGray.copy(alpha = 0.6f)
                )
            }
            Text(
                text = "→",
                color = DarkGray.copy(alpha = 0.5f),
                fontSize = 16.sp
            )
        }
    }
}

data class ActionButton(
    val title: String,
    val initial: String,
    val color: Color
)

@Composable
fun ActionButtonCard(
    action: ActionButton,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = action.color),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .background(
                        color = White.copy(alpha = 0.2f),
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = action.initial,
                    color = White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = action.title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = White
            )
        }
    }
}