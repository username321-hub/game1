package com.example.game

class orpois(Damage:Int):orujka(Damage) {
    var Timer=3
    fun poison (hpvr:Int){
        var HPvr = hpvr
        Timer-=1
        HPvr-=damage
    }
}