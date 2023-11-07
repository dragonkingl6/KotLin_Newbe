package com.example.kl_hd_02_happybirthday.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kl_hd_02_happybirthday.R
import com.example.kl_hd_02_happybirthday.databinding.ActivityViewBindingBinding

private lateinit var binding: ActivityViewBindingBinding
class ActivityViewBinding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tinhThanh()
    }

    private fun tinhThanh() {
        binding.btnSoThich.setOnClickListener {
            xuLyChonTinhThanh()
        }
        binding.btnXacNhan.setOnClickListener {
            xuLyXacNhan()
        }
    }

    private fun xuLyXacNhan() {
        var s:String=""
        if(binding.rbNam.isChecked){
            s= binding.rbNam.text.toString()
        }else if(binding.rbNu.isChecked){
            s= binding.rbNu.text.toString()
        }
        if(s==""){
            Toast.makeText(this, "Ban chua chon gi", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this, "Ban da chon"+s, Toast.LENGTH_LONG).show()
        }
    }

    private fun xuLyChonTinhThanh() {
        var s:String= ""
        if(binding.chkHD.isChecked){
            s+= binding.chkHD.text.toString()+"\n"
        }
        if(binding.chkTH.isChecked){
            s+= binding.chkTH.text.toString()+"\n"
        }
        if(binding.chkHN.isChecked){
            s+= binding.chkHN.text.toString()+"\n"
        }
        if(binding.chkTP.isChecked){
            s+= binding.chkTP.text.toString()+"\n"
        }
        if(binding.chkTB.isChecked){
            s+= binding.chkTB.text.toString()+"\n"
        }
        if(binding.chkBN.isChecked){
            s+= binding.chkBN.text.toString()+"\n"

        }
        binding.edtSoThich.setText(s)
    }
}