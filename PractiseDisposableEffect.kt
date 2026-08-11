package com.example.cse226

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.cse226.ui.theme.CSE226Theme

class PractiseDisposableEffect : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {
        var showOption by remember{ mutableStateOf(true) }
        Button(onClick = {showOption=!showOption}) {
            Text(if(showOption) "Remove Screen" else "Show Screen")
        }
        if(showOption) EffectScreen()
    }
}

@Composable
fun EffectScreen(){
    val context= LocalContext.current
    DisposableEffect(Unit){
        Toast.makeText(context,"Showing Screen",Toast.LENGTH_SHORT).show()
        onDispose {
            Toast.makeText(context,"Screen Removed",Toast.LENGTH_SHORT).show()
        }
    }
    Text("Welcome to the App...",
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.headlineSmall
        )

}
