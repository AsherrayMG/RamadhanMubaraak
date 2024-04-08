package com.example.ramadhanmubarak

import android.content.Intent
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Layoutactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column(modifier = Modifier.fillMaxSize()) {
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
        Text(
            text = "Destinations",
            fontSize = 30.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Cursive)
        //First Row
        Row {
            Image(painter = painterResource(id = R.drawable.paris),
                contentDescription = "Paris",
                modifier = Modifier.size(width = 200.dp, height = 150.dp))
            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(text = "Paris")
                Text(text = "Paris (nicknamed the \"City of light\") is the capital city of France, and the largest city in France. The area is 105 square kilometres (41 square miles), and around 2.15 million people live there.")

            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        //End of Row


        //First Row
        Row {
            Image(painter = painterResource(id = R.drawable.parism),
                contentDescription = "Paris",
                modifier = Modifier.size(width = 200.dp, height = 150.dp))
            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(text = "Bangkok")
                Text(text = "Bangkok, officially known in Thai as Krung Thep Maha Nakhon and colloquially as Krung Thep, is the capital and most populous city of Thailand.")

            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        //End of Row


        //First Row
        Row {
            Image(painter = painterResource(id = R.drawable.parisr),
                contentDescription = "Paris",
                modifier = Modifier.size(width = 200.dp, height = 150.dp))
            Spacer(modifier = Modifier.width(15.dp))


            Column {

                Text(text = "New Zealand")
                Text(text = "Official site of New Zealand Tourism, Business, and Investment. Activities, tours, maps and accommodation to plan your New Zealand holiday.\n")
            }



        }
        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = {
            mContext.startActivity(Intent(mContext,formActivity::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()

                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Next")
        }

        //End of Row





    }
Spacer(modifier = Modifier.width(15.dp))

}



@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}