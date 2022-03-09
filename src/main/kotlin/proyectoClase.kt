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

@Composable
fun Combate() {
    var text by remember { mutableStateOf("Hello, World!") }

    DesktopMaterialTheme {
        Button(onClick = {
            text = "Hello, Desktop!"
        }) {
            Text(text)
        }
    }

}

@Composable

fun cuadrado1(color1: Color, color2: Color) {
    Surface(
        color = color1,
        modifier = Modifier.size(60.dp)
    ) {}
    Surface(
        color = color2,
        modifier = Modifier.size(60.dp)
    ) {}
}

@Composable
fun cuadrado2(color1: Color, color2: Color) {
    Surface(
        color = color1,
        modifier = Modifier.size(60.dp)
    ) {}
    Surface(
        color = color2,
        modifier = Modifier.size(60.dp)
    ) {}

}

@Composable
fun aplicacionUsoRowCOlumn() {
    Surface(
        color = Color.Black, //fondo
        modifier = Modifier.fillMaxSize() //lo ajustamos para que ocupe el maximo de la ventana
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            cuadrado1(Color.Magenta, Color.Green)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            cuadrado2(Color.Yellow, Color.White)
        }
    }
}


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        aplicacionUsoRowCOlumn()
    }
}
