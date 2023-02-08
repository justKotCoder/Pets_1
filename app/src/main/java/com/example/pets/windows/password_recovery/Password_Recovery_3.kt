package com.example.pets.windows.password_recovery






import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pets.R
import com.example.pets.navigation.navigator

import kotlinx.coroutines.launch

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun Window_Password_Recovery_3(){
    var password by remember {
        mutableStateOf("")
    }
    var copy_password by remember {
        mutableStateOf("")
    }
    var Error by remember {
        mutableStateOf(false)
    }
    var Visibility_password_1 by remember {
        mutableStateOf(false)
    }
    var Visibility_password_2 by remember {
        mutableStateOf(false)
    }

    Box(
        Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.Font_Main))) {
        Column(
            Modifier
                .padding(start = 20.dp, end = 20.dp, top = 52.dp)
                .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text ="Забыли пароль?", fontSize = 28.sp, color = colorResource(id = R.color.color_tema))
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, start = 16.dp)) {
                Text("Придумайте пароль", fontSize = 14.sp, modifier =Modifier.align(Alignment.BottomStart),color= colorResource(
                    id = R.color.color_text
                ))
            }
            TextField(
                value = password,
                onValueChange ={password=it},
                leadingIcon = { Icon(Icons.Filled.Lock, contentDescription = "Поиск") },
                trailingIcon = { if(Visibility_password_1==false){
                    Icon(painterResource(id = R.drawable.visibility_off), contentDescription =null, modifier = Modifier.clickable { Visibility_password_1=true })
                }
                else{Icon(painterResource(id = R.drawable.visibility_on), contentDescription =null, modifier = Modifier.clickable { Visibility_password_1=false })}               }
                ,
                shape = RoundedCornerShape(20.dp),
                maxLines = 1,
                colors = TextFieldDefaults.textFieldColors(
                    textColor = colorResource(id = R.color.color_text),

                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    backgroundColor = Color.White
                ),
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = if(Visibility_password_1==false){PasswordVisualTransformation()}else{
                    VisualTransformation.None}
            )
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 16.dp)) {
                Text("Повторите пароль", fontSize = 14.sp, modifier =Modifier.align(Alignment.BottomStart),color= colorResource(
                    id = R.color.color_text
                ))
            }
            TextField(
                value = copy_password,
                onValueChange ={copy_password=it},
                leadingIcon = { Icon(Icons.Filled.Lock, contentDescription = "Поиск") },
                trailingIcon = { if(Visibility_password_2==false){
                    Icon(painterResource(id = R.drawable.visibility_off), contentDescription =null, modifier = Modifier.clickable { Visibility_password_2=true })
                }
                else{Icon(painterResource(id = R.drawable.visibility_on), contentDescription =null, modifier = Modifier.clickable { Visibility_password_2=false })}               }

                ,
                shape = RoundedCornerShape(20.dp),
                maxLines = 1,
                colors = TextFieldDefaults.textFieldColors(
                    textColor = colorResource(id = R.color.color_text),

                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    backgroundColor = Color.White
                ),
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = if(Visibility_password_2==false){PasswordVisualTransformation()}else{
                    VisualTransformation.None}
            )
            Text(text = "Пароли не совпадают", fontSize = 12.sp, color = if(Error==true){Color.Red}else{Color.Transparent}, modifier = Modifier.padding(top=8.dp))
            Button(onClick = {

                if(password==copy_password &&password.length>8 &&copy_password.length>8)
                    navigator?.run { navigate("Autorization"){popUpTo(0)}
                    }
                else{
                    Error=true
                }

            },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.icon), contentColor = Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)) {
                Text(text = "Дальше", fontSize = 22.sp,color=Color.White)
            }


        }

    }
}