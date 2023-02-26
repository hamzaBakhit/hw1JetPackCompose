package com.example.hw1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (
                modifier = Modifier.background(Color.Black)
            ){
                hw1()
            }
        }
    }
}

@Composable
fun ColumnScope.hw1() {
    Row(
        modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .weight(1f)
    ) {
        Text(text = "TextView", style = TextStyle(fontSize = 15.sp, color = Color.White, textAlign = TextAlign.Center))
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top =  3.dp)
            .weight(2f)
    ) {
        Column(
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxHeight()
                .padding(end =  3.dp )
                .weight(3f)
        ) {
            Text(text = "TextView", style = TextStyle(fontSize = 15.sp, color = Color.White, textAlign = TextAlign.Center))
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {

            Row(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxWidth()

                    .weight(2f)
            ) {
                Text(text = "TextView", style = TextStyle(fontSize = 15.sp, color = Color.White, textAlign = TextAlign.Center))
            }
            Row(
                modifier = Modifier
                    .background(Color.Yellow)
                    .fillMaxWidth()
                    .padding(top=  3.dp)
                    .weight(1f)
            ) {
                Text(text = "TextView", style = TextStyle(fontSize = 15.sp, color = Color.White, textAlign = TextAlign.Center))

            }
        }
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top =  3.dp)
            .weight(1f)
    ) {
        Column(
            modifier = Modifier
                .background(colorResource(id = R.color.purple_200))
                .fillMaxHeight()

                .weight(1f)
        ) {
            Text(text = "TextView", style = TextStyle(fontSize = 15.sp, color = Color.White, textAlign = TextAlign.Center))
        }
        Column(
            modifier = Modifier
                .background(Color.Gray)
                .fillMaxHeight()
                .padding(start =   3.dp)
                .weight(2f)
        ) {
            Text(text = "TextView", style = TextStyle(fontSize = 15.sp, color = Color.White, textAlign = TextAlign.Center))
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column {
        hw1()
    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    hw1 {
//        Greeting("Android")
//    }
//}
//
