package com.example.multigroup.ui.theme.navhost

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.multigroup.ui.route.Screen
import com.example.multigroup.ui.home.HomeScreen
import com.example.multigroup.ui.detail.DetailScreen
import androidx.navigation.NavHostController

@Composable
fun SetUpNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(navController)
        }
        composable(Screen.Detail.route) {
            DetailScreen(navController)

        }
    }
}

