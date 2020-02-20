package com.example.game

class luk(Damage:Int): orujka(Damage) {
    fun lukstrel(Rasst: Int, hpvr : Int ) {
        var HPvr = hpvr
        if (Rasst > 0){
            HPvr-=damage
        }
        else{
            println("не хватает расстояния чтобы выстрелить!")
        }
    }

}