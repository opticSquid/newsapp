package com.example.newsapp.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ListAlt
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newsapp.R
import com.example.newsapp.ui.NewsAppDestinations
import com.example.newsapp.ui.theme.NewsAppTheme

@Composable
fun AppNavRail(
    currentRoute: String,
    navigateToHome: () -> Unit,
    navigateToInterests: () -> Unit,
    modifier: Modifier = Modifier
) {
    NavigationRail(
        header = {
            Icon(
                Icons.Filled.Menu,
                null,
                Modifier.padding(vertical = 12.dp),
                tint = MaterialTheme.colorScheme.primary
            )
        },
        modifier = modifier
    ) {
        Spacer(Modifier.weight(1f))
        NavigationRailItem(
            selected = currentRoute == NewsAppDestinations.HOME_ROUTE,
            onClick = navigateToHome,
            icon = { Icon(Icons.Filled.Home, stringResource(R.string.home_title)) },
            label = { Text(stringResource(R.string.home_title)) },
            alwaysShowLabel = false
        )
        NavigationRailItem(
            selected = currentRoute == NewsAppDestinations.INTERESTS_ROUTE,
            onClick = navigateToInterests,
            icon = { Icon(Icons.Filled.ListAlt, stringResource(R.string.interests_title)) },
            label = { Text(stringResource(R.string.interests_title)) },
            alwaysShowLabel = false
        )
        Spacer(Modifier.weight(1f))
    }
}

@Preview("Drawer contents")
@Preview("Drawer contents (dark)", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewAppNavRail() {
    NewsAppTheme {
        AppNavRail(
            currentRoute = NewsAppDestinations.HOME_ROUTE,
            navigateToHome = {},
            navigateToInterests = {},
        )
    }
}
