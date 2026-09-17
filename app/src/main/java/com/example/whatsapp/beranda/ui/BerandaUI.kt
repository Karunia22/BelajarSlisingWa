package com.example.whatsapp.beranda.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.whatsapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BerandaUI(modifier: Modifier = Modifier) {
    val listChat = arrayOf(
        "Andi",
        "Budi",
        "Citra",
        "Dimas",
        "Eka",
        "Fajar",
        "Gita",
        "Hendra",
        "Indah",
        "Joko",
        "Karin",
        "Lukman",
        "Maya",
        "Nanda",
        "Oscar",
        "Putri",
        "Rizky",
        "Salsa",
        "Taufik",
        "Uli",
        "Vina",
        "Wahyu",
        "Yuni",
        "Zaki",
        "Aldi",
        "Bella",
        "Candra",
        "Dewi",
        "Erwin",
        "Fitri"
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "WhatsApp",
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.Bold
                    )
                },
                actions = {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        IconButton(
                            onClick = {}
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.camera),
                                contentDescription = null
                            )
                        }
                        IconButton(
                            onClick = {}
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.morevert),
                                contentDescription = null
                            )
                        }
                    }
                }
            )
        },
        floatingActionButton = {
            Column(
                modifier = Modifier
            ) {
                FloatingActionButton(
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
        modifier = Modifier
    ) {
        ListBeranda(modifier = Modifier.padding(it), listChat = listChat)
    }
}