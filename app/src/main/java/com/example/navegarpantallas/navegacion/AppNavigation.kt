package com.example.navegarpantallas.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navegarpantallas.pantallas.PrimeraPantalla
import com.example.navegarpantallas.pantallas.SegundaPantalla

@Composable
fun AppNavigation() {
    val navContreoller = rememberNavController()
    NavHost(navController = navContreoller, startDestination = AppPantallas.PrimeraPantalla.route) {
        composable(route = AppPantallas.PrimeraPantalla.route) {
            PrimeraPantalla(navContreoller)
        }
        composable(route = AppPantallas.SegundaPantalla.route) {
            SegundaPantalla(navContreoller)
        }
    }
}