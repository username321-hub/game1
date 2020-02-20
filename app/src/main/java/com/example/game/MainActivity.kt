package com.example.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var player : Player2 = Player2(100,10)
    var zombie : Enemy = Enemy(60,10)
    var sword : orujka = orujka(10)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun button1(){
        zombie.life = player.beat(zombie.life,sword.damage)

    }
}
