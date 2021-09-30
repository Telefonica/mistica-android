package com.telefonica.mistica.catalog.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.material.composethemeadapter.MdcTheme
import com.telefonica.catalog_compose.ui.theme.MisticaandroidTheme

class CatalogMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MdcTheme(

            ) {
//            MisticaandroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Column(
                        // we are using column to align our
                        // imageview to center of the screen.
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(),

                        // below line is used for specifying
                        // vertical arrangement.
                        verticalArrangement = Arrangement.Center,

                        // below line is used for specifying
                        // horizontal arrangement.
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Button(
                            onClick = {},
                            modifier = Modifier.padding(all = 10.dp),

                            ) {
                            Text(text = "Regular button")
                        }

                        MisticaButton(buttonText = "Mistica button") {

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MisticaandroidTheme {
        Greeting("Android")
        Button(
            onClick = {},
            modifier = Modifier.padding(all = 10.dp),

            ) {
            Text(text = "Prueba")
        }
    }
}

@Composable
fun MisticaButton(
    buttonText: String,
    onClickListener: () -> Unit,
) {
    AndroidView(
        modifier = Modifier.wrapContentSize(),
        factory = { context ->
            com.telefonica.mistica.button.Button(context).apply {
                text = buttonText
                setOnClickListener { onClickListener() }
            }
        },
        update = { view -> view }
    )
}