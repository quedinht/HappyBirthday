package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    GreetingWithImage()
                    ComposeArticle()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column {
        Text(text = "Hello $name!",
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(all = 16.dp))
        Text(text = stringResource(R.string.happy_birthday_text),
            fontSize = 26.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally))
    }
}

@Composable
fun GreetingWithImage() {
    val  image = painterResource(id = R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Greeting(name = "Android")
    }
    
}

@Composable
fun ComposeArticle() {
    Column {
        val image = painterResource(id = R.drawable.bg_compose_background)
        Image(painter = image, contentDescription = null)
        Text(text = stringResource(R.string.jacket_compose_tutorial),
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .wrapContentWidth(Alignment.Start))
        Text(text = stringResource(R.string.jacket_compose_content),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            )

        Text(text = stringResource(R.string.jacket_compose_tutorial_2),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
//        Greeting("Android")
//        GreetingWithImage()
        ComposeArticle()
    }
}