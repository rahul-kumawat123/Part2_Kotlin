package com.example.part2_kotlin

/*
Write a function which take marks as an argument and return the the grade as follows:
        marks between 50 to 60 , return “Good”
        marks between 60 to 70, return “Very Good”
        marks between 70 to  80, return “Excellent”
        marks between  80 to 100, return “Rockstar”
        */

class question5 {
    fun checkmarks() {
        val m: Int = 76
        return when(m){
            in 50..60 -> println("Good")
            in 60..70 -> println("Very Good")
            in 70..80 -> println("Excellent")
            in 80..100 -> println("Rockstar")
            else -> println("Value is invalid ")
        }
    }
}