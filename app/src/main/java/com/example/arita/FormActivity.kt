package com.example.arita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.arita.ui.theme.AritaTheme

class FormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Form()
            
            }
        }
    }


@Composable
fun Form(){
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.bg), contentScale = ContentScale.FillBounds)
        .verticalScroll(rememberScrollState())

    ) {
        var firstname by remember {mutableStateOf("")}
        var lastname by remember {mutableStateOf("")}
        var email by remember {mutableStateOf("")}
        var password by remember {mutableStateOf("")}
        var contact by remember {mutableStateOf("")}
        var location by remember {mutableStateOf("")}

        Box (modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.regi),
                contentDescription ="register",
                modifier = Modifier.size(200.dp))
                       

        }
        Spacer(modifier = Modifier.height(10.dp))
        androidx.compose.material3.Text(text ="Create an Account",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            modifier = Modifier.fillMaxWidth())


        Spacer(modifier = Modifier.height(20.dp))


            TextField(value = firstname,
                onValueChange = {firstname=it},
                placeholder ={ androidx.compose.material3.Text(text = "Firstname")},
                leadingIcon = {   Icon(imageVector = Icons.Default.Person, contentDescription = "Person")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

            )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(value = lastname,
            onValueChange = {lastname=it},
            placeholder ={ androidx.compose.material3.Text(text = "lastname")},
            leadingIcon = {   Icon(imageVector = Icons.Default.Person, contentDescription = "Person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(value = email,
            onValueChange = {email=it},
            placeholder ={ androidx.compose.material3.Text(text = "Email Address")},
            leadingIcon = {   Icon(imageVector = Icons.Default.Email, contentDescription = "email")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(value = password,
            onValueChange = {password=it},
            placeholder ={ androidx.compose.material3.Text(text = "password")},
            leadingIcon = {   Icon(imageVector = Icons.Default.Lock, contentDescription = "lock")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(value = contact,
            onValueChange = {contact=it},
            placeholder ={ androidx.compose.material3.Text(text = "Phone Number")},
            leadingIcon = {   Icon(imageVector = Icons.Default.Call, contentDescription = "Call")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)

        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = contact,
            onValueChange = {contact=it},
            placeholder ={ androidx.compose.material3.Text(text = "location")},
            leadingIcon = {   Icon(imageVector = Icons.Default.LocationOn, contentDescription = "Location")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)

        )
        Spacer(modifier = Modifier.height(10.dp))
        
        Box (modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red)) {
                androidx.compose.material3.Text(text = "Register Now")

            }
        }

        androidx.compose.material3.Text(text = "Already have an account? Login",
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth())









        }

    }









@Preview(showBackground = true)
@Composable
fun FormPreview(){
    Form()
}