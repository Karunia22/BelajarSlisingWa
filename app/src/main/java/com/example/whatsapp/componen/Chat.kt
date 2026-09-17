package com.example.whatsapp.componen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsapp.R

@Composable
fun ChatImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .clip(CircleShape)
            .size(50.dp)
    )
}

@Composable
fun ChatMesseeges(title: String, subTitle: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(title, style = MaterialTheme.typography.titleMedium)
        Text(subTitle, style = MaterialTheme.typography.bodySmall)
    }
}

@Composable
fun ChatDate(date: String, modifier: Modifier = Modifier) {
    Text(date, style = MaterialTheme.typography.bodySmall)
}

@Composable
fun Chat(
    title: String,
    subTitle: String,
    date: String,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.fillMaxSize().height(50.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            ChatImage()
            ChatMesseeges(title, subTitle)
        }
        ChatDate(date)
    }
}