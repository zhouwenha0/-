package com.example.demo2

class Student(name: String ,age:Int) : Person(name,age),Study {
     override fun readBooks(){
        println(name + " is reading")
    }
}

fun main(){
    val student = Student("Jack" ,19)
    doStudy(student)
}

fun doStudy(study: Study){
    study.readBooks()
    study.doHomework()
}