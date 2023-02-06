package com.example.pets.interface_object

import android.graphics.BlurMaskFilter
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pets.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment



@Composable
@Preview(showBackground = true)
fun Kartinka_Pets(){
    var visibility by remember {
        mutableStateOf(false)
    }
    Box(modifier = Modifier
        .width(327.dp)
        .height(257.dp)
        .clip(RoundedCornerShape(18.dp))
    ) {
        Image(painter = painterResource(id = R.drawable.kot) , contentDescription ="",Modifier.fillMaxSize())
        Column(
            Modifier
                .width(57.dp)
                .align(alignment = Alignment.TopEnd)
                .padding(top = 4.dp, end = 4.dp)) {
            Spacer(modifier = Modifier.size(57.dp))
            Box(
                Modifier
                    .width(46.dp)
                    .height(104.dp)
                    .padding(start = 6.dp)
                    .offset(x = 0.dp, y = -12.dp)
                    .clip(
                        RoundedCornerShape(
                            bottomEnd = 20.dp,
                            bottomStart = 20.dp
                        )
                    )
                    ){
                this@Column.AnimatedVisibility(visible =visibility ) {


                    Column(
                        Modifier
                            .fillMaxSize()
                            .align(Alignment.Center)
                            .background(Color.White),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_edit),
                            contentDescription = "",
                            Modifier.padding(top = 12.dp),
                            tint = colorResource(id = R.color.Font)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.icon_kalendar),
                            contentDescription = "",
                            Modifier.padding(top = 16.dp),
                            tint = colorResource(id = R.color.Font)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.icon_health),
                            contentDescription = "",
                            Modifier.padding(top = 16.dp),
                            tint = colorResource(id = R.color.Font)
                        )
                    }
                }

            }
        }
        OutlinedButton(onClick = {visibility=!visibility},
            modifier= Modifier
                .size(57.dp)
                .align(Alignment.TopEnd)
                .padding(top = 4.dp, end = 4.dp),
            shape = CircleShape,
            contentPadding = PaddingValues(0.dp),
        ) {
            // Adding an Icon "Add" inside the Button
            Icon(painter = painterResource(id = R.drawable.icon_profil) ,contentDescription = "content description",tint = colorResource(id = R.color.Font))
        }

    }
}

@Composable
@Preview(showBackground = true)
fun Card_Pets(){
    var Name by remember {
        mutableStateOf("София")
    }
    var Age by remember {
        mutableStateOf("3 года")
    }


    Box(
        Modifier
            .width(257.dp)
            .height(81.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(Color.White)



            ){
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, start = 0.dp),horizontalArrangement = Arrangement.SpaceAround) {
            Column {
                Text(text = Name, fontSize = 22.sp)
                Text(text="Не уствновлено", fontSize = 14.sp)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally,) {
                Icon(painter = painterResource(id = R.drawable.baseline_female_24),contentDescription = null,
                    Modifier
                        .rotate(18f)
                        .padding(top = 3.dp))
                Text(text =Age, fontSize = 14.sp, modifier = Modifier.padding(top=3.dp) )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun Haracterictika(){
    var Bec by remember(){
        mutableStateOf("2.4 кг")
    }
    Box(
        Modifier
            .width(257.dp)
            .height(103.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(Color.White)
    ){
        Column(
            Modifier
                .padding(top = 18.dp, bottom = 18.dp)
                .fillMaxHeight(),verticalArrangement = Arrangement.SpaceBetween) {
            Row(Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceAround){
                Text(text="Вес", fontSize = 14.sp)
                Text(text="_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _",fontSize=14.sp)
                Text(text = Bec, fontSize = 14.sp)
            }
            Row(Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceAround){
                Text(text="Параметры", fontSize = 14.sp)
                Text(text="_ _ _ _ _ _ _ _ _ _ _ _ _",fontSize=14.sp)
                Text(text = Bec, fontSize = 14.sp)
            }
            Row(Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceAround){
                Text(text="Параметры", fontSize = 14.sp)
                Text(text="_ _ _ _ _ _ _ _ _ _ _ _ _",fontSize=14.sp)
                Text(text = Bec, fontSize = 14.sp)
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun hz(){
    Box(
        Modifier
            .width(120.dp)
            .height(76.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(Color.White)
    ){}
}

@Composable
@Preview(showBackground = true)
fun hz_2(){
    Box(
        Modifier
            .width(120.dp)
            .height(76.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(Color.White)
    ){}
}

@Composable
@Preview(showBackground = true)
fun hz_3(){
    Box(
        Modifier
            .width(255.dp)
            .height(76.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(Color.White)
    ){}
}