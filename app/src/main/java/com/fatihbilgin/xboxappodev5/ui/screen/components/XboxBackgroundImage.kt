package com.fatihbilgin.xboxappodev5.ui.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.fatihbilgin.xboxappodev5.R

@Composable
fun XboxBackgroundImage() {
    Image(
        painter = painterResource(id = R.drawable.cyberpunk2077),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxSize()
            .graphicsLayer { // Blur efekti
                alpha = 1f // Şeffaflık
            }
            .blur(40.dp)
    )
}