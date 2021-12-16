package com.example.puzzleandpictures.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.puzzleandpictures.repository.GachaRepository
import com.example.puzzleandpictures.repository.MainPictureIDs
import com.example.puzzleandpictures.repository.MainPictureRepository
import com.example.puzzleandpictures.repository.RowPicIDs

class MainViewModel() : ViewModel() {
    // DIは実施していない
    private val mainPictureRepository: MainPictureRepository = MainPictureRepository()
    private val gachaRepository: GachaRepository = GachaRepository()

    // ガチャ画面
    /// 選択された写真ID
    private var selectedPicID: Int = 16
    private var isPicSelected = false

    /// ガチャ結果データ
    val gachaResultIDs: MutableState<RowPicIDs> = mutableStateOf(RowPicIDs())

    // 現在表示されてる画像
    val mainPictureIDs: MutableState<MainPictureIDs> = mutableStateOf(MainPictureIDs())


    fun onGachaTapped() {
        gachaResultIDs.value = gachaRepository.doGacha()
    }

    fun onPicSelected(imageID: Int) {
        selectedPicID = imageID
        isPicSelected = true
    }

    fun onPlaceSelected(placeID: Int) {
        if (isPicSelected) {
            val resultArray = mainPictureRepository.Place_Pic(selectedPicID, placeID)
            mainPictureIDs.value = convertArrayToAllPicIDs(resultArray)
            isPicSelected = false
        }
    }

    fun onClearTapped() {
        mainPictureRepository.Clear()
        mainPictureIDs.value = convertArrayToAllPicIDs(mainPictureRepository.current_pic)
    }

    private fun convertArrayToAllPicIDs(array16: IntArray): MainPictureIDs {
        val row0 = RowPicIDs(array16[0], array16[1], array16[2], array16[3])
        val row1 = RowPicIDs(array16[4], array16[5], array16[6], array16[7])
        val row2 = RowPicIDs(array16[8], array16[9], array16[10], array16[11])
        val row3 = RowPicIDs(array16[12], array16[13], array16[14], array16[15])
        return MainPictureIDs(row0, row1, row2, row3)
    }

}

