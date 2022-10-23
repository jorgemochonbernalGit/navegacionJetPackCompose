package com.example.navegarpantallas.navegacion

sealed class AppPantallas(val route:String) {
    object PrimeraPantalla:AppPantallas("primera_pantalla")
    object SegundaPantalla:AppPantallas("segunda_pantalla")
}