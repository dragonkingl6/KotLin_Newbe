package com.example.kl_hd_02_happybirthday.KL_Random

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.kl_hd_02_happybirthday.R

class ActivityRandom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        val rollButton: Button= findViewById(R.id.btnRoll)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice1 = Dice1(6)
        val dice2 = Dice2(6)
        val dice3= Dice3(6)
        val diceRoll1 = dice1.roll()
        val diceRoll2 = dice2.roll()
        val diceRoll3 = dice3.roll()
        val resultTextView1: TextView = findViewById(R.id.number1)
        val resultTextView2: TextView = findViewById(R.id.number2)
        val resultTextView3: TextView = findViewById(R.id.number3)
        resultTextView1.text = diceRoll1.toString()
        resultTextView2.text = diceRoll2.toString()
        resultTextView3.text = diceRoll3.toString()
        val txtTong= diceRoll1+diceRoll2+diceRoll3
        if(txtTong in 3..10){
            val txtKq :TextView = findViewById(R.id.kq)
            val txtDiem :TextView = findViewById(R.id.txtTong)
            txtKq.text="Xỉu"
            txtDiem.text= txtTong.toString()
        }else if(txtTong in 11..18){
            val txtKq :TextView = findViewById(R.id.kq)
            val txtDiem :TextView = findViewById(R.id.txtTong)
            txtKq.text="Tài"
            txtDiem.text= (txtTong).toString()
        }
    }

    class Dice1(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
    class Dice2(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
    class Dice3(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}

//class ActivityRandom : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_random)
//
//        val rollButton: Button = findViewById(R.id.btnRoll)
//        val resultTextViews = listOf<TextView>(findViewById(R.id.number1), findViewById(R.id.number2), findViewById(R.id.number3))
//        val txtKq: TextView = findViewById(R.id.kq)
//        val txtDiem: TextView = findViewById(R.id.txtTong)
//
//        rollButton.setOnClickListener {
//            val diceRolls = List(3) { Dice(6).roll() }
//            resultTextViews.forEachIndexed { index, textView -> textView.text = diceRolls[index].toString() }
//
//            val txtTong = diceRolls.sum()
//            txtDiem.text = txtTong.toString()
//            txtKq.text = if (txtTong in 3..10) "Xỉu" else "Tài"
//        }
//    }
//
//    class Dice(val numSides: Int) {
//        fun roll(): Int = (1..numSides).random()
//    }
//}
//Điều này rút ngắn mã bằng cách sử dụng List để lưu trữ các TextView và duyệt qua chúng, sử dụng forEachIndexed. Cũng đã kết hợp việc khai báo các biến và gán giá trị cho chúng thành một phần của việc khai báo ban đầu.





