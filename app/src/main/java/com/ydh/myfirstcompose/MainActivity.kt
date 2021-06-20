package com.ydh.myfirstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ydh.myfirstcompose.ui.theme.MyFirstComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    NewStory("Android")
                }
            }
        }
    }
}

@Composable
fun NewStory(name: String) {
    MaterialTheme() {
        val typography = MaterialTheme.typography
        Column(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.header),
                contentDescription = null,
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(6.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(18.dp))
            Text(text = "A day wandering through the sandhills " +
                    "in Shark Fin Cove, and few of the " +
                    "sight I saw",
            style = typography.h6,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis)
            Text(text = "Devenport, California",
            style = typography.body2)
            Text(text = "December 2018",
            style = typography.body2)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFirstComposeTheme {
        NewStory("Android")
    }
}