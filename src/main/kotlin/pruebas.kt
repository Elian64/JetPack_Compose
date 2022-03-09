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
@Preview
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        color = Color.Blue,
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
/*
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
*/
/*
//Uso de Row (Ejemplos)
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
*/

//Uso de State Lista
/*
@Composable
fun ListaState() {
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ) {
        StudentList()
    }
}

@Composable
fun StudentList() {
    val text = remember {mutableStateOf("Hello!")}
    val studentsState = remember { mutableStateListOf("Juan", "Victor", "Esther", "Jaime") }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        for (student in studentsState) {
            StudentText(name = student)
        }
        TextField(
            value = text.value,
            onValueChange = { text.value = it },
            label = { Text(text = "Nombre nuevo estudiante") }
        )
        Button(
            onClick = {
                if(text.value !in studentsState)
                studentsState.add(text.value) }
        ) {
            Text(text = "Add new student")
        }
    }
}

@Composable
fun StudentText(name: String) {
    Text(
        text = name,
        style = MaterialTheme.typography.h5,
        modifier = Modifier.padding(15.dp) //ajusta separacion de nombres (Importante el padding)
    )
}

 */

// Uso de State Lista (ahora con TextField) || Ya hecho realmente arriba (editado codigo de ejemplo)

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        //GreetingButton()
        //aplicacionUsoRowCOlumn()
        // ListaState()
    }
}

