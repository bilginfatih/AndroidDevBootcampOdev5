package com.fatihbilgin.xboxappodev5.ui.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fatihbilgin.xboxappodev5.R
import com.fatihbilgin.xboxappodev5.ui.theme.CompanyNameTextColor
import com.fatihbilgin.xboxappodev5.ui.theme.NewPriceTextColor

@Composable
fun XboxGameDetails() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.cyberpunk2077_kapak_resmi),
            contentDescription = null,
            modifier = Modifier.padding(start = 16.dp).size(130.dp),
            contentScale = ContentScale.Fit
        )
        Column(modifier = Modifier.padding(start = 16.dp)) {
            Text(
                text = "Cyberpunk 2077",
                color = Color.White,
                fontSize = 24.sp,

                )
            Text(
                text = "CD PROJEKT RED",
                color = CompanyNameTextColor,
                fontSize = 15.sp
            )
            Row {
                Text(
                    text = "₺799,00",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        textDecoration = TextDecoration.LineThrough
                    ),
                    color = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "₺359,55",
                    style = MaterialTheme.typography.bodyMedium.copy(color = NewPriceTextColor),
                    fontWeight = FontWeight.W500,
                )
            }
        }
    }
}