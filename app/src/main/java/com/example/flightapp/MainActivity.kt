package com.example.flightapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.flightapp.components.CustomButton
import com.example.flightapp.components.CustomInput
import com.example.flightapp.navigation.AppNavigation
import com.example.flightapp.screens.LoginScreen
import com.example.flightapp.ui.theme.FlightAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FlightAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting()
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting() {
    AppNavigation()
}

@Composable
fun GreetingPreview() {
}