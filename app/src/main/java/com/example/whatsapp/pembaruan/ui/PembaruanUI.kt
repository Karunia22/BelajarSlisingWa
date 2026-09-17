package com.example.whatsapp.pembaruan.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.whatsapp.R
import com.example.whatsapp.componen.Chat

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PembaruanUI(modifier: Modifier = Modifier) {
    val user = arrayOf("Budi",
        "Citra",
        "Dimas",
        "Eka",
        "Fajar",
        "Gita",
        "Hendra",
        "Indah",
        "Joko",)
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Pembaruan", style = MaterialTheme.typography.titleLarge)
                },
                actions = {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        IconButton(
                            onClick = {}
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.search),
                                contentDescription = null
                            )
                        }
                        IconButton(
                            onClick = {}
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.morevert),
                                contentDescription = null
                            )
                        }
                    }
                }
            )
        },
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier.padding(it)){
            item {
                Templat("Status") {
                    ListPembaruan()
                }
            }
            item {
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth().padding(10.dp)
                ) {
                    Text("Saluran", style = MaterialTheme.typography.titleLarge)
                    Button (
                        onClick = {}
                    ) {
                        Text("Jelajahi", style = MaterialTheme.typography.labelLarge)
                    }
                }
            }
            items(user){
                Chat(it, "siapa", "sekarang", Modifier.padding(10.dp))
            }
            item {
                Spacer(Modifier.height(70.dp))
            }
        }
    }
}