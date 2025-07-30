package com.example.multigroup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.multigroup.ui.theme.MultiGroupTheme
import com.example.multigroup.ui.theme.navhost.SetUpNavHost
import androidx.navigation.NavHostController

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MultiGroupTheme {
                navController = rememberNavController()
                SetUpNavHost(navController)

                }
            }
        }
    }

