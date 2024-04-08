package com.example.ramadhanmubarak

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.ramadhanmubarak.ui.theme.RamadhanMubarakTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo(){
    Column (modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.logo),
            contentScale = ContentScale.FillBounds
        ),

    ){
        val mContext = LocalContext.current
        Text(
            text = "Welcome to Android",
            fontSize = 30.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.Underline)

//Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.lego))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.CenterHorizontally)
        )
        //End of lottie animation

        Text(text = "Android is an operating system based on Linux with a Java programming interface for mobile devices such as Smartphone (Touch Screen Devices who supports Android ...\n")
        Text(text = "Types of cars",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .height(40.dp)

            ,
            textAlign = TextAlign.Center,
            color = Color.White)


        Text(text = "1.Subaru")
        Text(text = "2.Mercedes Benz")
        Text(text = "3.Audi")
        Text(text = "4.Mazda")
        Button(onClick = { mContext.startActivity(Intent(mContext,DestinationsActivity::class.java)) },
            shape = RoundedCornerShape(50.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .align(Alignment.CenterHorizontally)

        ) {
            Text(text = "Destination")
        }

Spacer(modifier = Modifier.height(20.dp))
Divider()
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "eMobilis training institute",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(5.dp))
Box (modifier = Modifier.fillMaxWidth(),
    contentAlignment = Alignment.Center                  ){
   
}
        //Start of button
Button(onClick ={
    mContext.startActivity(Intent(mContext,Layoutactivity::class.java))
},

        shape = RoundedCornerShape(5.dp),
    colors = ButtonDefaults.buttonColors(Color.Red),
    modifier = Modifier
        .fillMaxWidth()
        .padding(start = 30.dp, end = 30.dp)
) {
 Text(text = "Continue")
}
        //End of button
        Text(text = "Ramadhan Kareem",
            fontSize = 15.sp,

            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                ,
            textAlign = TextAlign.Center
        )
        Text(text = "May Allah bless you with strength and perseverance as you observe fasting during Ramadan. 78. Ramadan Kareem! May the blessings of this holy month bring peace and happiness to your life."
                )
        Text(text = "Ramadhan Mubarak رمضان مُبارك")
        Text(text = "From CarSoko ltd.",
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
            ,
            textAlign = TextAlign.Center )
        Spacer(modifier = Modifier.height(20.dp))


    }
}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()
}