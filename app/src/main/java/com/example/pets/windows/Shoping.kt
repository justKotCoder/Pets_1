package com.example.pets.windows

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.pets.interface_object.*
import com.example.pets.R


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Window_Shop() {
    Box(Modifier.fillMaxSize()) {
        //Главное окно
        Column(
            Modifier
                .fillMaxSize()
                .padding(start = 16.dp, top = 20.dp, end = 16.dp)
        ) {
            Row() {
                Search()
                Box(Modifier.width(23.dp)) {}
                Profile()
            }
            Row(modifier = Modifier.padding(top = 12.dp)) {
                Filter()
                Box(Modifier.width(5.dp))
                Filter_Back()
            }

            LazyColumn(Modifier.fillMaxSize()){
                items(count = 10){
                    Spucok()
                }
            }



        }

        BottomAppBar(
            Modifier
                .align(Alignment.BottomEnd)
                .height(40.dp),
            backgroundColor = Color.Gray) {
            Row(horizontalArrangement =Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
                Icon(painter = painterResource(id = R.drawable.icon_bar_menu), contentDescription = "" )
                Icon(painterResource(id = R.drawable.icon_bar_shop), contentDescription = "")
                Spacer(modifier = Modifier.width(30.dp))
                Icon(painter = painterResource(id = R.drawable.icon_bar_market), contentDescription = "" )
                Icon(painter = painterResource(id = R.drawable.icon_bar_profil),contentDescription = null)
            }
        }
        Button(onClick = {
            //avigator?.navigate("Pasword")
                         },
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