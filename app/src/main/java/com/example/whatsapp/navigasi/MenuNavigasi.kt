package com.example.whatsapp.navigasi

import com.example.whatsapp.R

enum class MenuNavigasi(
    val icon: Int,
    val route: String,
    val label: String
) {
    Chat(R.drawable.chat, "sdsd", "Chat"),
    Pembaruan(R.drawable.status2, "pembaruan", "Pembaruan"),
    Komunitas(R.drawable.komunitas, "komunitas", "Komunitas"),
    Panggilan(R.drawable.telepon, "tetlepon", "Telepon"),
}