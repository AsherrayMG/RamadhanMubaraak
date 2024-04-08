package com.example.ramadhanmubarak

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.ramadhanmubarak.ui.theme.RamadhanMubarakTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashscreenActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySplash()
            val mContext = LocalContext.current
            val coroutine = rememberCoroutineScope()
            coroutine.launch{
                delay(1000)
                mContext.startActivity(Intent(mContext,Screen1Activity::class.java))
            }

        }
    }
}

@Composable
fun MySplash(){
    Column ( modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.rama),
            contentScale = ContentScale.FillBounds
        )
        ,

    ){
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.right))
        val progress by animateLottieCompositionAsState(composition)

        LottieAnimation(composition, progress,
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.Start)
        )
        Text(text = "Travellers Choice",
            fontFamily = FontFamily.Cursive,
            color = Color.DarkGray,
            fontSize = 70.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 130.dp))
    }

}

@Preview(showBackground = true)
@Composable
fun MySplashPreview(){
    MySplash()

}