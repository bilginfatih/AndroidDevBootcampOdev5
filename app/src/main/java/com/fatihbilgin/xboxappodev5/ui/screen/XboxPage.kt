package com.fatihbilgin.xboxappodev5.ui.screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.fatihbilgin.xboxappodev5.model.NavItem

@Composable
fun XboxPage() {
    var selectedItem by remember { mutableStateOf(2) }

    val navItemList = listOf(
        NavItem("home", Icons.Default.Home),
        NavItem("person", Icons.Default.Person),
        NavItem("search", Icons.Default.Search),
        NavItem("list", Icons.Default.List),
        NavItem("play", Icons.Default.PlayArrow),
    )

    Scaffold(
        topBar = { XboxTopAppBar() },
        bottomBar = {
            XboxBottomBar(
                navItemList = navItemList,
                selectedItem = selectedItem,
                onItemSelected = { selectedItem = it }
            )
        }
    ) { paddingValues ->
        XboxContent(paddingValues)
    }
}
