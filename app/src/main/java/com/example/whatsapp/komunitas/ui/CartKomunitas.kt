package com.example.whatsapp.komunitas.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.whatsapp.componen.Chat

@Composable
fun Komunitas(title:String, list: Array<String> = arrayOf("kamu", "kamu", "kamu","kamu","kamu","kamu"), modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.elevatedCardElevation(2.dp),
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp),
            modifier = Modifier.padding(10.dp)
        ) {
            Header(title)
            HorizontalDivider(thickness = 1.dp)
            for (i in 0..3){
                Chat("Ucup", "iya", "sekaragn")
            }
            if (list.size > 3){
                TextButton(
                    onClick = {}
                ) {
                    Text("Lihat semuanya")
                }
            }
        }

    }
}