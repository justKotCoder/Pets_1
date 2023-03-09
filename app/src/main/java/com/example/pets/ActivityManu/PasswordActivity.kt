package com.example.pets.ActivityManu

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
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
import com.example.pets.ActivityManu.ui.theme.PetsTheme
import com.example.pets.R
import com.example.pets.logic.asynkClass.createNewUser.Data
import com.example.pets.navigation.navigator
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class PasswordActivity : ComponentActivity() {

    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            auth = Firebase.auth
            Window_Registration_4()
        }
    }


    @Composable
    @Preview(showSystemUi = true, showBackground = true)
    fun Window_Registration_4() {

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
                .background(colorResource(id = R.color.Font_Main))
        ) {
            Column(
                Modifier
                    .padding(start = 20.dp, end = 20.dp, top = 52.dp)
                    .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Регистрация",
                    fontSize = 28.sp,
                    color = colorResource(id = R.color.color_tema)
                )
                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 32.dp, start = 16.dp)
                ) {
                    Text(
                        "Придумайте пароль",
                        fontSize = 14.sp,
                        modifier = Modifier.align(Alignment.BottomStart),
                        color = colorResource(
                            id = R.color.color_text
                        )
                    )
                }
                TextField(
                    value = password,
                    onValueChange = {
                        password = it
                        Error = false
                    },
                    leadingIcon = { Icon(Icons.Filled.Lock, contentDescription = "Поиск") },
                    trailingIcon = {
                        if (Visibility_password_1 == false) {
                            Icon(
                                painterResource(id = R.drawable.visibility_off),
                                contentDescription = null,
                                modifier = Modifier.clickable { Visibility_password_1 = true })
                        } else {
                            Icon(
                                painterResource(id = R.drawable.visibility_on),
                                contentDescription = null,
                                modifier = Modifier.clickable { Visibility_password_1 = false })
                        }
                    },
                    shape = RoundedCornerShape(20.dp),
                    maxLines = 1,
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = colorResource(id = R.color.color_text),

                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        backgroundColor = if (Error == false) {
                            Color.White
                        } else {
                            colorResource(id = R.color.Error)
                        }
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    visualTransformation = if (Visibility_password_1 == false) {
                        PasswordVisualTransformation()
                    } else {
                        VisualTransformation.None
                    }
                )
                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, start = 16.dp)
                ) {
                    Text(
                        "Повторите пароль",
                        fontSize = 14.sp,
                        modifier = Modifier.align(Alignment.BottomStart),
                        color = colorResource(
                            id = R.color.color_text
                        )
                    )
                }
                TextField(
                    value = copy_password,
                    onValueChange = {
                        copy_password = it
                        Error = false
                    },
                    leadingIcon = { Icon(Icons.Filled.Lock, contentDescription = "Поиск") },
                    trailingIcon = {
                        if (Visibility_password_2 == false) {
                            Icon(
                                painterResource(id = R.drawable.visibility_off),
                                contentDescription = null,
                                modifier = Modifier.clickable { Visibility_password_2 = true })
                        } else {
                            Icon(
                                painterResource(id = R.drawable.visibility_on),
                                contentDescription = null,
                                modifier = Modifier.clickable { Visibility_password_2 = false })
                        }
                    },
                    shape = RoundedCornerShape(20.dp),
                    maxLines = 1,
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = colorResource(id = R.color.color_text),

                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        backgroundColor = if (Error == false) {
                            Color.White
                        } else {
                            colorResource(id = R.color.Error)
                        }
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    visualTransformation = if (Visibility_password_2 == false) {
                        PasswordVisualTransformation()
                    } else {
                        VisualTransformation.None
                    }
                )
                Text(
                    text = "Пароли не совпадают", fontSize = 12.sp, color = if (Error == true) {
                        Color.Red
                    } else {
                        Color.Transparent
                    }, modifier = Modifier.padding(top = 8.dp)
                )
                Button(
                    onClick = {
                        if (password == copy_password && password.length > 8) {

                            AddingUsersInDB(Data.email, password)
                            val intent = Intent(this@PasswordActivity, PatsCard::class.java)
                            startActivity(intent)

                        } else {
                            Error = true
                        }

                    },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(id = R.color.icon),
                        contentColor = Color.Black
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Дальше", fontSize = 22.sp, color = Color.White)
                }


            }

        }
    }


    fun AddingUsersInDB(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "createUserWithEmail:success")

                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()

                }
            }
    }
}

