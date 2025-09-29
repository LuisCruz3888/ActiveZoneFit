package com.example.activezonefit.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activezonefit.ui.theme.*

data class MenuItem(
    val title: String,
    val initial: String,
    val isSelected: Boolean = false
)

@Composable
fun Sidebar(
    selectedMenuItem: String,
    onMenuItemClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val menuItems = listOf(
        MenuItem("Perfil", "P", selectedMenuItem == "Perfil"),
        MenuItem("Fotos", "F", selectedMenuItem == "Fotos"),
        MenuItem("Videos", "V", selectedMenuItem == "Videos"),
        MenuItem("Web", "W", selectedMenuItem == "Web"),
        MenuItem("Botones", "B", selectedMenuItem == "Botones")
    )

    Column(
        modifier = modifier
            .fillMaxHeight()
            .width(200.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(GreenGradientStart, GreenGradientEnd)
                )
            )
            .padding(16.dp)
    ) {
        // Header
        Column(
            modifier = Modifier.padding(bottom = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "ActiveZoneFit",
                color = White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Tu Entrenador Personal",
                color = White.copy(alpha = 0.8f),
                fontSize = 12.sp
            )
        }

        // Menu Items
        menuItems.forEach { item ->
            MenuItemComponent(
                item = item,
                onClick = { onMenuItemClick(item.title) }
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
fun MenuItemComponent(
    item: MenuItem,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick() },
        colors = CardDefaults.cardColors(
            containerColor = if (item.isSelected) 
                White.copy(alpha = 0.2f) 
            else 
                Color.Transparent
        ),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(20.dp)
                    .background(
                        color = White.copy(alpha = 0.3f),
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = item.initial,
                    color = White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = item.title,
                color = White,
                fontSize = 14.sp,
                fontWeight = if (item.isSelected) FontWeight.Bold else FontWeight.Normal
            )
        }
    }
}