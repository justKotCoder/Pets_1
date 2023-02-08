package com.example.pets.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pets.windows.*
import com.example.pets.windows.password_recovery.*
import com.example.pets.windows.registration.*


var navigator: NavHostController? =null

@Composable
fun Nav(){
    val navController = rememberNavController()
    navigator=navController
    NavHost(navController = navController, startDestination = "Autorization"){

        composable(route = "Main"){
            Window_Shop()
       }
        composable(route = "Pasword"){
            Window_Pasport()
        }
        composable(route = "Registration") {
            Window_Registration()
        }
        composable(route = "Autorization") {
            Window_Autorization()
        }

        composable(route="Password_Recovery_1"){
            Window_Password_Recovery_1()
        }
        composable(route="Password_Recovery_2"){
            Windows_Password_Recovery_2()
        }
        composable(route="Password_Recovery_3"){
            Window_Password_Recovery_3()
        }
        composable(route="Registration_1"){
            Window_Registration_1()
        }
        composable(route="Registration_2"){
            Window_Registration_2()
        }
        composable(route="Registration_3"){
            Window_Registration_3()
        }
        composable(route="Registration_4"){
            Window_Registration_4()
        }

        composable(route = "test1") {
            test_1()
        }
        composable(route="GG"){
            Glavnoe_Windows()
        }


  }

}