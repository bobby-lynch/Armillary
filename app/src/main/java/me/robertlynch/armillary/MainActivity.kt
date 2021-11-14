package me.robertlynch.armillary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import me.robertlynch.armillary.ui.theme.ArmillaryTheme
import me.robertlynch.armillary.view.HomeView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val navController = rememberNavController()

            ArmillaryTheme {

                // navHost links navController to the navigation graph, which is made up of composable destinations
                NavHost(navController = navController, startDestination = "homeview") {

                    // add the homeview composable to the navigation graph, previously set as the startDestination
                    composable("homeview") { HomeView(navController) }

                }
            }
        }
    }
}