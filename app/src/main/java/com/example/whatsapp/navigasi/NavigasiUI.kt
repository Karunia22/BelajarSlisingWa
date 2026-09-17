package com.example.whatsapp.navigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.whatsapp.beranda.ui.BerandaUI
import com.example.whatsapp.komunitas.ui.KomunitasUI
import com.example.whatsapp.panggialan.ui.PanggilanUI
import com.example.whatsapp.pembaruan.ui.PembaruanUI

@Composable
fun Nav(navComtroller: NavHostController, startDestinasi: MenuNavigasi, modifier: Modifier = Modifier) {
    NavHost(
        navController = navComtroller,
        startDestination = startDestinasi.route
    ) {
        MenuNavigasi.entries.forEach { menuNavigasi ->
            composable(menuNavigasi.route){
                when(menuNavigasi){
                    MenuNavigasi.Chat -> BerandaUI()
                    MenuNavigasi.Pembaruan -> PembaruanUI()
                    MenuNavigasi.Komunitas -> KomunitasUI()
                    MenuNavigasi.Panggilan -> PanggilanUI()
                }
            }
        }
    }
}