package com.example.flightapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.flightapp.R
import com.example.flightapp.components.CustomButton
import com.example.flightapp.components.CustomInput

@Composable
fun SignUpScreen(navController: NavController) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp, 70.dp, 24.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Crea una cuenta",
            style = TextStyle(
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold
            ),
            modifier = Modifier.padding(bottom = 24.dp)
        )

        CustomInput(stringResource(R.string.name_input),"", "") { }

        Spacer(modifier = Modifier.height(16.dp))

        CustomInput(stringResource(R.string.first_and_last_name_input),"", "") { }

        Spacer(modifier = Modifier.height(16.dp))

        CustomInput(stringResource(R.string.email_input),"", "") { }

        Spacer(modifier = Modifier.height(16.dp))

        CustomInput(stringResource(R.string.password_input),"", "") { }

        Spacer(modifier = Modifier.height(16.dp))

        CustomInput(stringResource(R.string.confirm_password),"", "") { }

        Spacer(modifier = Modifier.height(16.dp))

        CustomInput(stringResource(R.string.phone_input),"", "") { }

        Spacer(modifier = Modifier.height(50.dp))

        CustomButton("Confirmar registro", {})
    }
}