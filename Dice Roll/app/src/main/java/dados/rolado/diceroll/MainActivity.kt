package dados.rolado.diceroll

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dados.rolado.diceroll.ui.theme.DiceRollTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollTheme {
                DiceRollerApp()
            }
        }
    }
}

@Composable
fun DiceWithButtonAndImage(modificacao: Modifier = Modifier) {
    var resultado by remember { mutableStateOf(1) }
    val imageResource = when(resultado){
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    Column(
        modifier = modificacao,
            horizontalAlignment = CenterHorizontally
    ){

        Image(
            painter = painterResource(id = imageResource),
            contentDescription = resultado.toString(),
            )

        Spacer(modificacao .height(16.dp))

        //Botão que rola o dado de forma aleátoria
        Button(
            onClick = {
                resultado = (1..6).random() },
        ){
            Text(text = stringResource(R.string.roll))
        }
    }

/*Column(
        modifier = modificacao
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
    ) {
        Row(
            modifier = modificacao
                .fillMaxWidth()
                .weight(2f)
                .shadow(1.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Topo")
        }

        Surface(
            modifier = modificacao
                .size(100.dp)
                .weight(2f)
                .background(Color.Black),
            shape = RectangleShape,
            shadowElevation = 10.dp,
            contentColor = Blue,
        ) {
            Text(text = "Conteúdo no Surface",
                modificacao
                    .align(CenterHorizontally),
            )
        }
    }*/
}

@Preview(showSystemUi = true)
@Composable
fun DiceRollerApp() {
    DiceWithButtonAndImage(modificacao = Modifier
        /**/
        .wrapContentSize(Alignment.Center)
    )

}