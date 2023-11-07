package com.example.kl_hd_02_happybirthday.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.kl_hd_02_happybirthday.R

class ActivityView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        val soA= findViewById<EditText>(R.id.edtA)
        val soB= findViewById<EditText>(R.id.edtB)
        val kq= findViewById<EditText>(R.id.edtKQ)
        val cong= findViewById<Button>(R.id.btn1)
        val chia= findViewById<Button>(R.id.btn3)
        val nhan= findViewById<Button>(R.id.btn4)
        val nut2= findViewById<Button>(R.id.btn2)
        val btnNhanLau= findViewById<Button>(R.id.btn5)
        val thoat=findViewById<Button>(R.id.btn6)
        nut2.setOnClickListener {
            soA.setText("")
            soB.setText("")
            kq.setText("")
            Toast.makeText(this, "em da xoa r ",Toast.LENGTH_SHORT).show()
        }
        var chiaSeSuKien: View.OnClickListener? = null
        chiaSeSuKien= View.OnClickListener {
            if(it==cong){
                val a= soA.text.toString().toInt()
                val b= soB.text.toString().toInt()
                val k= a+b
                kq.setText(k.toString())
            }
            if(it==chia){
                val a= soA.text.toString().toInt()
                val b= soB.text.toString().toInt()
                val k= a*b
                kq.setText(k.toString())
            }
            if(it==nhan){
                val a= soA.text.toString().toInt()
                val b= soB.text.toString().toInt()
                val k= a/b
                kq.setText(k.toString())
            }
        }
        cong.setOnClickListener ( chiaSeSuKien )
        nhan.setOnClickListener ( chiaSeSuKien )
        chia.setOnClickListener ( chiaSeSuKien )
        var suKienNhanLau: View.OnLongClickListener? = null
        suKienNhanLau= View.OnLongClickListener {
            if(it==btnNhanLau){
                Toast.makeText(this, "Da xoa khi nahn du lau", Toast.LENGTH_SHORT).show()
                btnNhanLau.visibility= View.GONE
            }
            true
        }
        btnNhanLau.setOnLongClickListener(suKienNhanLau)
        thoat.setOnClickListener {
            Toast.makeText(this, "Da thoat",Toast.LENGTH_LONG).show()
            finish()
        }
    }

}