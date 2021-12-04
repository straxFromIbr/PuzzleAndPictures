package com.example.jetpacksampleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*


import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowTaki()
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun ShowTaki() {
    Column {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            Row {
                ImageChoose(0)
                ImageChoose(1)
                ImageChoose(2)
                ImageChoose(3)
            }
            Row {
                ImageChoose(4)
                ImageChoose(5)
                ImageChoose(6)
                ImageChoose(7)
            }
            Row {
                ImageChoose(8)
                ImageChoose(9)
                ImageChoose(10)
                ImageChoose(11)
            }
            Row {
                ImageChoose(12)
                ImageChoose(13)
                ImageChoose(14)
                ImageChoose(15)
            }
        }
    }
}


@Composable
fun ImageChoose(imageID: Int) {
    var id = R.drawable.takizawa
    when (imageID) {
        // このぶぶんどうにかしてほしい
        0 -> id = R.drawable.taki_0_0
        1 -> id = R.drawable.taki_0_1
        2 -> id = R.drawable.taki_0_2
        3 -> id = R.drawable.taki_0_3
        4 -> id = R.drawable.taki_1_0
        5 -> id = R.drawable.taki_1_1
        6 -> id = R.drawable.taki_1_2
        7 -> id = R.drawable.taki_1_3
        8 -> id = R.drawable.taki_2_0
        9 -> id = R.drawable.taki_2_1
        10 -> id = R.drawable.taki_2_2
        11 -> id = R.drawable.taki_2_3
        12 -> id = R.drawable.taki_3_0
        13 -> id = R.drawable.taki_3_1
        14 -> id = R.drawable.taki_3_2
        15 -> id = R.drawable.taki_3_3
    }
    Image(
        painter = painterResource(id = id),
        contentDescription = "Contact profile picture",
        modifier = Modifier.size(80.dp),
    )
}


@Preview
@Composable
fun PreviewShowTaki() {
    ShowTaki()
}