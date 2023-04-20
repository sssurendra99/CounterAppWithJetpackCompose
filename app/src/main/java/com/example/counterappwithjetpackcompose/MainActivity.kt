package com.example.counterappwithjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Counter()
        }
    }
}


@Composable
fun Counter(){
    val number = remember {
        mutableStateOf(0)
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize()
    ) {

        Text(text = "My Counter App", style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight(600),
            textAlign = TextAlign.Center,
            color = Color.LightGray,

            ), modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 10.dp)

        )

        Text(text = "${number.value}", style = TextStyle(
            fontSize = 30.sp,

            )
        )
        IconButton(onClick = { number.value+=1 }) {
            Icon(Icons.Outlined.AddCircle, contentDescription = null, tint = Color.Black,
                modifier = Modifier
                    .size(40.dp)
            )

        }


    }
}

@Preview(showBackground = true)
@Composable
fun CounterPreview(){
    Counter()
}