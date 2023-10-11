package com.example.kl_hd_02_happybirthday.TinhTien

import android.icu.text.NumberFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kl_hd_02_happybirthday.R
import com.example.kl_hd_02_happybirthday.databinding.ActivityMainBinding
import com.example.kl_hd_02_happybirthday.databinding.ActivityTinhTienBinding
import java.lang.IllegalArgumentException
import kotlin.math.ceil

class ActivityTinhTien : AppCompatActivity() {

    lateinit var binding: ActivityTinhTienBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTinhTienBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener { Tip() }
    }
    private fun Tip(){
        val soTien= binding.costOfService1.text.toString()
        val gia = soTien.toDoubleOrNull()
        if (gia == null) {
            binding.tipResult.text = ""
            return
        }
        val selectGia= binding.tipOptions.checkedRadioButtonId
        val selectRadio= when(selectGia){
            R.id.option_twenty_percent-> 0.20
            R.id.option_eighteen_percent -> 0.18
            R.id.option_fifteen_percent -> 0.15
            else -> throw IllegalArgumentException("Loi")
        }
        var tip = selectRadio * gia
        val roundUp= binding.roundUpSwitch.isChecked
        if(roundUp){
            tip = kotlin.math.ceil(tip)
        }
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text= getString(R.string.tip_amount, formattedTip)


    }
}