package com.example.game

class Enemy(life : Int, Damage : Int){
    var life = 100
    var Damage = 95
    fun  Beat(plhp : Int): Int{
        var PLHP = plhp
        PLHP -= Damage
        return PLHP
    }
}