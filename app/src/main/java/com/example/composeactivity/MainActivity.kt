package com.example.composeactivity

package com.example.composeactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composeactivity.ui.theme.ComposeActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeActivityTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Activity3_04Screen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

// Rutas de Navegación
object Destinations {
    const val SCREEN_A = "screenA"
    const val SCREEN_B = "screenB"
}

@Composable
fun Activity3_04Screen(modifier: Modifier = Modifier) {
    // Controlador de navegación
    val navController = rememberNavController()
    package com.example.composeactivity



    import android.os.Bundle

            import androidx.activity.ComponentActivity

            import androidx.activity.compose.setContent

            import androidx.activity.enableEdgeToEdge

            import androidx.compose.foundation.layout.fillMaxSize

            import androidx.compose.foundation.layout.padding

            import androidx.compose.material3.Scaffold

            import androidx.compose.material3.Text

            import androidx.compose.runtime.Composable

            import androidx.compose.ui.Modifier

            import androidx.compose.ui.tooling.preview.Preview

            import com.example.composeactivity.ui.theme.ComposeActivityTheme



    class MainActivity : ComponentActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)

            enableEdgeToEdge()

            setContent {

                ComposeActivityTheme {

                    Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->

                        Greeting(

                            name = "Android",

                            modifier = Modifier.padding(innerPadding)

                        )

                    }

                }

            }

        }

    }



    @Composable

    fun Greeting(name: String, modifier: Modifier = Modifier) {

        Text(

            text = "Hello $name!",

            modifier = modifier

        )

    }



    @Preview(showBackground = true)

    @Composable

    fun GreetingPreview() {

        ComposeActivityTheme {

            Greeting("Android")

        }

    }