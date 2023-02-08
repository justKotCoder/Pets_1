package com.example.pets.windows

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pets.R

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun Glavnoe_Windows (){
    Box(Modifier
        .fillMaxSize()
        .background(color = colorResource(id = R.color.Font_Main))) {
        Box(
            Modifier
                .width(260.dp)
                .height(260.dp)
                .align(Alignment.Center)
                .clip(CircleShape)
                .background(color = colorResource(id = R.color.icon))){
            Icon(painter = painterResource(id = R.drawable.research_microscope_science_laboratory_lab_icon_233167), contentDescription =null,
                Modifier
                    .width(125.dp)
                    .height(125.dp)
                    .align(
                        Alignment.Center
                    ), tint = Color.White)
        }
        Text(text = "Coder Kot", fontSize = 28.sp, modifier = Modifier
            .align(Alignment.BottomCenter)
            .padding(bottom = 195.dp), color = colorResource(
            id = R.color.icon
        ))
    }
}