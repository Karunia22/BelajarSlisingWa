package com.example.whatsapp.beranda.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ListKatgori(list:Array<String> = arrayOf("Semua", "Belum Dibaca", "Favorit", "Group", "Komunitas", "+"), modifier: Modifier = Modifier) {
    LazyRow(
//        contentPadding = PaddingValues(10.dp),
        horizontalArrangement = Arrangement.spacedBy(6.dp),
        modifier = modifier
    ) {
        items(items = list){
            TombolKategori(it)
        }
    }
}