package com.example.game

class Enemy(life : Int, Damage : Int){
    var life = 100
    var EnDamage = 10
    fun  Beat(plhp : Int): Int{
        var PLHP = plhp
        PLHP -= EnDamage
        return PLHP
    }
}