package com.example.kl_hd_02_happybirthday.View

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.kl_hd_02_happybirthday.R
import com.example.kl_hd_02_happybirthday.databinding.ActivityListViewBinding

private lateinit var binding: ActivityListViewBinding
class ActivityListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mauXanh= Color.parseColor("#99ffff")// sau lam giao dien
        binding.lv1.setBackgroundColor(mauXanh)
        xuKien()

    }

    private fun xuKien() {
        hienThi()
    }

    private fun hienThi() {
       val arrQuocGia= resources.getStringArray(R.array.arrQuocGia)
        binding.lv1.adapter= ArrayAdapter(this, android.R.layout.simple_list_item_1, arrQuocGia)
        binding.lv1.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "ban da chon"+ arrQuocGia[position], Toast.LENGTH_SHORT).show()
        }
    }
}