package com.example.puzzleandpictures.repository


class MainPictureRepository {
    //current_picの値は16個の配列
    //初期値として透明の画像に対応するidをcurrent_picに代入
    var current_pic = IntArray(16) { 16 }

    init {
//        println("initialize current_pic")
        Clear()
        //println(current_pic[3])
    }

    //すべてのメイン画像を透明に変更
    fun Clear() {
        current_pic = IntArray(16) { 16 }
    }

    //ガチャ画面で選択された画像のidを取得して、現在の盤面のどこに入力を行うのか実行する
    fun Place_Pic(selected_picture_id: Int, Place_id: Int): IntArray {
        current_pic[Place_id] = selected_picture_id
//        println(current_pic[Place_id])

        return current_pic
    }

    //現在の画像の配置状態を配列で表示
    fun show_current_pic() {
        println(current_pic.contentToString())
    }

    //すべてのタイルに画像がすべて埋まっている場合
    fun is_all_placed(): Boolean {
        //もしcurrent_picの中にまだ埋まっていない画像がある場合はtrueを返します
        return current_pic.contains(16)
    }
}
