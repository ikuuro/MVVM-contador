package br.com.nomedaempresa.appcontador.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier


@Composable
 fun MainView(modifier: Modifier = Modifier, viewModel: MainViewModel){

    val contador: Int by viewModel.contador.observeAsState(0)

    Column {

        Text(text = "contador")
        TextField(value = contador.toString(), onValueChange = {})
        Button(onClick = {

            viewModel.incrementaContador()
        }){
            Text(text = contador.toString())
        }
    }
}