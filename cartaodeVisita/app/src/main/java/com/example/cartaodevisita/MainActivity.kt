package com.example.cartaodevisita

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    cartaoVisita("kevin kley")
                }
            }
        }
    }
}

@SuppressLint("PrivateResource")
@Composable
fun cartaoVisita(name: String, modifier: Modifier = Modifier) {
    val perfil = painterResource(R.drawable.perfil)
    Column(
        horizontalAlignment = CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    ){
        Column(
            horizontalAlignment = CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .weight(1f)
                .padding(16.dp)
        ){
            Image(
                painter = perfil,
                contentDescription = "Perfil",
                modifier = Modifier
                    .width(150.dp)
                    .background(color = Color.DarkGray)
                    .padding(10.dp)
            )

            Text(
                text = name,
                fontSize = 46.sp,
                modifier = modifier
            )
            Text(
                text = stringResource(R.string.cargo),
                color = Color(0xFF3ddc84),
                fontWeight = Bold,
                modifier = modifier
            )
        }

        Column(
            horizontalAlignment = CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .weight(0.8f)
                .padding(16.dp)
        ){
            Column(
                modifier = Modifier
                    .padding(bottom = 20.dp)
            ){
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                ) {
                    Icon(
                        Icons.Rounded.Phone,
                        contentDescription = "phone",
                        modifier = Modifier.height(18.dp)
                    )
                    Text(text = " +55 91 98392-7903", fontSize = 12.sp)
                }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                ) {
                    Icon(
                        Icons.Rounded.AccountBox,
                        contentDescription = "instagram",
                        modifier = Modifier.height(18.dp)
                    )
                    Text(text = " @kevinkley", fontSize = 12.sp)
                }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                ) {
                    Icon(
                        Icons.Rounded.Email,
                        contentDescription = "email",
                        modifier = Modifier.height(18.dp)
                    )
                    Text(
                        text = " kevinkleyoficial@gmail.com",
                        fontSize = 12.sp
                    )
                }
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun cartaoVisitaPreview() {
    CartaoDeVisitaTheme {
        cartaoVisita("kevin kley")
    }
}