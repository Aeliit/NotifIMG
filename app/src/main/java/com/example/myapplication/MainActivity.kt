package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("All tasks completed", "Nice Work!"))

        }
    }
}



data class Message(val author: String, val body: String)

    @Composable
    fun MessageCard(msg: Message) {
        Row(
            Modifier
                .fillMaxSize()
                .padding(top = 230.dp, bottom = 155.dp),
                horizontalArrangement =  Arrangement.Center,

        ) {

            Image(
                painter = painterResource(R.drawable.notification),
                contentDescription = "Notification Icon",
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .padding(4.dp)
            )

        }


        Spacer(modifier = Modifier.height(16.dp))
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = msg.author, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 450.dp, bottom = 0.dp))
            Text(text = msg.body, fontSize = 16.sp)


        }
    }





@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard (
        msg = Message("Android", "haha")
    )
}
