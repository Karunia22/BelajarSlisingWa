package com.example.whatsapp.panggialan.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.whatsapp.componen.Chat

@Composable
fun ListPanggilan(modifier: Modifier = Modifier) {
    val listChat = arrayOf(
        "Andi",
        "Budi",
        "Citra",
        "Dimas",
        "Eka",
    )
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = modifier.padding()
        ) {
            item {
                Surface(
                    modifier = Modifier.padding(horizontal = 10.dp)
                ) {
                    Text("Terbaru", style = MaterialTheme.typography.titleLarge)
                }
            }
            item {
                ListMenu()
            }
            item {
                Surface(
                    modifier = Modifier.padding(horizontal = 10.dp)
                ) {
                    Text("Terbaru", style = MaterialTheme.typography.titleLarge)
                }
            }
            items(listChat){
                Surface(
                    modifier = Modifier.padding(horizontal = 10.dp)
                ) {
                    Chat(it, "siapa", "sekarang")
                }
            }
        }
    }
}