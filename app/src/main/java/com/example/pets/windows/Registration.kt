package com.example.pets.windows



import android.app.Activity
import android.content.Intent
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pets.ActivityManu.PatsCard
import com.example.pets.R
import com.example.pets.navigation.navigator

import com.example.pets.test_value.visibility1
import kotlinx.coroutines.launch

@Composable
@Preview( showBackground = true)
fun Window_Registration(@PreviewParameter(PreviewParameterProvider::class) activity: Activity){
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { mutableStateOf(SnackbarHostState()) }

    Box(
        Modifier
            .fillMaxSize()) {
        Column(
            Modifier
                .padding(start = 20.dp, end = 20.dp, top = 52.dp)
                .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text ="Регистрация", fontSize = 28.sp)
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
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 16.dp)) {
                Text("Введите пароль", fontSize = 14.sp, modifier =Modifier.align(Alignment.BottomStart))
            }
            TextField(
                value = password,
                onValueChange ={password=it},
                leadingIcon = { Icon(Icons.Filled.Lock, contentDescription = "Поиск") },
                shape = RoundedCornerShape(20.dp),
                maxLines = 1,
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.Gray,

                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation()
            )
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(end = 9.dp)) {
                Text("", fontSize = 14.sp,
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .clickable { }
                )
            }
            Button(onClick = {

                scope.launch {
                    snackbarHostState.value.showSnackbar("Регистрация произошла успешно")
                }
                navigator?.run { navigate("Autorization") }


                             },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.gray), contentColor = Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 54.dp)) {
                Text(text = "Зарегистрироваться", fontSize = 22.sp)
            }
            Text(text = "Уже зарегистрирован", fontSize = 14.sp, modifier = Modifier
                .padding(top = 8.dp)
                .clickable { navigator?.run { navigate("Autorization") } })

        }
        SnackbarHost(snackbarHostState.value,Modifier.align(Alignment.BottomEnd))

    }
}