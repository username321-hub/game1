package com.example.game

class Enemy(life : Int, Damage : Int) {
    var life = 100
    var EnDamage = 10
    fun Beat(plhp: Int): Int {
        var PLHP = plhp
        if (life > 0) {
            PLHP -= EnDamage
        }
        return PLHP
    }


    fun vipad (Plzel : Int,PLlvl : Int  ):Int{
        var plzel = Plzel

        if(PLlvl < 4){
        plzel +=1
}
        return plzel
    }
    fun pobed (PlXP : Int, PLlvl : Int): Int {
        var plxp = PlXP
        if(PLlvl < 4){
            plxp +=7
        }
        if(PLlvl <7){
            plxp +=5
        }else{
            plxp +=3
        }
        return plxp
    }
}