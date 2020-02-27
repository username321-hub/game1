package com.example.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var player : Player2 = Player2(100,10)
    var zombie : Enemy = Enemy(60,10)
    var sword : orujka = orujka(10)
    var swordog : Orog = Orog(10)
    var ortype = 1
    var hod = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun button1(v:View){
        if(hod == 0){
        zombie.life = player.beat(zombie.life,swordog.damage)
        hod = 1
        HPview2.setText("${zombie.life}")
        }else{
            textView4.setText("Ты уже сделал движение!")
        }
    }
    fun button2(v:View){
        if(hod == 0) {
            player.zel()
            hod = 1
            HPview.setText("${player.HP}")
        }else{
            textView4.setText("Ты уже сделал движение!")
        }
    }
    fun button3(v:View){
        player.HP = zombie.Beat(player.HP)
        HPview.setText("${player.HP}")
        hod = 0
        textView4.setText("Твой ход!")
        if(zombie.life <=0){
            textView4.setText("Выйграл")
            player.zelkol = zombie.vipad( player.zelkol, player.lvl)
            player.XP = zombie.pobed(player.XP,player.lvl)
        }
        if(player.HP <= 0){
            textView4.setText("Проиграл")
        }
    }
}
