package com.example.game

class orice {
    var Timer1 = 3
    fun propusk(HOD: Int): Int {
        var hod = HOD
        Timer1 -= 1
        if (Timer1 < 0) {
            hod = 1
        }
        return hod
    }
}