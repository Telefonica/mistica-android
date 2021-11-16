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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.telefonica.mistica.compose.button.DropDownInput
import com.telefonica.mistica.compose.catalog.R
import com.telefonica.mistica.compose.catalog.ui.components.Buttons
import com.telefonica.mistica.compose.catalog.ui.components.Feedbacks
import com.telefonica.mistica.compose.catalog.ui.components.Texts
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.BlauBrand
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.compose.theme.brand.MovistarProminentBrand
import com.telefonica.mistica.compose.theme.brand.O2ClassicBrand
import com.telefonica.mistica.compose.theme.brand.TelefonicaBrand
import com.telefonica.mistica.compose.theme.brand.VivoBrand

class CatalogMainActivity : ComponentActivity() {

    private var brand by mutableStateOf<Brand>(MovistarBrand)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MisticaTheme(brand = brand) {
                val navController = rememberNavController()
                Scaffold { innerPadding ->
                    CatalogNavHost(
                        navController,
                        modifier = Modifier.padding(innerPadding),
                        onBrandChanged = { brand = it },
                        currentBrand = brand,
                    )
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
            Image(
                painter = painterResource(id = componentScreen.icon),
                contentDescription = null
            )
            Text(
                text = componentScreen.name,
                modifier = Modifier.padding(start = 16.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.icn_arrow),
            contentDescription = null,
            modifier = Modifier.align(Alignment.CenterEnd)
        )
    }
}

@Composable
fun CatalogNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    currentBrand: Brand,
    onBrandChanged: (Brand) -> Unit,
) {
    NavHost(
        navController = navController,
        startDestination = NavigationRoutes.CATALOG,
        modifier = modifier
    ) {
        composable(NavigationRoutes.CATALOG) {
            Catalog(
                navController = navController,
                onBrandChanged = onBrandChanged,
                currentBrand = currentBrand,
            )
        }
        composable(NavigationRoutes.BUTTONS) { Buttons() }
        composable(NavigationRoutes.TEXTS) { Texts() }
        composable(NavigationRoutes.FEEDBACKS) { Feedbacks() }
    }
}

@Composable
fun Catalog(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    currentBrand: Brand,
    onBrandChanged: (Brand) -> Unit,
) {
    val components = listOf(
        ComponentScreen(
            name = "Buttons",
            icon = R.drawable.ic_buttons,
            navigation = NavigationRoutes.BUTTONS
        ),
        ComponentScreen(
            name = "Texts",
            icon = R.drawable.ic_texts,
            navigation = NavigationRoutes.TEXTS
        ),
        ComponentScreen(
            name = "Feedbacks",
            icon = R.drawable.ic_feedbacks,
            navigation = NavigationRoutes.FEEDBACKS
        )
    )
    Column {

        Image(
            painter = painterResource(id = R.drawable.ic_mistica_logo_text_compose),
            contentDescription = null,
            modifier = Modifier
                .padding(start = 16.dp, top = 32.dp, end = 16.dp, bottom = 16.dp),
        )

        Text(
            text = "Compose version",
            style = MisticaTheme.typography.preset4,
            modifier = Modifier
                .padding(16.dp),
        )

        DropDownInput(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            items = BRANDS.map { it.javaClass.simpleName },
            currentItemIndex = BRANDS.indexOf(currentBrand),
            onItemSelected = { index -> onBrandChanged(BRANDS[index]) },
            hint = "Brand",
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

val BRANDS = listOf(
    MovistarBrand,
    MovistarProminentBrand,
    TelefonicaBrand,
    VivoBrand,
    BlauBrand,
    O2ClassicBrand,
)

object NavigationRoutes {
    const val CATALOG = "catalog"
    const val BUTTONS = "buttons"
    const val TEXTS = "texts"
    const val FEEDBACKS = "feedbacks"
}
