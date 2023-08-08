package com.example.bibliotecasdojetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bibliotecasdojetpack.ui.theme.BibliotecasDoJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BibliotecasDoJetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    bibliotecaJetpack("Android")
                }
            }
        }
    }
}

@Composable
fun bibliotecaJetpack(name: String, modifier: Modifier = Modifier) {
    val imagem = painterResource(R.drawable.bg_compose_background)

    Column{
        Image(
            painter = imagem,
            contentDescription = "Imagem de fundo",
        )
        Text(
            text = name,
            fontSize = 24.sp,
            modifier = modifier
                .padding(16.dp)
        )
        Text(
            text = stringResource(R.string.detalhes),
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = stringResource(R.string.tutorial),
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(all = 16.dp)
        )
    }
}

@Composable
fun tarefasDiarias(){
    val imgDiaria = painterResource(R.drawable.dia_completado)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            painter = imgDiaria,
            contentDescription = "Imagem de fundo",
        )
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 26.dp, bottom = 8.dp),
        )
        Text(text = "Nice work!", fontSize = 16.sp)
    }
}

@Composable
fun quadrantesCompose(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorScheme.inversePrimary)
    ){
        Row{
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(0.5f)
                    .fillMaxHeight(0.5f)
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
            ) {
                Text(text = "Text composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                Text(text = "Displays text and follows the recommended Material Design guidelines.", textAlign = TextAlign.Justify)
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(0.5f)
                    .fillMaxHeight(0.5f)
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
            ) {
                Text(text = "Image composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                Text(text = "Creates a composable that lays out and draws a given Painter class object.", textAlign = TextAlign.Justify)
            }
        }

        Row{
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(0.5f)
                    .fillMaxHeight()
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
            ) {
                Text(text = "Row composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                Text(text = "A layout composable that places its children in a horizontal sequence.", textAlign = TextAlign.Justify)
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(0.5f)
                    .fillMaxHeight()
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
            ) {
                Text(text = "Column composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                Text(text = "A layout composable that places its children in a vertical sequence.", textAlign = TextAlign.Justify)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    BibliotecasDoJetpackTheme {
        bibliotecaJetpack("Jetpack Compose tutorial")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun tarefasDiariasPreview() {
    BibliotecasDoJetpackTheme {
        tarefasDiarias()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun quadrantesComposePreview() {
    BibliotecasDoJetpackTheme {
        quadrantesCompose()
    }
}