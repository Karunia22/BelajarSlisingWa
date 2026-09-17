package com.example.whatsapp.panggialan.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.whatsapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PanggilanUI(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Panggilan", style = MaterialTheme.typography.titleLarge)
                },
                actions = {
                    IconButton (onClick = {}) {
                        Icon(painter = painterResource(R.drawable.morevert), contentDescription = null)
                    }
                }
            )
        },
        floatingActionButton = {
            Column(
                modifier = Modifier
            ) {
                FloatingActionButton (
                    onClick = {},
                    modifier = modifier
                        .height(70.dp)
                        .width(70.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.chatadd),
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                }
                Spacer(Modifier.height(100.dp))
            }
        },
        modifier =  Modifier.fillMaxSize()
    ) {
        ListPanggilan(Modifier.padding(it))
    }
}