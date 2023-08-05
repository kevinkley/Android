package com.example.cartaodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cartaodevisita.ui.theme.CartaoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeVisitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    cartaoVisita("Android")
                }
            }
        }
    }
}

@Composable
fun cartaoVisita(name: String, modifier: Modifier = Modifier) {
    val perfil = painterResource(R.drawable.perfil)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    ){
        Column(
            horizontalAlignment = CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(16.dp)
                .border(1.dp, colorScheme.onSurface)
        ){
            Image(
                painter = perfil,
                contentDescription = "Perfil",
                modifier = Modifier
                    .width(200.dp)
                    .border(1.dp, colorScheme.onSurface)
            )

            Text(
                text = name,
                modifier = modifier
            )
            Text(
                text = "Title",
                modifier = modifier
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column {
            Text(text = "Phone")
        }

    }
}

fun contatoCartao(){

}

@Preview(showBackground = true)
@Composable
fun cartaoVisitaPreview() {
    CartaoDeVisitaTheme {
        cartaoVisita("kevin kley")
    }
}