package com.example.whatsapp.pembaruan.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ListPembaruan(modifier : Modifier = Modifier
) {
    val list = arrayOf(
        "Aldi",
        "Bella",
        "Candra",
        "Dewi",
        "Erwin",
        "Fitri"
    )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(5.dp),
        modifier = modifier
    ) {
        item{
            KotakStatus("Saya")
        }
        items(list){
            KotakStatus(it)
        }
    }
}