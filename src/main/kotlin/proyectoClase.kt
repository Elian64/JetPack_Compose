// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.HorizontalScrollbar
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.mouseClickable
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.ApplicationScope
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.jetbrains.skija.Surface
import javax.swing.text.Style
import kotlin.system.exitProcess

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

// Barra de vida basado en una barra de progreso basada en un porcentaje
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

