package com.example.kl_hd_02_happybirthday.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kl_hd_02_happybirthday.R
import com.example.kl_hd_02_happybirthday.databinding.ActivityImageBinding

private lateinit var binding: ActivityImageBinding
class ActivityImage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityImageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        khoiChay()
    }

    private fun khoiChay() {
        binding.radPic1.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                binding.img.setImageResource(R.drawable.img1)
            }
        }
        binding.radPic2.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                binding.img.setImageResource(R.drawable.img2)
            }
        }
        binding.btnExit.setOnClickListener {
            Toast.makeText(this, "Ban da thoat", Toast.LENGTH_LONG).show()
            finish()
        }
    }
}