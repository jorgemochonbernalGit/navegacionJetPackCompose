package com.example.navegarpantallas.pantallas

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.navegarpantallas.navegacion.AppPantallas

@Composable
fun PrimeraPantalla(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar() {
            Text(text = "Primera pantalla")
        }
    }) { BodyContent(navController) }
}

@Composable
fun BodyContent(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hola navegación")
        Button(onClick = {
            navController.navigate(route = AppPantallas.SegundaPantalla.route)
        }) {
            Text(text = "Ir")
        }
    }
}
