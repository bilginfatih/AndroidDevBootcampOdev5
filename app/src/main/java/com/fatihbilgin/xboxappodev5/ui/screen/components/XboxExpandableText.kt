package com.fatihbilgin.xboxappodev5.ui.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fatihbilgin.xboxappodev5.ui.theme.GreenButtonColor


@Composable
fun XboxExpandableText(text: String) {
    var isExpanded by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        // Başlık
        Text(
            text = "AÇIKLAMA:",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp)) // Başlık ile metin arası boşluk

        Text(
            text = if (isExpanded) text else text.take(130) + "...",
            color = Color.White,
            fontSize = 14.sp
        )

        // Daha Fazla/Daha Az butonu
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp), // Metin ile buton arası boşluk
            horizontalArrangement = Arrangement.Start
        ) {
            TextButton(
                onClick = { isExpanded = !isExpanded }
            ) {
                Text(
                    text = if (isExpanded) "Daha Az" else "Daha Fazla",
                    color = GreenButtonColor,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
