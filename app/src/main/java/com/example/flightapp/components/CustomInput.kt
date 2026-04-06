package com.example.flightapp.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle

@Composable
fun CustomInput(
    label: String,
    value: String,
    placeholder: String,
    onValueChange:(String) -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        BasicText(
            text = label,
            style = androidx.compose.ui.text.TextStyle(
                color = Color.Gray,
                fontSize = 14.sp
            ),
            modifier = Modifier.padding(bottom = 4.dp)
        )

        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            textStyle = androidx.compose.ui.text.TextStyle(
                color = Color.Black,
                fontSize = 16.sp
            ),
            decorationBox = { innerTextField ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .clip(RoundedCornerShape(6.dp))
                        .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
                        .padding(horizontal = 16.dp),
                    contentAlignment = Alignment.CenterStart
                ){
                    if (value.isEmpty()) {
                        BasicText(
                            text = placeholder,
                            style = androidx.compose.ui.text.TextStyle(
                                color = Color.LightGray,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CustomInputPreview(){
    CustomInput("Input", "", "Escribe el texto...", onValueChange = {})
}