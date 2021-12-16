package com.example.puzzleandpictures.view


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.puzzleandpictures.R


@Composable
fun ImageChoose(
    imageID: Int,
) {
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
        else -> id = R.drawable.white
    }


    Image(
        painter = painterResource(id = id),
        contentDescription = "puzzle view",
        modifier = Modifier.fillMaxSize(),
    )
}





