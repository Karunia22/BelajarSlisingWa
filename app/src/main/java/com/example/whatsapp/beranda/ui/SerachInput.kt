package com.example.whatsapp.beranda.ui

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchInput(modifier: Modifier = Modifier) {
    var value by remember { mutableStateOf("") }
    OutlinedTextField(
        value = value,
        onValueChange = {
            value = it
        },
        colors = OutlinedTextFieldDefaults.colors(
            MaterialTheme.colorScheme.surfaceVariant
        ),
        placeholder = {
            Text("Cari", style = MaterialTheme.typography.bodyMedium)
        },
        maxLines = 1,
        shape = MaterialTheme.shapes.extraLarge,
        modifier = Modifier.fillMaxWidth().defaultMinSize(minHeight = 10.dp)
    )
}