package com.example.pets.test_value

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.remember

var visibility1=false

@Composable
fun cc(){
   var visibility by remember {
        mutableStateOf(true)
    }
}