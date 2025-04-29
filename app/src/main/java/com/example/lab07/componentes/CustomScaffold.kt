package com.example.lab07.componentes


import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CustomScaffold(navController: NavController) {
    Scaffold(
        topBar = { CustomTopBar(navController) },
        bottomBar = { CustomBottomBar() },
        floatingActionButton = { CustomFAB() },
        content = { padding ->
            CustomContent(padding)
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar(navController: NavController) {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { /* Abrir menú lateral si se desea */ }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
            }
        },
        title = { Text(text = "Sample Title") },
        actions = {
            IconButton(onClick = { /* Acción de búsqueda */ }) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Buscar")
            }
            IconButton(onClick = { navController.navigate("profile") }) {
                Icon(imageVector = Icons.Outlined.AccountCircle, contentDescription = "Perfil")
            }
        }
    )
}

@Composable
fun CustomBottomBar() {
    BottomAppBar {
        IconButton(onClick = { /* Acción para botón inferior */ }) {
            Icon(imageVector = Icons.Default.Home, contentDescription = "Inicio")
        }
    }
}

@Composable
fun CustomFAB() {
    FloatingActionButton(onClick = { /* Acción del FAB */ }) {
        Icon(imageVector = Icons.Default.Add, contentDescription = "Añadir")
    }
}

@Composable
fun CustomContent(padding: PaddingValues) {
    Column(modifier = Modifier
        .padding(padding)
        .padding(16.dp)) {
        Text("Este es el contenido principal.")
    }
}
