package com.example.whatsapp.beranda.ui

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TombolKategori(label:String, modifier: Modifier = Modifier) {
    AssistChip(
        label = {
            Text(label, style = MaterialTheme.typography.labelLarge)
        },
        onClick = {},
        shape = RoundedCornerShape(30.dp),
        colors = AssistChipDefaults.assistChipColors()
    )
}