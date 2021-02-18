package com.example.part2_kotlin

/* Write a program to create mutable list of Integer. replace the second item in the list with new value. Print the list value.*/

class question6 {
    val alist = mutableListOf<Int>(1,23,4,443)
    fun change(){
        println("----------------------------------------------------------------------------------")
        for(i in alist.indices){
            if(i == 1){
                alist[i] = 2
            }
        }
        println(alist)
        println("-----------------------------------------------------------------------------------")
    }
}