package com.example.kl_hd_02_happybirthday.Math

fun main(args: Array<String>) {
    println("Moi bo nhap so A:")
    var soA:Double= readLine()!!.toDouble()
    println("Moi bo nhap so B:")
    var soB:Double= readLine()!!.toDouble()
    var S=soA*soB
    var P=(soA+soB)/2
    println("S: $S, P: $P")

}