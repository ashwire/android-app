package com.example.arita

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
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
import com.example.arita.ui.theme.AritaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()
           
        }
    }
}

@Composable
fun Text(){
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {

        val mContext = LocalContext.current
        androidx.compose.material3.Text(text = "Welcome to Android",
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic)
        androidx.compose.material3.Text(text = "It entails creating mobile applicatons for android devices")
        Spacer(modifier = Modifier.height(20.dp))

        
        androidx.compose.material3.Text(text = "Types of cars",

            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(50.dp),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.White)


        androidx.compose.material3.Text(text = "1. Ferrari")
        androidx.compose.material3.Text(text = "2. Toyota")
        androidx.compose.material3.Text(text = "3. Tesla")
        Spacer(modifier = Modifier.height(10.dp))

        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.contact))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(300.dp)
        )
        Spacer(modifier = Modifier.height(6.dp))

        androidx.compose.material3.Text(text = "Click Here to Contact Us",
            fontSize = 15.sp,
            color = Color.Blue,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    mContext.startActivity(Intent(mContext, FirstScreenActivity::class.java))
                })
        Spacer(modifier = Modifier.height(10.dp))



        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center)
             
        {
            Button(onClick = {
                mContext.startActivity(Intent(mContext,DestinationActivity::class.java))

            }) {
                androidx.compose.material3.Text(text = "Destination")

            }
            
        }

        
        Spacer(modifier = Modifier.height(20.dp))


        androidx.compose.material3.Text(text = "Fun Activities",
            fontSize = 20.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(50.dp))

        androidx.compose.material3.Text(text = "1.Playing football")
        androidx.compose.material3.Text(text = "2.Hiking")
        androidx.compose.material3.Text(text = "3.Going for a picnic")

        Spacer(modifier = Modifier.height(20.dp))

        Divider()


        //Centering an image
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.cars),
                contentDescription = "cars",
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {

            mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)

        ) {
            androidx.compose.material3.Text(text = "Next")

            }
            



    }

    
}



@Preview(showBackground = true)
@Composable
fun TextPreview(){
    Text()
}