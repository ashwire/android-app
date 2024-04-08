package com.example.arita

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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
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
import com.example.arita.ui.theme.AritaTheme

class FinalActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Final()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Final(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext= LocalContext.current
        //TopAppBar
        TopAppBar(title = {  },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription ="back",
                        tint = Color.Black)

                }

            },
            actions = {
                IconButton(onClick = {
                    val shareIntent= Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                }) {
                    Icon(imageVector = Icons.Default.Lock,
                        contentDescription = "lock",
                        tint = Color.Black
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = Color.Black
                    )
                }
            })
        //End of TopAppBar

        Spacer(modifier = Modifier.height(20.dp))
        //row1
        Row (modifier = Modifier
            .horizontalScroll(rememberScrollState())){
            androidx.compose.material3.Text(text = "Chairs",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                fontFamily = FontFamily.Default
            )
            Spacer(modifier = Modifier.width(10.dp))
            androidx.compose.material3.Text(text = "Tables",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                fontFamily = FontFamily.Default
            )
            Spacer(modifier = Modifier.width(10.dp))
            androidx.compose.material3.Text(text = "Sofa",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                fontFamily = FontFamily.Default
            )
            Spacer(modifier = Modifier.width(10.dp))
            androidx.compose.material3.Text(text = "Benches",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                fontFamily = FontFamily.Default
            )
            Spacer(modifier = Modifier.height(10.dp))
            Column(modifier = Modifier.fillMaxWidth()) {
                Row {
                    androidx.compose.material3.Text(text = "120 Products",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Default
                    )
                    Spacer(modifier = Modifier.width(50.dp))
                    androidx.compose.material3.Text(text = "Popular",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Default
                    )


                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row (modifier = Modifier.padding(start = 20.dp)){
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.ch2),
                                contentDescription = "china",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        androidx.compose.material3.Text(text = "Amos Chair",
                            fontSize = 10.sp,
                            fontFamily = FontFamily.Default,
                            fontWeight = FontWeight.ExtraBold)
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(text = "A chair is a type of seat, typically designed for one person and consisting of one or more legs, a flat or slightly angled seat and a back-rest",
                            fontSize = 10.sp,
                            fontFamily = FontFamily.Default
                        )
                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(text = "Ksh.680",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Default )



                    }
                }
                //end of column1
                Spacer(modifier = Modifier.width(15.dp))
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.ch2),
                                contentDescription = "chair",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        androidx.compose.material3.Text(text = "Kew Chair",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Default,
                            )
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(text = "A chair is a type of seat, typically designed for one person and consisting of one or more legs, a flat or slightly angled seat and a back-rest",
                            fontSize = 10.sp,
                            fontFamily = FontFamily.Default,
                            fontWeight = FontWeight.ExtraBold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(text = "Ksh.680",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Default )



                    }
                }

            }
            //End of Row1
            Spacer(modifier = Modifier.height(20.dp))




        }

    }

}

@Preview(showBackground = true,showSystemUi = true)
@Composable
fun FinalPreview(){
    Final()
}