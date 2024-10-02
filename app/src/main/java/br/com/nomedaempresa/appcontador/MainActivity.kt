package br.com.nomedaempresa.appcontador

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import br.com.nomedaempresa.appcontador.ui.theme.AppContadorTheme
import br.com.nomedaempresa.appcontador.view.MainView
import br.com.nomedaempresa.appcontador.view.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val meuViewModel = MainViewModel()




        enableEdgeToEdge()
        setContent {
            AppContadorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainView(meuViewModel)
                }
            }
        }
    }}

