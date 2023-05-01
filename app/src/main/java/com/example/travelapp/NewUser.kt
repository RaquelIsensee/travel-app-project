package com.example.travelapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun newUserScreen(){
    val username = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    val confirmPassword = remember {
        mutableStateOf("")
    }
    Column() {
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Username") },
            value = username.value,
            onValueChange = {
                username.value = it
                          },
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Password") },
            value = password.value,
            onValueChange = {
                password.value = it
            },
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Confirm password") },
            value = confirmPassword.value,
            onValueChange = {
                confirmPassword.value = it
                // confirmPassword should be equal to password
            },
        )
        Button(onClick = {
            //TODO
        }) {
            Text(text = "TO DO")
        }
    }
}
