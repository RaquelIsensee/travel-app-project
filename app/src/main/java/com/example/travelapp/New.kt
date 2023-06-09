package com.example.myapplication

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
fun New(){
    val destination = remember {
        mutableStateOf("")
    }
    val startDate = remember {
        mutableStateOf("")
    }
    val endDate = remember {
        mutableStateOf("")
    }
    val budget = remember {
        mutableStateOf("")
    }
    Column() {
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Destination") },
            value = destination.value,
            onValueChange = {
                destination.value = it
            },
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Start Date") },
            value = startDate.value,
            onValueChange = {
                startDate.value = it
            },
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "End Date") },
            value = endDate.value,
            onValueChange = {
                endDate.value = it
            },
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Budget") },
            value = budget.value,
            onValueChange = {
                budget.value = it
            },
        )
        Button(onClick = {
            //TODO
        }) {
            Text(text = "TO DO")
        }

    }
}