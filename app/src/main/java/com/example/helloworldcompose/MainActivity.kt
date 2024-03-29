package com.example.helloworldcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helloworldcompose.ui.theme.HelloWorldComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            helloApp()
        }
    }
}

@Preview
@Composable
fun helloApp() {
    HelloWorldComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting("Android")
        }
    }
}

@Preview(showBackground = true, name = "Texto prueba")
@Composable
fun exampleModifier() {
    Text(text = "Suscríbete", modifier = Modifier.padding(horizontal = 16.dp))
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloWorldComposeTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true, name = "Texto prueba")
@Composable
fun SecondPreview() {
    HelloWorldComposeTheme {
        Greeting("AdrianDevs")
    }
}











