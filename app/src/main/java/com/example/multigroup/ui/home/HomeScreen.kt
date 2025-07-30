package com.example.multigroup.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.foundation.clickable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import com.example.multigroup.ui.route.Screen

@Composable
fun HomeScreen(navController: NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(), // ✅ doğru yazım
        verticalArrangement = Arrangement.Center, // ✅ doğru yazım
        horizontalAlignment = Alignment.CenterHorizontally // ✅ doğru yazım
    ) {
        Text(
            text = "Home Screen",
            modifier = Modifier.clickable {
                navController.navigate(Screen.Detail.route)
            },
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}
