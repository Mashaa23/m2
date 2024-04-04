package com.dennis.m2

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dennis.m2.ui.theme.M2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            M2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                 //   Greeting("Android")
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home(){
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)){
     Text(text = "Dennis' Mobile App",
                color = Color.Cyan,
         fontSize = 35.sp,
         fontFamily = FontFamily.SansSerif

     )
     Spacer(modifier = Modifier.height(30.dp))


    Text(text = "Manchester United GGMU",
        color = Color.Red,
        fontSize = 30.sp,
        fontFamily = FontFamily.Default

        )
    Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Welcome to Android Programming",
            color = Color.Cyan,
            fontSize = 28.sp,

            )
        Spacer(modifier = Modifier.height(25.dp))
  //      Image(painter = painterResource(id = R.drawable.manulogo),
    //       contentDescription = "null",










    }
}

@Preview
@Composable
private fun Homepre(){
    Home()
}