package com.example.puzzleandpictures.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.puzzleandpictures.ui.theme.Gold
import com.example.puzzleandpictures.ui.theme.Red

@Composable
fun GachaButton(
    onGachaTapped: () -> Unit
) {
    Button(
        onClick = {onGachaTapped()},
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Gold,
            contentColor = Red,
        )
    ) {
        Text(text = "GACHA")
    }

}

@Composable
fun ClearButton(
    onClearTapped: () -> Unit,
) {
    Button(onClick = {onClearTapped()})
    {
        Text(text = "CLEAR")
    }
}

@Composable
fun ShowButtons(
    onGachaTapped: () -> Unit,
    onClearTapped: () -> Unit,
) {
    Column {
        GachaButton(onGachaTapped)
        ClearButton(onClearTapped)
    }
}

@Preview
@Composable
fun PreviewShowButton() {
    ShowButtons({}, {})
}
