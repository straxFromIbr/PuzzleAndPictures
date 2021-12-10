package com.example.puzzleandpictures

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TakiView()
        }
    }
}

@Composable
fun TakiView() {
    Column {
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


@Preview
@Composable
fun PreviewShowTaki() {
    TakiView()
}
