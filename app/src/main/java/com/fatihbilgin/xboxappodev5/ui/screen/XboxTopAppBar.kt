package com.fatihbilgin.xboxappodev5.ui.screen

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.fatihbilgin.xboxappodev5.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun XboxTopAppBar() {
    TopAppBar(
        title = { Text(text = "") },
        navigationIcon = { // Geri tuşu ekliyoruz
            IconButton(onClick = {  }) {
                Icon(
                    painter = painterResource(id = R.drawable.arrow_back_ios_new_16dp),
                    contentDescription = "",
                    tint = Color.White,
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent,
        )
    )
}