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
        var nivelVida = remember { mutableStateOf(1.0f) }

        Surface(
            color = Color.LightGray,
            modifier = Modifier.fillMaxSize()
        ) {

            Row( //Row de movimientos
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Start
            ) {
                movimientos(onCB1= {nivelVida.value --})
            }

            Row( //Row de vida
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.End
            ) {
                cuadradoVida(nivelVida)

            }
        }
    }
}


@Composable
fun cuadradoVida(porcentaje: Float) = LinearProgressIndicator(progress = porcentaje)
    /*for (i in 0..numeroCuadrados) {
        Surface(
            color = Color.Green,
            modifier = Modifier.size(30.dp)
        ) {}
    }*/



@Composable
fun movimientos(onCB1:()->Unit, ) {

    var mov1 by remember { mutableStateOf("M1") }
    var mov2 by remember { mutableStateOf("M2") }
    var mov3 by remember { mutableStateOf("M3") }
    var mov4 by remember { mutableStateOf("M4") }

    DesktopMaterialTheme {
        Button(onClick = onCB1}) {
            Text(mov1)
        }

        Button(onClick = {
            nivelVida.value --
        }) {
            Text(mov2)
        }

        Button(onClick = {
            nivelVida.value --
        }) {
            Text(mov3)
        }

        Button(onClick = {
            nivelVida.value --
        }) {
            Text(mov4)
        }
    }

}


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        Combate()
    }
}
