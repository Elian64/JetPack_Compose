import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application


@Composable
fun Combate() {

    DesktopMaterialTheme {

        var nivelVida = remember { mutableStateOf(10) }
        //var nivelVida = remember { mutableStateOf(10.0F) }

        Surface(
            color = Color.DarkGray,
            modifier = Modifier.fillMaxSize()
        ) {

            Row( //Row de movimientos
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Start
            ) {
                    movimientos(
                        boton1 = { nivelVida.value-- },
                        boton2 = { nivelVida.value -= 2 },
                        boton3 = { nivelVida.value -= 3 },
                        boton4 = { nivelVida.value -= 4 })


            }

            Row( //Row de vida
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.End
            ) {
                cuadradoVida(nivelVida)
                //cuadradoVida2(nivelVida.value)

            }
        }
    }
}



@Composable

fun cuadradoVida(porcentaje: MutableState<Int>){
    for (i in 0..porcentaje.value.toInt()) {
        Surface(
            color = Color.Green,
            modifier = Modifier.size(40.dp)
        )
        {}
    }

}

// Barra de progreso que avanza o disminuye en base a un porcentaje Float
fun cuadradoVida2(porcentaje: Float) = LinearProgressIndicator(progress = porcentaje)




@Composable
fun movimientos(boton1: () -> Unit, boton2: () -> Unit, boton3: () -> Unit, boton4: () -> Unit) {

    var mov1 by remember { mutableStateOf("MOV1") }
    var mov2 by remember { mutableStateOf("MOV2") }
    var mov3 by remember { mutableStateOf("MOV3") }
    var mov4 by remember { mutableStateOf("MOV4") }

    DesktopMaterialTheme {
        Button(onClick = boton1) {
            Text(mov1)
        }
        Button(onClick = boton2) {
            Text(mov2)
        }
        Button(onClick = boton3) {
            Text(mov3)
        }
        Button(onClick = boton4) {
            Text(mov4)
        }

    }


}

fun main() = application {
    Window(title = "Combate", onCloseRequest = ::exitApplication) {
        Combate()
    }
}

