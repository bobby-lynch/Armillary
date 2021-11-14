package me.robertlynch.armillary.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import me.robertlynch.armillary.ui.theme.ArmillaryTheme


@Composable
fun HomeView(navController: NavController) {

    // A surface container using the 'background' color from the theme
    Surface(Modifier.fillMaxSize().background(MaterialTheme.colors.background)) {
        Greeting("Android")
    }

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArmillaryTheme {
        Greeting("Android")
    }

}