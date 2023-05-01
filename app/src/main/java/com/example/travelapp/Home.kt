import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.About
import com.example.myapplication.New
import com.example.myapplication.Travel
import com.example.travelapp.ui.theme.HomeScreen

@Composable
fun NavBar(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation() {
                BottomNavigationItem(
                    selected = true,
                    onClick = {
                        navController.navigate("new")
                    },
                    label = {
                        Text(text = "New")
                    },
                    icon = {
                        Icon(Icons.Filled.Home, contentDescription = "")
                    }
                )
                BottomNavigationItem(
                    selected = false,
                    onClick = {
                        navController.navigate("travels")
                    },
                    label = {
                        Text(text = "Travels")
                    },
                    icon = {
                        Icon(Icons.Filled.Add, contentDescription = "")
                    }
                )
                BottomNavigationItem(
                    selected = false,
                    onClick = {
                        navController.navigate("about")
                    },
                    label = {
                        Text(text = "About")
                    },
                    icon = {
                        Icon(Icons.Filled.AccountBox, contentDescription = "")
                    }
                )
            }
        }
    ) {

        NavHost(navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(paddingValues = it)
        ) {
            composable("home"){
                HomeScreen()
            }
            composable("new"){
                New()
            }
            composable("travels") {
                Travel()
            }
            composable("about"){
                About()
            }
        }
    }
}
