package com.fatihbilgin.xboxappodev5.ui.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.fatihbilgin.xboxappodev5.R

@Composable
fun DetailsContent() {
    val imageList = listOf(
        R.drawable.horizontal_image3, // Resim kaynaklarını buraya ekle
        R.drawable.horizontal_image2,
        R.drawable.horizontal_image1,
        R.drawable.horizontal_image4,
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Grid düzeni için Row ve Column kullanıyoruz
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()) // Yatay kaydırma
        ) {
            imageList.forEach { image ->
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    modifier = Modifier
                        .size(250.dp) // Resim kutusu boyutu
                        .padding(4.dp) // Kutular arasında boşluk
                        .clip(RoundedCornerShape(8.dp)) // Köşeleri yuvarlat
                        .background(Color.Transparent) // Arka plan rengi
                        .border(2.dp, Color.Transparent, RoundedCornerShape(8.dp)), // Kenarlık
                    contentScale = ContentScale.Crop // Resmi kutu içine sığdır
                )
            }
        }
    }
}