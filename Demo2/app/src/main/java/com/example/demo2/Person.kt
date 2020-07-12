package com.example.demo2

open class Person (val name:String ,val age :Int){
    fun eat(){
         println(name + " is eating. He is " + age + " years old.")
    }
}
fun main(){
    val p = Person("jack",19)
    p.eat()
}