package com.example.whatsapp.beranda.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.whatsapp.componen.Chat

@Composable
fun ListBeranda(listChat: Array<String>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.padding(horizontal = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        item {
            SearchInput()
        }
        item {
            ListKatgori()
        }
        items(items=listChat) {chat->
            Chat(
                title = chat,
                subTitle = "siapa",
                date = "sekarang"
            )
        }
        item {
            Spacer(Modifier.height(100.dp))
        }
    }
}