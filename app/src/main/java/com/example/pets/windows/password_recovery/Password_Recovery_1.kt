package com.example.pets.windows.password_recovery



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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pets.R
import com.example.pets.navigation.navigator

import com.example.pets.test_value.visibility1
import kotlinx.coroutines.launch

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun Window_Password_Recovery_1(){
    var email by remember {
        mutableStateOf("")
    }


    Box(Modifier.fillMaxSize()) {
        Column(
            Modifier
                .padding(start = 20.dp, end = 20.dp, top = 52.dp)
                .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text ="Забыли пароль?", fontSize = 28.sp)
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, start = 16.dp)) {
                Text("Введите email", fontSize = 14.sp, modifier =Modifier.align(Alignment.BottomStart))
            }
            TextField(
                value = email,
                onValueChange ={email=it},
                leadingIcon = { Icon(Icons.Filled.Email, contentDescription = "Поиск") },
                shape = RoundedCornerShape(20.dp),
                maxLines = 1,
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.Gray,

                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Button(onClick = {

                navigator?.navigate("Password_Recovery_2")


            },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.gray), contentColor = Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp)) {
                Text(text = "Отправить письмо", fontSize = 22.sp)
            }


        }

    }
}