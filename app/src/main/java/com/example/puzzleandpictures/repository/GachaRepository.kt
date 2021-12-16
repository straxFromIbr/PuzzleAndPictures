package com.example.puzzleandpictures.repository


class GachaRepository {

    fun doGacha(): RowPicIDs {
        val range = (0..15)
        return RowPicIDs(range.random(), range.random(), range.random(), range.random())
    }

}