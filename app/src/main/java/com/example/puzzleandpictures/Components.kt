package com.example.puzzleandpictures

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text


import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


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
fun PreviewImage() {
    ImageChoose(1)
}