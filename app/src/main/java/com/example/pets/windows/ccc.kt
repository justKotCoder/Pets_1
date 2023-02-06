package com.example.pets.windows

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import com.example.pets.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pets.navigation.Nav

import com.example.pets.navigation.navigator


@Composable
fun ttt(){
    Scaffold(bottomBar = {
        AnimatedVisibility(visible = true) {
            Box(Modifier.fillMaxWidth()) {
                BottomNavigation(
                    Modifier
                        .height(60.dp)
                        .padding(top = 20.dp),
                    backgroundColor = Color.Gray
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceAround,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_bar_menu),
                            contentDescription = ""
                        )
                        Icon(
                            painterResource(id = R.drawable.icon_bar_shop),
                            contentDescription = ""
                        )
                        Spacer(modifier = Modifier.width(30.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.icon_bar_market),
                            contentDescription = ""
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.icon_bar_profil),
                            contentDescription = null
                        )
                    }
                }
                Button(
                    onClick = { navigator?.run { navigate("Pasword") } },
                    modifier = Modifier
                        .size(50.dp)
                        .align(Alignment.BottomCenter)
                        .offset(x = 0.dp, y = -7.dp),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(
                            id = R.color.Font
                        ), contentColor = Color.Black
                    )
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.research_microscope_science_laboratory_lab_icon_233167),
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }) {
        Nav()


    }

}