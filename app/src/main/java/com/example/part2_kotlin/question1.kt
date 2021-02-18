package com.example.part2_kotlin

import com.example.part2_kotlin.name.Companion.age
import com.example.part2_kotlin.name.Companion.fname
import com.example.part2_kotlin.name.Companion.lname

/*
Write a program to print your Firstname,LastName & age using init block,companion object.
*/

class name(fname:String , lname: String, age:Int){
    init {
        println("DETAILS USING INIT")
        println("First Name is "+fname)
        println("Last Name is "+lname)
        println("Age is "+age)
    }

    companion object{
        var fname = "Yash"
        var lname = "Rathore"
        var age = 25
    }
}

class question1(){
    fun initdetails(){
        println("----------------------------------------------------------------------------------")
        var fn = "Rahul"
        var ln = "Kumawat"
        var a = 22
        val iname = name(fn, ln, a)
        println(iname)
    }
    fun companionDetails(){
        println("DETAILS USING COMPANION OPERATOR")
        println("First Name using companion operator is "+fname)
        println("Last Name  using companion operator is "+lname)
        println("Age using companion operator is "+age)
        println("----------------------------------------------------------------------------------")
    }
}