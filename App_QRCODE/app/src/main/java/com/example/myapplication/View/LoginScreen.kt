package com.example.myapplication.View

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.Button
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

//Import da classe ENUM com as cores padrão do APLICATIVO
import com.example.myapplication.Cores.AppColors

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun LoginScreen() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val spaceLogin = Modifier
        .fillMaxWidth()
        .padding(bottom = 8.dp)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
        ) {
            Box() {
                val imageResId = R.drawable.login
                val painter: Painter = painterResource(id = imageResId)

                Image(
                    painter = painter,
                    contentDescription = "Descrição da imagem da tela",
                    modifier = Modifier,
                    contentScale = ContentScale.FillBounds
                )
            }

        }

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Nome de Usuário") },
            modifier = spaceLogin
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Senha") },
            modifier = spaceLogin,
            visualTransformation = PasswordVisualTransformation()
        )
        Button(
            onClick = { performLogin(username, password) },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text("Login")
        }
    }
}
fun performLogin(username: String, password: String){
    if(username.length < 10 || password.length < 5){
        println("nome muito curto ou senha, tente novamente!!")
    }else{
        println("Aceito")
    }
    // Lógica de autenticação aqui
    // Por exemplo, verificar credenciais e navegar para a próxima tela
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
fun PreviewScreenLogin() {
    LoginScreen()
}

