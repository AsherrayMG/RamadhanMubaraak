package com.example.ramadhanmubarak

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ramadhanmubarak.ui.theme.RamadhanMubarakTheme

class DestinationsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Destination()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination(){
    Column (modifier = Modifier.fillMaxSize()){
val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = { Text(text = "HomeScreen",color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black),
            navigationIcon = {
                IconButton(onClick = { mContext.startActivity(Intent(mContext,MainActivity::class.java)) }){
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrow back",
                        tint = Color.White)
                }

            },

            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share ,
                        contentDescription = "share",
                        tint = Color.White)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings ,
                        contentDescription = "settings",
                        tint = Color.White)
                }
            }
        )
//End of topApp bar
Box(modifier = Modifier
    .fillMaxWidth()
    .height(200.dp),
    contentAlignment = Alignment.Center
) {
Image(painter = painterResource(id = R.drawable.paris),
    contentDescription = "newyork",
    modifier = Modifier.fillMaxSize(),
    contentScale = ContentScale.Crop)
    Text(text = "Lets plan your next vacation",
        fontSize = 35.sp,
        fontFamily = FontFamily.Cursive)
}

        Spacer(modifier = Modifier.height(10.dp))

        var search by remember { mutableStateOf("")}
        //Search bar
            OutlinedTextField(
                value = search,
                onValueChange = {search = it},
                placeholder = { Text(text = "What's your destination?")},
                leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp)
            )
        //End of search bar
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Recently Viewed",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp))
        Spacer(modifier = Modifier.height(10.dp))
Row (modifier = Modifier
    .horizontalScroll(rememberScrollState())){
    //Card1
    Card(modifier = Modifier
        .height(200.dp)
        .width(200.dp)
    ) {
        Column {
            Box (modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
                contentAlignment = Alignment.Center){
                Image(painter = painterResource(id = R.drawable.login), contentDescription = "newyork",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop)
            }
            Text(text = "Berlin",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }

    }
//End of card1

    Spacer(modifier = Modifier.width(8.dp))
    //Card2
    Card(modifier = Modifier
        .height(200.dp)
        .width(200.dp)
    ) {
        Column {
            Box (modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
                contentAlignment = Alignment.Center){
                Image(painter = painterResource(id = R.drawable.login), contentDescription = "newyork",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop)
            }
            Text(text = "Berlin",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }

    }
//End of card2

    Spacer(modifier = Modifier.width(8.dp))

    //Card3
    Card(modifier = Modifier
        .height(200.dp)
        .width(200.dp)
    ) {
        Column {
            Box (modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
                contentAlignment = Alignment.Center){
                Image(painter = painterResource(id = R.drawable.login), contentDescription = "newyork",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop)
            }
            Text(text = "Berlin",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }

    }
//End of card3

    Spacer(modifier = Modifier.width(8.dp))

    //Card4
    Card(modifier = Modifier
        .height(200.dp)
        .width(200.dp)
    ) {
        Column {
            Box (modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
                contentAlignment = Alignment.Center){
                Image(painter = painterResource(id = R.drawable.login), contentDescription = "newyork",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop)
            }
            Text(text = "Berlin",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }

    }
//End of card4

    Spacer(modifier = Modifier.width(8.dp))
}
OutlinedButton(onClick = {  mContext.startActivity(Intent(mContext,ExploreActivity::class.java)) }) {
    Text(text = "Book ticket")
    
}
        //Start of button
        Button(onClick ={
            mContext.startActivity(Intent(mContext,LottieActivity::class.java))
        },

            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Contact Us")
        }
        //End of button
    }

}

@Preview(showBackground = true)
@Composable
fun DestinationPreview(){
    Destination()
}
