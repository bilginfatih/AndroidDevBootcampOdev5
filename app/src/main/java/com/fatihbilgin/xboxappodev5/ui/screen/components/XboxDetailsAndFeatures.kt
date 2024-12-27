package com.fatihbilgin.xboxappodev5.ui.screen.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun XboxDetailsAndFeatures() {
    var selectedTabIndex by remember { mutableIntStateOf(0) } // Seçili sekmeyi tutar

    val tabs = listOf("Ayrıntılar", "Özellikler") // Sekme başlıkları

    Column {
        // Tab Bar
        TabRow(
            selectedTabIndex = selectedTabIndex,
            containerColor = Color.Transparent,
            contentColor = Color.White,
            modifier = Modifier
                .padding(start = 6.dp) // TabRow'u sola hizalamak için padding
                .width(200.dp), // TabRow'un genişliğini kısıtlamak için
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(
                    modifier = Modifier
                        .tabIndicatorOffset(tabPositions[selectedTabIndex]) // Seçili sekmenin altına göstergesi
                        .height(3.dp) // Çizgiyi kalınlaştırma
                        .padding(horizontal = 16.dp), // Çizgiye yatay padding ekleme
                    color = Color.White // Çizgi rengini beyaz yapma
                )
            },
            divider = { Box(modifier = Modifier) } // divider gizlemek için
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
                    text = {
                        Text(
                            text = title,
                            color = if (selectedTabIndex == index) Color.White else Color.Gray,
                            fontWeight = if (selectedTabIndex == index) FontWeight.Bold else FontWeight.Normal
                        )
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Sekmeye göre değişen içerik
        when (selectedTabIndex) {
            0 -> DetailsContent()
            1 -> FeaturesContent()
        }
    }
}