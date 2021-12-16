package com.example.puzzleandpictures.view

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.puzzleandpictures.repository.MainPictureIDs
import com.example.puzzleandpictures.repository.RowPicIDs
import com.example.puzzleandpictures.viewmodel.MainViewModel

@Composable
fun MainView(mainViewModel: MainViewModel) {
    val mainPictureIDs: MainPictureIDs by mainViewModel.mainPictureIDs
    val gachaResultIDs: RowPicIDs by mainViewModel.gachaResultIDs

    val padding = 16.dp

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Row() {
            MainPictureView(
                mainPictureIDs,
                mainViewModel::onPlaceSelected
            )
        }
        Spacer(Modifier.size(padding))

        GachaResultView(
            rowPicIDs = gachaResultIDs,
            onPicSelected = mainViewModel::onPicSelected
        )

        Spacer(Modifier.size(padding))

        ShowButtons(
            onGachaTapped = mainViewModel::onGachaTapped,
            onClearTapped = mainViewModel::onClearTapped,
        )


    }
}