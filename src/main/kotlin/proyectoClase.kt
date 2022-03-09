// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.mouseClickable
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.jetbrains.skija.Surface
import javax.swing.text.Style

@Composable
fun Combate() {

    DesktopMaterialTheme {
        Surface(
            color = Color.LightGray,
            modifier = Modifier.fillMaxSize()
        ) {

            Row( //Row de movimientos
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Start
            ) {
                movimientos()
            }

            Row( //Row de vida
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.End
            ) {
                cuadradoVida(9)
            }
        }
    }
}


@Composable
fun cuadradoVida(numeroCuadrados: Int) {
    for (i in 0..numeroCuadrados) {
        Surface(
            color = Color.Green,
            modifier = Modifier.size(30.dp)
        ) {}
    }
}

@Composable
fun movimientos() {

    //var text by remember { mutableStateOf("M1") }

    val mov1 = remember { mutableStateOf("M1") }
    val mov2 = remember { mutableStateOf("M2") }
    val mov3 = remember { mutableStateOf("M3") }
    val mov4 = remember { mutableStateOf("M4") }

    val lista = listOf(mov1, mov2, mov3, mov4)

    for (movimiento in lista) {
        Surface(
            color = Color.White,
            modifier = Modifier.size(50.dp)
        ) {
            /*Button(onClick = {
                cuadradoVida(7)
            }) {
                Text(text)
            }*/
            Text(text = movimiento.value,
                modifier = Modifier.clickable
                {
                    //movimiento.value = "OK"
                    cuadradoVida(7) // Aqui debe restar cuadrados de vida

                })

        }

    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        Combate()
    }
}
