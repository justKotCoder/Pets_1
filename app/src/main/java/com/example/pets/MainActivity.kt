package com.example.pets

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pets.interface_object.Kartinka_Pets
import com.example.pets.interface_object.Search
import com.example.pets.interface_object.like_shop
import com.example.pets.navigation.Nav
import com.example.pets.navigation.navigator

import com.example.pets.setting.color
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.lifecycle.lifecycleScope
import com.example.pets.ActivityManu.MainAuthorization
import com.example.pets.test_value.visibility1
import com.example.pets.ui.theme.PetsTheme
import com.example.pets.windows.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            delay(50)
            window.setBackgroundDrawableResource(android.R.color.transparent)
        }
        setContent {
            var visibility by remember {
                mutableStateOf(false)
            }
            PetsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {


                    Scaffold(bottomBar = {
                        AnimatedVisibility(visible = visibility) {
                            Box(Modifier.fillMaxWidth()) {
                                BottomNavigation(
                                    Modifier
                                        .height(60.dp)
                                        .padding(top = 20.dp),
                                    backgroundColor = androidx.compose.ui.graphics.Color.Gray
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
                                        ), contentColor = androidx.compose.ui.graphics.Color.Black
                                    )
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.research_microscope_science_laboratory_lab_icon_233167),
                                        contentDescription = "",
                                        tint = androidx.compose.ui.graphics.Color.White,
                                        modifier = Modifier.fillMaxSize()
                                    )
                                }
                            }
                        }
                    }) {
                        val intent = Intent(this, MainAuthorization::class.java)
                        startActivity(intent)
                    }
                }
            }
        }
        lifecycleScope.launch {
           // delay(3000)
            navigator?.run { navigate("Autorization"){popUpTo(0)}}
        }

    }

}


// color= Color.RED
//Window_Shop()
//Window_Pasport()
// Kartinka_Pets()
//por()
// Nav()