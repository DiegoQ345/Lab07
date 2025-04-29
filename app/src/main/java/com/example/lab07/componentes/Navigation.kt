package com.example.lab07.componentes


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.lab07.views.UserProfile
import com.example.lab07.views.SettingsScreen
import com.example.lab07.views.FavoritesScreen


@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            CustomScaffold(navController = navController) // Pantalla de inicio
        }
        composable("profile") {
            UserProfile() // Pantalla de perfil
        }
        composable("settings") {
            SettingsScreen() // Nueva pantalla de configuración
        }
        composable("favorites") {
            FavoritesScreen() // Nueva pantalla de favoritos
        }
    }
}

