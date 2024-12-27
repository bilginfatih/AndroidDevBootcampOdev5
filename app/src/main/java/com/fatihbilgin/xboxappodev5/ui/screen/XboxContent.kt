package com.fatihbilgin.xboxappodev5.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.fatihbilgin.xboxappodev5.ui.screen.components.XboxBackgroundImage
import com.fatihbilgin.xboxappodev5.ui.screen.components.XboxButtons
import com.fatihbilgin.xboxappodev5.ui.screen.components.XboxDetailsAndFeatures
import com.fatihbilgin.xboxappodev5.ui.screen.components.XboxGameDetails
import com.fatihbilgin.xboxappodev5.ui.screen.components.XboxPegiDetails

@Composable
fun XboxContent(paddingValues: PaddingValues) {
    Box(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        XboxBackgroundImage()
        // Dikey olarak kaydırılabilir alan
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            item { XboxGameDetails() }
            item { Spacer(modifier = Modifier.height(8.dp)) }
            item { XboxButtons() }
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item { XboxPegiDetails() }
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item { XboxDetailsAndFeatures() }
        }
    }
}