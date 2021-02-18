package com.example.part2_kotlin

/*
        Write a single program for following operation using overloading
                A) Adding 2 integer number
                B) Adding 2 double
                D) multiplying 2 int
                E) concate 2 string
                F) Concate 3 String
        */

class question2 {
    fun add(i1: Int , i2: Int):Int{
        return i1+i2
    }

    fun add(d1: Double, d2: Double):Double{
        return d1+d2
    }

    fun mul(m1: Int, m2: Int):Int{
        return m1*m2
    }

    fun concatstring(str1: String , str2: String):String{
        return "$str1 $str2"
    }

    fun concatstring(str1: String, str2: String, str3: String):String{
        return "$str1 $str2 $str3"
    }

    fun overloading(){
        println("Sum of two integer numbers '2' , '7' is:  "+add(2,7))
        println("Sum of two double numbers '3.4' , '6.6' is: "+add(3.4,6.6))
        println("Multiplication of two integer numbers '4' , '5' is: "+mul(4,5))
        println("Concatinating two strings: "+concatstring("hey", "programmer"))
        println("Concatinating three strings: "+concatstring("Welcome", "Back", "Rahul"))
        println("----------------------------------------------------------------------------------")
    }
}

