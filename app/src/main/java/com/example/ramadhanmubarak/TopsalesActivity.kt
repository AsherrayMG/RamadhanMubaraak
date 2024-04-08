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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ramadhanmubarak.ui.theme.RamadhanMubarakTheme

class TopsalesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Topsales()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Topsales(){


    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = { Text(text = "", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(
                        Intent(
                            mContext,
                            MainActivity::class.java
                        )
                    )
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowback",
                        tint = Color.Black
                    )

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "share",
                        tint = Color.Black
                    )

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "settings",
                        tint = Color.Black
                    )

                }
            },

            )//End of TopAppBar
        Spacer(modifier = Modifier.height(5.dp))

        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .padding(start = 5.dp)
        ) {
            Text(
                text = "Chairs",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = "Tables",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray,
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = "Sofa",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray,
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = "Beds",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray,
            )


        }
        Spacer(modifier = Modifier.height(15.dp))
        Row {
            Text(
                text = " 120 Products",
                fontSize = 15.sp,
            )

            Text(
                text = " Popular ",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 170.dp),
            )
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = "ArrowDown",
                modifier = Modifier.padding(top = 5.dp)
            )
        }
        Column {
            Row(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                //Column1
                Card (modifier = Modifier.padding(start = 5.dp)){
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(150.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.out),
                                    contentDescription = "chair1",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Amos Chair",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Premium",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.820000",
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black

                            )
                            Icon(
                                imageVector = Icons.Default.Lock ,
                                contentDescription ="lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                        }


                    }
                }
                Spacer(modifier = Modifier.width(25.dp))
                Card {
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(150.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.two),
                                    contentDescription = "chair2",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Kew Chair",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Unlocked",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.12000",
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black

                            )
                            Icon(
                                imageVector = Icons.Default.Lock ,
                                contentDescription ="lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                        }


                    }
                }





            }
            Spacer(modifier = Modifier.height(25.dp))
            Row(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                //Column1
                Card (modifier = Modifier.padding(start = 5.dp)){
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(150.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.three),
                                    contentDescription = "chair3",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Buro Chair",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Trending",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.301000",
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black

                            )
                            Icon(
                                imageVector = Icons.Default.Lock ,
                                contentDescription ="lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                        }


                    }
                }
                Spacer(modifier = Modifier.width(25.dp))
                Card {
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(150.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.four),
                                    contentDescription = "chair4",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Tinar Chair",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Premium",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.37000",
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black

                            )
                            Icon(
                                imageVector = Icons.Default.Lock ,
                                contentDescription ="lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                        }


                    }
                }





            }
            Spacer(modifier = Modifier.height(25.dp))
            Row(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                //Column1
                Card (modifier = Modifier.padding(start = 5.dp)){
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(150.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.five),
                                    contentDescription = "chair5",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "William Chair",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Premium",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.560000",
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black

                            )
                            Icon(
                                imageVector = Icons.Default.Lock ,
                                contentDescription ="lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                        }


                    }
                }
                Spacer(modifier = Modifier.width(25.dp))
                Card {
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(150.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.six),
                                    contentDescription = "chair6",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Patel Chair",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Trending",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.120000",
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black

                            )
                            Icon(
                                imageVector = Icons.Default.Lock ,
                                contentDescription ="lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                        }


                    }
                }





            }
            Spacer(modifier = Modifier.height(25.dp))
            Row(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                //Column1
                Card (modifier = Modifier.padding(start = 5.dp)){
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(150.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.seven),
                                    contentDescription = "chair7",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Kiddie Chair",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Quality",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.20000",
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black

                            )
                            Icon(
                                imageVector = Icons.Default.Lock ,
                                contentDescription ="lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                        }


                    }
                }
                Spacer(modifier = Modifier.width(25.dp))

                Card {
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(150.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.eight),
                                    contentDescription = "chair10",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Karls Chair",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Premium",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.30000",
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black

                            )
                            Icon(
                                imageVector = Icons.Default.Lock ,
                                contentDescription ="lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                        }


                    }
                }





            }
        }

        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { mContext.startActivity(Intent(mContext,MainActivity::class.java)) },
            shape = RoundedCornerShape(50.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .align(Alignment.CenterHorizontally)

        ) {
            Text(text = "Travel")
        }

//End of Column1

    }

}

@Preview(showBackground = true)
@Composable
fun TopsalePreview(){
    Topsales()

}