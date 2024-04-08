package com.example.ramadhanmubarak

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class SignInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myform()


        }
    }
}

@Composable
fun myform(){
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.login),
            contentScale = ContentScale.FillBounds)
    ) {
        val mContext = LocalContext.current
        var firstname by remember { mutableStateOf("")}
        var lastname by remember { mutableStateOf("")}
        var email by remember { mutableStateOf("")}
        var password by remember { mutableStateOf("")}
        var contact by remember { mutableStateOf("")}

        Box (modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.login) ,
                contentDescription = "Register", modifier = Modifier.size(150.dp))
        }

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = firstname,
            onValueChange = { firstname = it},
            placeholder = { Text(text = "username") },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = lastname,
            onValueChange = { lastname = it},
            placeholder = { Text(text = "password") },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            mContext.startActivity(Intent(mContext,DestinationsActivity::class.java))
        } ,
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Login")
        }



    }

}

@Preview(showBackground = true)
@Composable
fun MyFormpreview(){
    myform()

}