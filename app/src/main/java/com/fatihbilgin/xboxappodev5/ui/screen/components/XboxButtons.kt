package com.fatihbilgin.xboxappodev5.ui.screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.fatihbilgin.xboxappodev5.R
import com.fatihbilgin.xboxappodev5.ui.theme.GreenButtonColor
import com.fatihbilgin.xboxappodev5.ui.theme.MoreButtonColor

@Composable
fun XboxButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = { /* TODO */ },
            modifier = Modifier.weight(1f),
            colors = ButtonDefaults.buttonColors(containerColor = GreenButtonColor)
        ) {
            Text(text = "BU KONSOLA YÜKLE", color = Color.White)
        }
        Spacer(modifier = Modifier.width(8.dp))
        IconButton(
            onClick = { /* TODO */ },
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(MoreButtonColor)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.more_horiz_16dp),
                contentDescription = null,
                tint = Color.White
            )
        }
    }
}