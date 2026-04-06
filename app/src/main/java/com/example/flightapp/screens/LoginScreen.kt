package com.example.flightapp.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.flightapp.R
import com.example.flightapp.components.CustomButton
import com.example.flightapp.components.CustomInput

@Composable
fun LoginScreen(navController: NavController)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            Alignment.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.planeloginscreen),
                contentDescription = "plane image",
                modifier = Modifier.matchParentSize(),
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .matchParentSize()
                    .background(Color(0xFF2196F3).copy(alpha = 0.76f))
            )

            Text(
                text = "Planifique sus vuelos donde sea y cuando sea.",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Bienvenido/a",
            style = TextStyle(
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CustomInput(stringResource(R.string.email_input),"", "") { }

            Spacer(modifier = Modifier.height(16.dp))

            CustomInput(stringResource(R.string.password_input),"", "") { }

            Spacer(modifier = Modifier.height(32.dp))

            CustomButton("Iniciar sesión", {})

            Spacer(modifier = Modifier.height(42.dp))

            Text(
                text = "¿No tienes cuenta?",
                style = TextStyle(
                    color = Color.Gray
                )
            )

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedButton(
                onClick = { navController.navigate("signup") },
                modifier = Modifier
                    .width(250.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(8.dp)),

                border = BorderStroke(1.dp, Color(31, 147, 255))
            ) {
                BasicText(
                    text = "Registrarse",
                    style = TextStyle(
                        fontSize = 20.sp
                    )
                )
            }
        }
    }
}