package br.com.nomedaempresa.appcontador.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.mutableStateOf


@Composable
 fun MainView(  meuviewModel: MainViewModel){

    val contador: Int by meuviewModel.contador.observeAsState(0)


    var textFieldValue by remember {
        mutableStateOf("")
    }

    Column {

        Text(text = "contador")
        TextField(value = contador.toString(), onValueChange = {})
        Button(onClick = {

            meuviewModel.incrementaContador()
        }){
            Text(text = contador.toString())
        }
    }
}