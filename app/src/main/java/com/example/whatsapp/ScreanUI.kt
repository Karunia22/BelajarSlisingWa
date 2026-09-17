package com.example.whatsapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController
import com.example.whatsapp.navigasi.MenuNavigasi
import com.example.whatsapp.navigasi.Nav

@Composable
fun ScreanUI(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val startDestinasion = MenuNavigasi.Chat
    var selectedDestinasi by remember { mutableIntStateOf(startDestinasion.ordinal) }
    Scaffold(
        bottomBar = {
            NavigationBar(
                modifier = Modifier
            ) {
                MenuNavigasi.entries.forEachIndexed { index, navigasi ->
                    NavigationBarItem(
                        selected = selectedDestinasi == index,
                        onClick = {
                            navController.navigate(route = navigasi.route)
                            selectedDestinasi = navigasi.ordinal
                        },
                        icon = {
                            Icon(painter = painterResource(navigasi.icon), contentDescription = null)
                        },
                        label = {
                            Text(navigasi.label, style = MaterialTheme.typography.labelLarge)
                        }
                    )
                }
            }
        }
    ) {
        Nav(startDestinasi = startDestinasion, navComtroller = navController, modifier = Modifier.padding(it))
    }
}