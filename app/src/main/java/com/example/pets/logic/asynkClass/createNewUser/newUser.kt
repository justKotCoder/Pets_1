package com.example.pets.logic.asynkClass.createNewUser

import android.content.ContentValues.TAG
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

private lateinit var auth: FirebaseAuth

fun CreateUser(name: String, password: String, email: String){
    init()
    auth.createUserWithEmailAndPassword(email, password)
        .addOnCompleteListener() { task ->
            if (task.isSuccessful) {
                // Sign in success, update UI with the signed-in user's information

            } else {
                // If sign in fails, display a message to the user.

            }
        }

}
fun init(){
    auth= Firebase.auth;
}