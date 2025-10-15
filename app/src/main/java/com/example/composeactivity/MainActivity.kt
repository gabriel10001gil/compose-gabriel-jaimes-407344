package com.example.composeactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composeactivity.ui.theme.ComposeActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeActivityTheme {
                // Llamamos directamente al Composable que contiene la navegación
                Activity3_04Screen()
            }
        }
    }
}

// Rutas de Navegación
object Destinations {
    const val SCREEN_A = "screenA"
    const val SCREEN_B = "screenB"
}

@Composable
fun Activity3_04Screen(modifier: Modifier = Modifier) {
    // Controlador de navegación
    val navController = rememberNavController()

    Scaffold(modifier = modifier.fillMaxSize()) { innerPadding ->
        // NavHost define el grafo de navegación
        NavHost(
            navController = navController,
            startDestination = Destinations.SCREEN_A,
            modifier = Modifier.padding(innerPadding) // Usamos el padding del Scaffold aquí
        ) {
            composable(Destinations.SCREEN_A) {
                ScreenA(navController = navController)
            }
            composable(Destinations.SCREEN_B) {
                ScreenB(navController = navController)
            }
        }
    }
}

@Composable
fun ScreenA(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(1