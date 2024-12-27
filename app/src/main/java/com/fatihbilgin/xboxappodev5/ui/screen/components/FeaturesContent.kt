package com.fatihbilgin.xboxappodev5.ui.screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FeaturesContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "Cyberpunk 2077'nin özellikleri:",
            color = Color.White,
            fontSize = 14.sp
        )
        Text(
            text = "- 4K çözünürlük desteği\n- RTX ve DLSS desteği\n- Türkçe dil seçeneği",
            color = Color.Gray,
            fontSize = 12.sp
        )
    }
}