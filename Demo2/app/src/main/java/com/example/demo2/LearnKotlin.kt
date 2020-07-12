package com.example.demo2

import kotlin.math.max

fun main(){
    for (i in 0 until 10 step 2){
     println(i)
    }
}

fun largerNumber (num1: Int,num2: Int ) = max(num1, num2)

fun getScore ( name : String)=when(name){
    "Tom" -> 86
    "Jim" -> 77
    "Jake" ->95
    else ->0
}

fun checkNumber( num : Number){
    when (num){
        is Int -> println("number is int")
        is Double -> println("number is double")
        else -> println("number not support")
    }
}