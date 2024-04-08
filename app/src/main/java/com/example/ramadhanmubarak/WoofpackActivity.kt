package com.example.ramadhanmubarak

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ramadhanmubarak.ui.theme.RamadhanMubarakTheme

class WoofpackActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Woof()

        }
    }
}

@Composable
fun Woof(){
Column(
    modifier = Modifier.fillMaxSize()
) {
    Card (
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Row {
            Image(
                painter = painterResource(id = R.drawable.doggie),
                contentDescription = "Dog",
                modifier = Modifier
                    .width(60.dp)
                    .padding(start = 5.dp, top = 5.dp)

                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier.padding(start = 5.dp)
            ) {
                Text(
                    text = "Koda",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                    )
                Text(text = "2 years old")

            }
        }

    }
    Spacer(modifier = Modifier.height(1.dp))
    Card (
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Row {
            Image(
                painter = painterResource(id = R.drawable.doggie),
                contentDescription = "Dog",
                modifier = Modifier
                    .width(60.dp)
                    .padding(start = 5.dp, top = 5.dp)

                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier.padding(start = 5.dp)
            ) {
                Text(
                    text = "Lola",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                    )
                Text(text = "16 years old")

            }
        }

    }
    Spacer(modifier = Modifier.height(1.dp))
    Card (
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Row {
            Image(
                painter = painterResource(id = R.drawable.doggie),
                contentDescription = "Dog",
                modifier = Modifier
                    .width(60.dp)
                    .padding(start = 5.dp, top = 5.dp)

                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier.padding(start = 5.dp)
            ) {
                Text(
                    text = "Frankie",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                    )
                Text(text = "2 years old")

            }
        }

    }
    Spacer(modifier = Modifier.height(1.dp))
    Card (
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Row {
            Image(
                painter = painterResource(id = R.drawable.doggie),
                contentDescription = "Dog",
                modifier = Modifier
                    .width(60.dp)
                    .padding(start = 5.dp, top = 5.dp)

                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier.padding(start = 5.dp)
            ) {
                Text(
                    text = "Nox",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                    )
                Text(text = "8 years old")

            }
        }

    }
    Spacer(modifier = Modifier.height(1.dp))
    Card (
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Row {
            Image(
                painter = painterResource(id = R.drawable.doggie),
                contentDescription = "Dog",
                modifier = Modifier
                    .width(60.dp)
                    .padding(start = 5.dp, top = 5.dp)

                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier.padding(start = 5.dp)
            ) {
                Text(
                    text = "Faye",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                    )
                Text(text = "8 years old")

            }
        }

    }
    Spacer(modifier = Modifier.height(1.dp))
    Card (
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Row {
            Image(
                painter = painterResource(id = R.drawable.doggie),
                contentDescription = "Dog",
                modifier = Modifier
                    .width(60.dp)
                    .padding(start = 5.dp, top = 5.dp)

                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier.padding(start = 5.dp)
            ) {
                Text(
                    text = "Bella",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                    )
                Text(text = "14 years old")

            }
        }

    }
    Spacer(modifier = Modifier.height(1.dp))
    Card (
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Row {
            Image(
                painter = painterResource(id = R.drawable.doggie),
                contentDescription = "Dog",
                modifier = Modifier
                    .width(60.dp)
                    .padding(start = 5.dp, top = 5.dp)

                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier.padding(start = 5.dp)
            ) {
                Text(
                    text = "Moana",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                    )
                Text(text = "2 years old")

            }
        }

    }
    Spacer(modifier = Modifier.height(1.dp))
    Card (
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Row {
            Image(
                painter = painterResource(id = R.drawable.doggie),
                contentDescription = "Dog",
                modifier = Modifier
                    .width(60.dp)
                    .padding(start = 5.dp, top = 5.dp)

                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier.padding(start = 5.dp)
            ) {
                Text(
                    text = "Tzeitel",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                    )
                Text(text = "7 years old")

            }
        }

    }
    Spacer(modifier = Modifier.height(1.dp))

}
}

@Preview(showBackground = true)
@Composable
fun WoofPreview(){
    Woof()

}