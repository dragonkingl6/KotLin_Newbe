package com.example.kl_hd_02_happybirthday.View

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.kl_hd_02_happybirthday.R
import com.example.kl_hd_02_happybirthday.databinding.ActivityBtlistViewBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityBtlistViewBinding
class ActivityBTListView : AppCompatActivity() {
    var ds:MutableList<String> = mutableListOf("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBtlistViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //binding.lv.adapter= ArrayAdapter(this, android.R.layout.simple_list_item_1,ds)
        addEvent()
    }

    private fun addEvent() {
        hienThi()
    }

    private fun hienThi() {
        binding.btnSDT.setOnClickListener {
            luu()
        }

    }

    private fun luu() {
        var s:String= binding.edt.text.toString()
        ds.add(s)
        binding.edt.setText("")
        binding.edt.requestFocus()
        binding.lv1.adapter= ArrayAdapter(this, android.R.layout.simple_list_item_1,ds)
    }
}