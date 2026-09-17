package com.example.whatsapp.komunitas.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.whatsapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KomunitasUI(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Komunitas", style = MaterialTheme.typography.titleLarge)
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(painter = painterResource(R.drawable.morevert), contentDescription = null)
                    }
                }
            )
        },
        modifier = modifier.fillMaxSize()
    ) {
        ListKomunitas( modifier=modifier.padding(it))
    }
}