package com.example.lab07.componentes


import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
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
        // Usamos Row para distribuir los iconos de forma uniforme
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly, // O Arrangement.SpaceBetween
            modifier = Modifier.fillMaxWidth() // Para que ocupe todo el ancho de la pantalla
        ) {
            IconButton(onClick = { print("Build") }) {
                Icon(Icons.Filled.Build, contentDescription = "Build description")
            }
            IconButton(onClick = { print("Menu") }) {
                Icon(
                    Icons.Filled.Menu,
                    contentDescription = "Menu description",
                )
            }
            IconButton(onClick = { print("Favorite") }) {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Favorite description",
                )
            }
            IconButton(onClick = { print("Delete") }) {
                Icon(
                    Icons.Filled.Delete,
                    contentDescription = "Delete description",
                )
            }
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
