package basico.compose.basicocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import basico.compose.basicocompose.ui.theme.BasicoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Androids")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier,
        Arrangement.Top,
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.2f)
                .border(3.dp, Color.Red),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
        ){
            Box(
                Modifier
                    .border(3.dp, Color.Blue)
                    .background(color = Color.Yellow)
            ) {
                Text(text = "Inicios",
                    modifier = Modifier
                        .padding(50.dp)
                        .zIndex(1f)
                )
            }
            Box(
                Modifier
                    .zIndex(0.2f)
                    .border(3.dp, Color.Blue)
                    .background(color = Color.Yellow)
            ) {
                Text(text = "final",
                    modifier = Modifier
                        .padding(50.dp)
                        .zIndex(1f)
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
        modifier = Modifier
            .wrapContentSize(Alignment.Center)
            .border(3.dp, Color.Red)
            .align(Alignment.CenterHorizontally),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ){
            Box(
                Modifier
                    .zIndex(0.1f)
                    .border(3.dp, Color.Blue)
                    .background(color = Color.Yellow)
            ) {
                Text(text = "Inicios",
                    modifier = Modifier
                        .padding(50.dp)
                        .zIndex(1f)
                )
            }
            Box(
                Modifier
                    .zIndex(0.2f)
                    .border(3.dp, Color.Blue)
                    .background(color = Color.Yellow)
            ) {
                Text(text = "final",
                    modifier = Modifier
                        .padding(50.dp)
                        .zIndex(1f)
                )
            }

         /*   Surface(color = Color.Yellow, shape = CircleShape) {
                Text(text = "Inicios", modifier = Modifier.padding(50.dp))
            }*/
        }
    }

    /*Box(modifier = Modifier
        .fillMaxSize()
        .border(3.dp, Color.Green)
    ){
        val dados = arrayListOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")
        Column(modifier = Modifier
            .border(3.dp, Color.Yellow)
        ){
       *//*     dados.forEach { Text(text = it, modifier = Modifier
                .padding(10.dp)
                .border(3.dp, Color.Yellow)
                .padding(10.dp)
            ) }*//*

            dados.forEach { lista ->
                Text(text = lista, modifier = Modifier
                    .padding(10.dp)
                    .border(3.dp, Color.Yellow)
                    .padding(10.dp)
                )
                println(lista)
            }
        }
        Text(text = "Texto topo", modifier = Modifier
            .align(Alignment.TopStart)
            .border(1.dp, Color.Red)
            .padding(10.dp))
        Text(text = "Texto topo", modifier = Modifier
            .align(Alignment.TopCenter)
            .border(1.dp, Color.Red))
        Text(text = "Texto topo", modifier = Modifier
            .align(Alignment.TopEnd)
            .border(1.dp, Color.Red))
        Text(text = "Texto centro", modifier = Modifier
            .align(Alignment.Center)
            .border(1.dp, Color.Red))
        Text(text = "Texto centro", modifier = Modifier
            .align(Alignment.CenterStart)
            .border(1.dp, Color.Red))
        Text(text = "Texto centro", modifier = Modifier
            .align(Alignment.CenterEnd)
            .border(1.dp, Color.Red))
        Text(text = "Texto fundo", modifier = Modifier
            .align(Alignment.BottomStart)
            .border(1.dp, Color.Red))
        Text(text = "Texto fundo", modifier = Modifier
            .align(Alignment.BottomCenter)
            .border(1.dp, Color.Red))
        Text(text = "Texto fundo", modifier = Modifier
            .align(Alignment.BottomEnd)
            .border(1.dp, Color.Red))
    }*/

    var textoValor by remember { mutableStateOf("") }
/*
    Column(){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp)
        ){
            Column(){ Text(text = "Hello $name!") }
            Column(){ Text(text = "Helglo $name!") }
        }

       TextField(
           value = textoValor,
           onValueChange = { textoValor = it},
           label = {Text("Texto")},
           keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
           keyboardActions = KeyboardActions(onDone = { *//* Ação a ser executada quando o botão 'Done' do teclado for pressionado *//* }),
           modifier = Modifier
               .fillMaxWidth()
               .padding(8.dp)
       )

    }*/
}

@Preview(name = "Aplicativo", showSystemUi = true)
@Composable
fun GreetingPreview() {
    BasicoTheme {
        Greeting("Android")
    }
}