package com.fatihbilgin.xboxappodev5.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.fatihbilgin.xboxappodev5.model.NavItem

@Composable
fun XboxBottomBar(
    navItemList: List<NavItem>,
    selectedItem: Int,
    onItemSelected: (Int) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
    ) {
        NavigationBar(
            containerColor = Color.Transparent, // İç arka plan şeffaf
            tonalElevation = 0.dp // Gölgeyi kaldırma
        ) {
            navItemList.forEachIndexed { index, navItem ->
                val isSelected = selectedItem == index
                NavigationBarItem(
                    selected = false,
                    onClick = { onItemSelected(index) },
                    icon = {
                        Icon(
                            imageVector = navItem.icon,
                            contentDescription = navItem.label,
                            modifier = if (isSelected) Modifier.size(32.dp) else Modifier.size(26.dp)
                                .padding(top = 4.dp),
                            tint = if (isSelected) Color.White else Color.Gray
                        )
                    },
                )
            }
        }
    }
}