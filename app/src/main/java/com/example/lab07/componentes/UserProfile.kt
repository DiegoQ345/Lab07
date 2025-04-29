package com.example.lab07.componentes


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.TopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserProfile() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Perfil de Usuario") }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            Text("Nombre: Juan Pérez")
            Text("Email: juanperez@example.com")
            // Agrega más información del perfil si deseas
        }
    }
}
