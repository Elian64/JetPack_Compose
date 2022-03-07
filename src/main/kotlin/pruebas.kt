// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.mouseClickable
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application



@Composable
@Preview
fun Greeting(name: String) {
    Text(text = "Hello $name!",
        color= Color.Blue,
        fontSize = 30.sp

                /*modifier = Modifier
                .width(80.dp)
            .height(240.dp))*/
    )

 // Text() admite por parámetro argumentos como text, modifier, color, fontSize , etc.
}
/*

@Composable
fun GreetingButton() {
    var texto by remember { mutableStateOf("Persona") } //Revisar para que -> Hola persona/ Adios persona
    Button(onClick = {
        texto= "Adios"
    }) {
        Greeting(texto)
    }
}*/
/*
@Composable
fun App2() =
DesktopMaterialTheme {
    var text by remember { mutableStateOf("Hola") }
    var miColor by remember { mutableStateOf(Color.Red) }

    Button(onClick = {
        text = "Adios!"
    }) {
        Text(text, color = miColor, modifier =
        Modifier.clickable { miColor = Color.Green })
    }
}
*/

@Composable
fun App3()=
    DesktopMaterialTheme {
    var valor1 by remember { mutableStateOf("Pulsa el botón") }
    var color1 by remember { mutableStateOf(Color.Red) }
        var color2 by remember { mutableStateOf(Color.Green) }

        Button(onClick = {
            valor1 = "Botón pulsado"
            color1= color2
        })
        {
        Text(valor1,
            style = TextStyle(
                color = color1

            )
        )

            Surface {
                Color.Magenta //Como aplicar este contenedor??
                Modifier.width(200.dp)

            }

        }


    }

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        //GreetingButton()
        App3()
    }
}

