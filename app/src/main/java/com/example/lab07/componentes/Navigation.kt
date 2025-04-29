package com.example.lab07.componentes


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.lab07.views.UserProfile


@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            CustomScaffold(navController = navController)
        }
        composable("profile") {
            UserProfile()
        }
    }
}
