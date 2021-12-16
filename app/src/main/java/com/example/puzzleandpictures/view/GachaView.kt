package com.example.puzzleandpictures.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.puzzleandpictures.repository.RowPicIDs


@Composable
fun GachaResultView(
    rowPicIDs: RowPicIDs,
    onPicSelected: (imageID: Int) -> Unit
) {
    Column {
        Row {
            IconButton(onClick = { onPicSelected(rowPicIDs.a) }) {
                ImageChoose(imageID = rowPicIDs.a)
            }
            IconButton(onClick = { onPicSelected(rowPicIDs.b) }) {
                ImageChoose(imageID = rowPicIDs.b)
            }
            IconButton(onClick = { onPicSelected(rowPicIDs.c) }) {
                ImageChoose(imageID = rowPicIDs.c)
            }
            IconButton(onClick = { onPicSelected(rowPicIDs.d) }) {
                ImageChoose(imageID = rowPicIDs.d)
            }
        }
    }
}

@Preview
@Composable
fun PreviewGachaResultImages() {
    val rowPicIDs = RowPicIDs(0, 1, 3, 4)
    GachaResultView(rowPicIDs) { _: Int -> }
}
