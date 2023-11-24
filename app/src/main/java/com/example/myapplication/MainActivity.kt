package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Text("Hello World")
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MessageCard(Message("Android","Jetpack Compose"))
                }
            }
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Column {
        Text(text = msg.author)
        Text(text = msg.body)
    }
}

@Preview(showBackground = true)
@Composable
fun MessageCardPreview() {
    MessageCard(msg = Message("Colleague","Hey, you are looking great!"))
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier= Modifier){
    val image  = painterResource(R.drawable.profile_picture)
//    Image (
//        painter = image
//    )
}



