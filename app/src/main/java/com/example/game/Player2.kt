package com.example.game

class Player2 (HP:Int, damag: Int){
    var HP = 100
    var lvl : Int = 1
    var XP = 0
    var damag = 10*lvl
    var zelkol = 3
    var rasst = 0
    var inf1 = " "
    fun beat(HPvr : Int, Damagor: Int): Int{
        var hpvr = HPvr
        hpvr -= damag + Damagor
        return hpvr
    }
    fun zel(){
        if(zelkol > 0){
            HP+=20
            zelkol-=1
            println(HP)
        }
        if(zelkol <= 0 ){
            inf1 = "Нету зелья!"
        }
    }
    fun lvl_Edit(ZHP: Int){
        if((XP >= lvl*20)&&( ZHP >0)){
            lvl+=1
        }
    }
}