package com.example.ramadhanmubarak

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ramadhanmubarak.ui.theme.Purple11
import com.example.ramadhanmubarak.ui.theme.RamadhanMubarakTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Screen2Activity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Screen2()
            val mContext = LocalContext.current
            val coroutine = rememberCoroutineScope()
            coroutine.launch{
                delay(1000)
                mContext.startActivity(Intent(mContext,Screen3Activity::class.java))
            }

        }
    }
}

@Composable
fun Screen2(){

    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ){
        val mContext = LocalContext.current
        Image(painter = painterResource(id = R.drawable.lady2),
            contentDescription = "lady",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop)
        Spacer(modifier = Modifier.height(15.dp))
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Add to your cart",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp,
        )
        Spacer(modifier = Modifier.height(35.dp))

        Text(text = "We offer over 500 upholstery choices, multiple configurations, and style options to make it yours.From upcycling our leather to our domestic sourcing efforts, we lead the industry in manufacturing sustainably.")


        Spacer(modifier = Modifier.height(35.dp))

        Button(onClick = { mContext.startActivity(Intent(mContext, Screen3Activity::class.java)) },
            shape = RoundedCornerShape(100.dp),
            colors = ButtonDefaults.buttonColors(Purple11),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)) {
            Text(text = "Next")

        }




    }

}

@Preview(showBackground = true)
@Composable
fun Screen2Preview(){
    Screen2()

}