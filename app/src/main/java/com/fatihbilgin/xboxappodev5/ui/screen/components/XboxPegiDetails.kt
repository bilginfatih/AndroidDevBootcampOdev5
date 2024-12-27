package com.fatihbilgin.xboxappodev5.ui.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fatihbilgin.xboxappodev5.R

@Composable
fun XboxPegiDetails() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.pegi_18),
            contentDescription = null,
            modifier = Modifier.padding(start = 16.dp).size(50.dp),
            contentScale = ContentScale.Fit
        )
        Column(modifier = Modifier.padding(start = 16.dp)) {
            Text(
                text = "PEGI 18",
                color = Color.White,
                fontSize = 15.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "Kaba Dil, Cinsellik, Şiddet",
                color = Color.White,
                fontSize = 12.sp
            )
        }
    }
}