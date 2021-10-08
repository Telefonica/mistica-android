package com.telefonica.mistica.compose.catalog.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.telefonica.mistica.compose.catalog.R
import com.telefonica.mistica.compose.catalog.ui.components.Buttons
import com.telefonica.mistica.compose.catalog.ui.components.Texts
import com.telefonica.mistica.compose.theme.MisticaTheme

class CatalogMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MisticaTheme {

                val navController = rememberNavController()
                Scaffold { innerPadding ->
                    CatalogNavHost(navController, modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

data class ComponentScreen(
    val name: String,
    val icon: Int,
    val navigation: String,
)

@Composable
fun ComponentRow(
    componentScreen: ComponentScreen,
    onClick: () -> Unit = {},
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(16.dp),

        ) {
        Row(
            modifier = Modifier.align(Alignment.CenterStart)
        ) {
            Icon(
                painter = painterResource(id = componentScreen.icon),
                contentDescription = null
            )
            Text(
                text = componentScreen.name,
                modifier = Modifier.padding(start = 16.dp)
            )
        }
        Icon(
            painter = painterResource(id = R.drawable.icn_arrow),
            contentDescription = null,
            modifier = Modifier.align(Alignment.CenterEnd)
        )
    }
}

@Composable
fun CatalogNavHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = "catalog",
        modifier = modifier
    ) {
        composable("catalog") { Catalog(navController = navController) }
        composable("buttons") { Buttons() }
        composable("texts") { Texts() }
    }
}

@Composable
fun Catalog(navController: NavHostController, modifier: Modifier = Modifier) {
    val components = listOf(
        ComponentScreen(
            name = "Buttons",
            icon = R.drawable.ic_buttons,
            navigation = "buttons"
        ),
        ComponentScreen(
            name = "Texts",
            icon = R.drawable.ic_texts,
            navigation = "texts"
        )
    )
    Column {

        Image(
            painter = painterResource(id = R.drawable.ic_mistica_logo_text),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp)
        )
        // A surface container using the 'background' color from the theme
        LazyColumn(
            modifier = modifier
                .fillMaxHeight(),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            items(
                items = components
            ) {
                ComponentRow(componentScreen = it) { navController.navigate(it.navigation) }
                Divider(color = Color.LightGray, thickness = 1.dp)
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ComponentRowPreview() {
    ComponentRow(componentScreen = ComponentScreen("Button", R.drawable.ic_buttons, ""))
}
