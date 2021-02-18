package com.example.part2_kotlin

/*
Write a program to create mutable map. print all the value and key of map.
*/

class question7 {
    val amap = mutableMapOf(Pair("1 "," Section A"), Pair("2 "," Section B"),Pair("3 "," Section C"),Pair("4 "," Section D"))

    fun printMap(){
        println(amap.entries)
        println("-----------------------------------------------------------------------------------")
    }
}