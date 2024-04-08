package com.example.arita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Card


import com.example.arita.ui.theme.AritaTheme

class WoofActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Woof()
        }
    }
}

@Composable
fun Woof(){
    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())){
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Row {
                Image(painter = painterResource(id = R.drawable.dog2), contentDescription = "wolf")
                androidx.compose.material3.Text(
                    text = "Woof",
                    fontFamily = FontFamily.Serif,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        //Card1
        Card (shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp),
            colors = CardDefaults.cardColors(containerColor = Color.LightGray),
            modifier = Modifier
                .height(100.dp)
                .width(400.dp)
                .padding(
                    start = 10.dp, end = 10.dp,
                )

        ){
            Row {
                Image(painter = painterResource(id = R.drawable.dog2)
                    , contentDescription ="dog",
                    modifier = Modifier
                        .padding(15.dp)
                        .size(90.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Column( modifier = Modifier.padding(10.dp)) {
                    androidx.compose.material3.Text(text = "Koda",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,

                        )
                    androidx.compose.material3.Text(text = "2 years old",
                        fontSize = 20.sp)
                }
            }


        }

        //End of card1
        Spacer(modifier = Modifier.height(20.dp))

        //Card2
        Card (
            modifier = Modifier
            .height(100.dp)
            .width(400.dp)
            .padding(start = 10.dp, end = 10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.LightGray),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp)

        ){
            Row {
                Image(painter = painterResource(id = R.drawable.dog3)
                    , contentDescription ="dog",
                    modifier = Modifier
                        .padding(15.dp)
                        .size(90.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Column( modifier = Modifier.padding(10.dp)) {
                    androidx.compose.material3.Text(text = "Lola",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,

                        )
                    androidx.compose.material3.Text(text = "2 years old",
                        fontSize = 20.sp)
                }
            }


        }
        //End of card2
        Spacer(modifier = Modifier.height(20.dp))

        //Card1
        Card (modifier = Modifier
            .height(100.dp)
            .width(400.dp)
            .padding(start = 10.dp, end = 10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.LightGray),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp)

        ){
            Row {
                Image(painter = painterResource(id = R.drawable.dog1)
                    , contentDescription ="dog",
                    modifier = Modifier
                        .padding(15.dp)
                        .size(90.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Column( modifier = Modifier.padding(10.dp)) {
                    androidx.compose.material3.Text(text = "Frankie",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,

                        )
                    androidx.compose.material3.Text(text = "2 years old",
                        fontSize = 20.sp)
                }
            }


        }
        //End of card1
        Spacer(modifier = Modifier.height(20.dp))

        //Card1
        Card (modifier = Modifier
            .height(100.dp)
            .width(400.dp)
            .padding(start = 10.dp, end = 10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.LightGray),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp)

        ){
            Row {
                Image(painter = painterResource(id = R.drawable.dog2)
                    , contentDescription ="dog",
                    modifier = Modifier
                        .padding(15.dp)
                        .size(90.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Column( modifier = Modifier.padding(10.dp)) {
                    androidx.compose.material3.Text(text = "Nox",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,

                        )
                    androidx.compose.material3.Text(text = "8 years old",
                        fontSize = 20.sp)
                }
            }


        }
        //End of card1
        Spacer(modifier = Modifier.height(20.dp))

        //Card1
        Card (modifier = Modifier
            .height(100.dp)
            .width(400.dp)
            .padding(start = 10.dp, end = 10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.LightGray),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp)

        ){
            Row {
                Image(painter = painterResource(id = R.drawable.dog3)
                    , contentDescription ="dog",
                    modifier = Modifier
                        .padding(15.dp)
                        .size(90.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Column( modifier = Modifier.padding(10.dp)) {
                    androidx.compose.material3.Text(text = "Faye",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,

                        )
                    androidx.compose.material3.Text(text = "8 years old",
                        fontSize = 20.sp)
                }
            }


        }
        //End of card1
        Spacer(modifier = Modifier.height(20.dp))

        //Card1
        Card (modifier = Modifier
            .height(100.dp)
            .width(400.dp)
            .padding(start = 10.dp, end = 10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.LightGray),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp)

        ){
            Row {
                Image(painter = painterResource(id = R.drawable.dog1)
                    , contentDescription ="dog",
                    modifier = Modifier
                        .padding(15.dp)
                        .size(90.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Column( modifier = Modifier.padding(10.dp)) {
                    androidx.compose.material3.Text(text = "Bela",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,

                        )
                    androidx.compose.material3.Text(text = "14 years old",
                        fontSize = 20.sp)
                }
            }


        }
        //End of card1
        Spacer(modifier = Modifier.height(20.dp))

        //Card1
        Card (modifier = Modifier
            .height(100.dp)
            .width(400.dp)
            .padding(start = 10.dp, end = 10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.LightGray),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp)

        ){
            Row {
                Image(painter = painterResource(id = R.drawable.dog2)
                    , contentDescription ="dog",
                    modifier = Modifier
                        .padding(15.dp)
                        .size(90.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Column( modifier = Modifier.padding(10.dp)) {
                    androidx.compose.material3.Text(text = "Moana",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,

                        )
                    androidx.compose.material3.Text(text = "2 years old",
                        fontSize = 20.sp)
                }
            }


        }
        //End of card1
        Spacer(modifier = Modifier.height(20.dp))

        //Card1
        Card (modifier = Modifier
            .height(100.dp)
            .width(400.dp)
            .padding(start = 10.dp, end = 10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.LightGray),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp)


        ){
            Row {
                Image(painter = painterResource(id = R.drawable.dog3)
                    , contentDescription ="dog",
                    modifier = Modifier
                        .padding(15.dp)
                        .size(90.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Column( modifier = Modifier.padding(10.dp)) {
                    androidx.compose.material3.Text(text = "Tzeitel",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,

                        )
                    androidx.compose.material3.Text(text = "7 years old",
                        fontSize = 20.sp)
                }
            }


        }
        //End of card1
        Spacer(modifier = Modifier.height(20.dp))

    }

}

@Preview(showBackground = true)
@Composable
fun WoofPreview(){
    Woof()
}