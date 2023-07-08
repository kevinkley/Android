import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.myapplication.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen() {
    val nome = "kevin kley"
    val matricula = "04109269"

    TopAppBar(
            backgroundColor = Color(18, 138, 8),
            contentColor = Color.White,
            modifier = Modifier
                .height(140.dp)
                .fillMaxWidth()
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(all = 8.dp)
                    .align(Alignment.Top)
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .border(width = 2.dp, color = Color.Black),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(width = 1.dp, color = Color.White, shape = CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        val painter = rememberImagePainter(data = R.drawable.perfil)
                        Image(
                            painter = painter,
                            contentDescription = "Imagem de Perfil",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(60.dp)
                                .clip(CircleShape),
                        )
                    }

                    //icone de notificação
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(50.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .size(35.dp)
                        )
                    }
                }

                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Column {
                        Box(
                            contentAlignment = Alignment.CenterStart,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = nome,
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Box(
                            contentAlignment = Alignment.CenterStart,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(text = matricula, color = Color.White)
                        }
                    }
                }
            }
        }
    BodyAppQR()
    FooterAppQR()
    }

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BodyAppQR(){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxHeight(0.5f)
            ) {
                Box(
                    modifier = Modifier
                        .width(IntrinsicSize.Max)
                        .height(IntrinsicSize.Max)
                        .align(Alignment.CenterVertically)
                        .clip(shape = RoundedCornerShape(6.dp)) // Define o arredondamento das bordas
                        .shadow(5.dp, shape = RoundedCornerShape(8.dp))
                        .padding(all = 5.dp)
                ) {
                    val qrcode = rememberImagePainter(data = R.drawable.qrcode)
                    Image(
                        painter = qrcode,
                        contentDescription = "QR Code",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(200.dp)
                    )
                }
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.7f)
                .border(width = 1.dp, color = Color.Gray)
        ) {
            LazyRow() {
                items(5){
                    Box(
                        modifier = Modifier
                            .fillMaxHeight(1f)
                            .border(width = 1.dp, color = Color.Red)
                            .padding(all = 5.dp)
                    ) {
                        Row(){
                            val imgNews = rememberImagePainter(data = R.drawable.news
                            )
                            Image(
                                painter = imgNews,
                                contentDescription = "News",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(200.dp)
                                    .border(width = 1.dp, color = Color.Black)
                            )
                        }


                        Column(
                            modifier = Modifier
                                .align(alignment = Alignment.BottomCenter)
                                .border(width = 2.dp, color = Color.Black)
                        ) {
                            Text(
                                text = "NEWS",
                                modifier = Modifier
                                    .padding(5.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

//TESTA DEPOIS
val padrao = Modifier.padding(10.dp)

@Composable
fun FooterAppQR() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .background(Color.Gray)
                .padding(10.dp)
        ) {
            Column(){
                IconButton(
                    onClick = {

                    },
                    modifier = Modifier.size(35.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "Favorite",
                        tint = Color.White,
                        modifier = Modifier
                            .size(35.dp)
                    )
                }
            }
            Column(){
                IconButton(onClick = {
                },
                    modifier = Modifier.size(35.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = "Favorite",
                        tint = Color.White,
                        modifier = Modifier
                            .size(35.dp)
                    )
                }
            }
            Column(){
                IconButton(
                    onClick = {

                    },
                    modifier = Modifier.size(35.dp)
                ){
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "Favorite",
                        tint = Color.White,
                        modifier = Modifier
                            .size(35.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun LoginScreen() {

}



@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}