package com.example.pets.ActivityManu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pets.ActivityManu.ui.theme.PetsTheme
import com.example.pets.R
import com.example.pets.interface_object.*
import com.example.pets.modifier.shadow

class PatsCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Window_Pasport()
        }
    }


    @Composable
    @Preview(showBackground = true, showSystemUi = true)
    fun Window_Pasport(){

        val height = remember {
            mutableStateOf(80f)
        }
        val radius = remember {
            mutableStateOf(22f)
        }
        val shadowBorderRadius = remember {
            mutableStateOf(22f)
        }
        val offsetX = remember {
            mutableStateOf(7f)
        }
        val offsetY = remember {
            mutableStateOf(7f)
        }
        val spread = remember {
            mutableStateOf(7f)
        }
        val blurRadius = remember {
            mutableStateOf(22f)
        }
        val shadowColor = remember {
            mutableStateOf(Color.Red)
        }



        Box(Modifier.fillMaxSize()){
            Spacer(modifier = Modifier
                .width(560.dp)
                .height(638.dp)
                .rotate(45f)
                .offset(x = -165.dp, y = -50.dp)
                .clip(RoundedCornerShape(135.dp))
                .background(color = colorResource(id = R.color.Font))
            )
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(start = 16.dp, end = 16.dp, top = 79.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Kartinka_Pets()
                Box(
                    Modifier
                        .offset(y = -29.dp)
                        .shadow(
                            color = colorResource(id = R.color.teni),
                            borderRadius = shadowBorderRadius.value.dp,
                            offsetX = offsetX.value.dp,
                            offsetY = offsetY.value.dp,
                            spread = spread.value.dp,
                            blurRadius = blurRadius.value.dp
                        )) {
                    Card_Pets()
                }
                Box(Modifier.shadow(
                    color = colorResource(id = R.color.teni),
                    borderRadius = shadowBorderRadius.value.dp,
                    offsetX = offsetX.value.dp,
                    offsetY = offsetY.value.dp,
                    spread = spread.value.dp,
                    blurRadius = blurRadius.value.dp
                )) {
                    Haracterictika()
                }
                Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                    .width(257.dp)
                    .padding(top = 16.dp)) {
                    Box(Modifier.shadow(
                        color = colorResource(id = R.color.teni),
                        borderRadius = shadowBorderRadius.value.dp,
                        offsetX = offsetX.value.dp,
                        offsetY = offsetY.value.dp,
                        spread = spread.value.dp,
                        blurRadius = blurRadius.value.dp
                    )) {
                        hz()
                    }
                    Box(Modifier.shadow(
                        color = colorResource(id = R.color.teni),
                        borderRadius = shadowBorderRadius.value.dp,
                        offsetX = offsetX.value.dp,
                        offsetY = offsetY.value.dp,
                        spread = spread.value.dp,
                        blurRadius = blurRadius.value.dp
                    )) {
                        hz_2()
                    }

                }
                Box(Modifier.padding(top=16.dp)) {
                    Box(Modifier.shadow(
                        color = colorResource(id = R.color.teni),
                        borderRadius = shadowBorderRadius.value.dp,
                        offsetX = offsetX.value.dp,
                        offsetY = offsetY.value.dp,
                        spread = spread.value.dp,
                        blurRadius = blurRadius.value.dp
                    )) {
                        hz_3()
                    }

                }
            }

            BottomAppBar(
                Modifier
                    .align(Alignment.BottomEnd)
                    .height(40.dp),
                backgroundColor = Color.Gray) {
                Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
                    Icon(painter = painterResource(id = R.drawable.icon_bar_menu), contentDescription = "" )
                    Icon(painterResource(id = R.drawable.icon_bar_shop), contentDescription = "")
                    Spacer(modifier = Modifier.width(30.dp))
                    Icon(painter = painterResource(id = R.drawable.icon_bar_market), contentDescription = "" )
                    Icon(painter = painterResource(id = R.drawable.icon_bar_profil),contentDescription = null)
                }
            }
            Button(onClick = { /*TODO*/ },
                modifier= Modifier
                    .size(50.dp)
                    .align(Alignment.BottomCenter)
                    .offset(x = 0.dp, y = -7.dp),
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.Font), contentColor = Color.Black)) {
                Icon(painter = painterResource(id = R.drawable.research_microscope_science_laboratory_lab_icon_233167), contentDescription ="", tint = Color.White, modifier = Modifier.fillMaxSize() )
            }

        }
    }
}

