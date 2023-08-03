package com.example.lazycolumndemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var personRepository = PersonRepository()
            var getAllData = personRepository.getAllData()

            LazyColumn() {
                items(items = getAllData) { persons ->
                    CustomItem(person = persons)
                }
            }
        }
    }
}


