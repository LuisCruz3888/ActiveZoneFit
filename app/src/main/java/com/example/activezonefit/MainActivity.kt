package com.example.activezonefit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.activezonefit.data.UserProfile
import com.example.activezonefit.ui.components.Sidebar
import com.example.activezonefit.ui.screens.*
import com.example.activezonefit.ui.theme.ActiveZoneFitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ActiveZoneFitTheme {
                ActiveZoneFitApp()
            }
        }
    }
}

@Composable
fun ActiveZoneFitApp() {
    var selectedMenuItem by remember { mutableStateOf("Perfil") }
    val userProfile = UserProfile()

    Row(modifier = Modifier.fillMaxSize()) {
        // Sidebar
        Sidebar(
            selectedMenuItem = selectedMenuItem,
            onMenuItemClick = { menuItem ->
                selectedMenuItem = menuItem
            }
        )
        
        // Main Content
        Box(modifier = Modifier.weight(1f)) {
            when (selectedMenuItem) {
                "Perfil" -> ProfileScreen(userProfile = userProfile)
                "Fotos" -> PhotosScreen()
                "Videos" -> VideosScreen()
                "Web" -> WebScreen()
                "Botones" -> ButtonsScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ActiveZoneFitAppPreview() {
    ActiveZoneFitTheme {
        ActiveZoneFitApp()
    }
}