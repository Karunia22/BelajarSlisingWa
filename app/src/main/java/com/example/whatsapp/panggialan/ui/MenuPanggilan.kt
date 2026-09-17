package com.example.whatsapp.panggialan.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsapp.R

@Composable
fun CircelIcon(modifier: Modifier = Modifier) {
    Surface(
        onClick = {},
        shape = CircleShape,
        color = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = Color.Black,
        modifier = Modifier.size(70.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Icon(painter = painterResource(R.drawable.telepon), contentDescription = null)
        }
    }
}

@Composable
fun MenuIcon(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        CircelIcon()
        Spacer(Modifier.height(3.dp))
        Text("Telepon", style = MaterialTheme.typography.labelMedium)
    }
}
