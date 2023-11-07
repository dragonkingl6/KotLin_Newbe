package com.example.kl_hd_02_happybirthday.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.kl_hd_02_happybirthday.R
class ActivityListViewPro : AppCompatActivity() {
    lateinit var listViewNCAdapter: ListViewNCAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_pro)

        //khai bao danh sach item list
        //khai bao danh sach item list
        var list= mutableListOf<OutData>()
        list.add(OutData(R.drawable.img2, "okok", "okok"))

        listViewNCAdapter= ListViewNCAdapter(this, list)
        val vlPhim = findViewById<ListView>(R.id.lv1)
        vlPhim.adapter= listViewNCAdapter

        vlPhim.onItemClickListener= AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Ban da chon"+ list[position].title, Toast.LENGTH_LONG).show()
        }
    }
}