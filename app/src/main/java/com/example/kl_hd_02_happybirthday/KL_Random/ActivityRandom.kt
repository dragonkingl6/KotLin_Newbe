package com.example.kl_hd_02_happybirthday.KL_Random

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.kl_hd_02_happybirthday.R
import kotlin.IllegalArgumentException

class ActivityRandom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        val rollButton: Button= findViewById(R.id.btn)
        rollButton.setOnClickListener {
            rollDice()
        }
    }



//    private fun rollDice() {
//        val (dice1, dice2, dice3) = List(3){Dice(6)}
//        val diceRolls = listOf(dice1.roll(), dice2.roll(), dice3.roll())
//        val diceImgs = listOf(
//            findViewById<ImageView>(R.id.imgDice1),
//            findViewById<ImageView>(R.id.imgDice2),
//            findViewById<ImageView>(R.id.imgDice3)
//        )
//        val diceText = listOf(
//            findViewById<TextView>(R.id.diemDice1),
//            findViewById<TextView>(R.id.diemDice2),
//            findViewById<TextView>(R.id.diemDice3)
//        )
//        for(i in diceRolls.indices){
//            val diceRoll= diceRolls[i]
//            val diceImg= diceImgs[i]
//            val ganAnh= when(diceRoll){
//                1-> R.drawable.dice_1
//                2-> R.drawable.dice_2
//                3-> R.drawable.dice_3
//                4-> R.drawable.dice_4
//                5-> R.drawable.dice_5
//                6-> R.drawable.dice_6
//
//                else -> throw IllegalArgumentException ("Loi")
//            }
//            diceImg.setImageResource(ganAnh)
//        }
//        diceText[0].text=diceRolls[0].toString()
//        diceText[1].text=diceRolls[1].toString()
//        diceText[2].text=diceRolls[2].toString()
//        val diceKQ: TextView= findViewById(R.id.txtDiemDice)
//        val diceTong: TextView= findViewById(R.id.txtTong)
//        val txtTong = diceRolls.sum()
//        if(txtTong in 3..10){
//            diceKQ.text="Xiu"
//        }
//        if(txtTong in 11.. 18){
//            diceKQ.text="Tai"
//        }
//        diceTong.text=(txtTong).toString()
//    }
//    class Dice(val numberSide: Int){ fun roll()= (1..numberSide).random()}
    private fun rollDice(){
        val (dice1, dice2, dice3)= List(3){Dice(6)}
    val diceRolls= listOf(
        dice1.Roll(),
        dice2.Roll(),
        dice3.Roll()
    )
    val diceImgs= listOf(
        findViewById<ImageView>(R.id.imgDice1),
        findViewById<ImageView>(R.id.imgDice2),
        findViewById<ImageView>(R.id.imgDice3)
    )
    val diceText= listOf(
        findViewById<TextView>(R.id.diemDice1),
        findViewById<TextView>(R.id.diemDice2),
        findViewById<TextView>(R.id.diemDice3)
    )
    for (i in diceRolls.indices){
        val diceRoll= diceRolls[i]
        val diceImg= diceImgs[i]
        val ganAnh= when(diceRoll){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else-> throw IllegalArgumentException("Loi")
        }
        diceImg.setImageResource(ganAnh)
    }
    diceText[0].text=diceRolls[0].toString()
    diceText[1].text=diceRolls[1].toString()
    diceText[2].text=diceRolls[2].toString()
    val kq: TextView= findViewById(R.id.txtDiemDice)
    val tong:TextView= findViewById(R.id.txtTong)
    val tongDice= diceRolls.sum()
    if(tongDice in 3..10){
        kq.text="Xiu"
    }else if(tongDice in 11..18){
        kq.text="Tai"
    }
    tong.text=(tongDice).toString()
    }
    class Dice(val numberDice: Int){fun Roll()=(1..numberDice).random()}

}





