package teste.rotas.View.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import teste.rotas.R

@Composable
fun Tela() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") { BodyApp(navController) }
        composable("outraTela") { outraTela() }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopBarApp()
        Spacer(Modifier.height(10.dp))
        BodyApp(navController)
        Spacer(Modifier.height(10.dp))
        BottomApp()
    }
}
@Composable
fun outraTela() {
    println("aa")
}

@Composable
fun TopBarApp(){
    Column {
        val imageLogo = R.drawable.logoandroid
        val receberImg: Painter = painterResource(id = imageLogo)

        Image(
            painter = receberImg,
            contentDescription = "Descrição da imagem",
        modifier = Modifier
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun BodyApp(navController: NavHostController) {
    var login by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(width = 3.dp, color = Color.Green)
            .padding(all = 10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = login,
            onValueChange = {login = it},
            label = {
                Text("Nome")
            }
        )
        OutlinedTextField(
            value = senha,
            onValueChange = {
                senha = it
            },
            label = { Text("Senha") }
        )
        Spacer(Modifier.height(5.dp))
        Button(
            onClick = { navController.navigate("outraTela") },
            modifier = Modifier.fillMaxWidth(0.8f)
        ){
            Text(
                text = "Login",
                style = TextStyle(
                    color = Color.White
                )
            )
        }
    }
}

fun realizarLogin(nome: String, senha: String) { // Pass senhaError as a MutableState<String>
    if (senha.length < 5) {
        println("Senha muito curta")
    } else {
        println("Senha correta")
    }
}


@Composable
fun BottomApp(){
    Column(
        modifier = Modifier
    ) {
        Text(text = "recupere sua senha")
    }
}

@Composable
@Preview
fun TelaPreview(){
    Tela()
}