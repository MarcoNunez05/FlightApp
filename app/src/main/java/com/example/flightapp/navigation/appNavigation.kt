package com.example.flightapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.flightapp.screens.LoginScreen
import com.example.flightapp.screens.SignUpScreen

@Composable
fun AppNavigation(){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "Login"
    ) {
        composable("login") {
            LoginScreen(navController)
        }
        composable("signup") {
            SignUpScreen(navController)
        }
    }
}