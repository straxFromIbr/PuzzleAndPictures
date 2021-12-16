package com.example.puzzleandpictures.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.puzzleandpictures.repository.MainPictureIDs
import com.example.puzzleandpictures.repository.RowPicIDs

@Composable
fun MainPictureView(
    mainPictureIDs: MainPictureIDs,
    onPlaceSelected: (placeID: Int) -> Unit
) {
    Column {
        RowPicView(mainPictureIDs.row1, 0, onPlaceSelected)
        RowPicView(mainPictureIDs.row2, 4, onPlaceSelected)
        RowPicView(mainPictureIDs.row3, 8, onPlaceSelected)
        RowPicView(mainPictureIDs.row4, 12, onPlaceSelected)
    }
}


@Composable
fun RowPicView(
    rowPicIDs: RowPicIDs,
    rowID: Int,
    onPlaceSelected: (placeID: Int) -> Unit
) {
    Column {
        Row {
            IconButton(onClick = { onPlaceSelected(rowID + 0) }) {
                ImageChoose(imageID = rowPicIDs.a)
            }
            IconButton(onClick = { onPlaceSelected(rowID + 1) }) {
                ImageChoose(imageID = rowPicIDs.b)
            }
            IconButton(onClick = { onPlaceSelected(rowID + 2) }) {
                ImageChoose(imageID = rowPicIDs.c)
            }
            IconButton(onClick = { onPlaceSelected(rowID + 3) }) {
                ImageChoose(imageID = rowPicIDs.d)
            }
        }
    }
}



@Preview
@Composable
fun PreviewAllPicsView() {
    val row0 = RowPicIDs(0, 1, 2, 3)
    val row1 = RowPicIDs(4, 5, 6, 7)
    val row2 = RowPicIDs(8, 9, 10, 11)
    val row3 = RowPicIDs(12, 13, 14, 15)
    val allPicIDs = MainPictureIDs(row0, row1, row2, row3)
    MainPictureView(allPicIDs) { _: Int -> }
}


@Preview
@Composable
fun PreviewImage() {
    IconButton(onClick = { /*TODO*/ }) {

        ImageChoose(1)
    }

}
