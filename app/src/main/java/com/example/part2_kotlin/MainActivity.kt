package com.example.part2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Write a program to print your Firstname,LastName & age using init block,companion object.
        */
        val q1 = question1()
        q1.initdetails()
        q1.companionDetails()

        /*
        Write a single program for following operation using overloading
                A) Adding 2 integer number
                B) Adding 2 double
                D) multiplying 2 int
                E) concate 2 string
                F) Concate 3 String
        */
        val q2 = question2()
        q2.overloading()

        /*
        Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which
        provide there specific details like rateofinterest etc,print details of every bank.
        */
        val q3 = question3()
        q3.showdetails()

        /*Create Kotlin classes having suitable attributes for Library management system.
        Use OOPs concepts in your design.Also try to use interfaces and abstract classes.*/
        val q4 = question4()
        q4.library()

        /*
            Write a function which take marks as an argument and return the the grade as follows:
            marks between 50 to 60 , return “Good”
            marks between 60 to 70, return “Very Good”
            marks between 70 to  80, return “Excellent”
            marks between  80 to 100, return “Rockstar”
         */
        val q5 = question5()
        q5.checkmarks()

        /*
        Write a program to create mutable list of Integer. replace the second item in the list with new value. Print the list value.
        */
        val q6 = question6()
        q6.change()

        /*
        Write a program to create mutable map. print all the value and key of map.
        */
        val q7 = question7()
        q7.printMap()

        /*
        Write a program to create HasSet. print all the value.
        */
        val q8 = question8()
        q8.hsetprint()
    }
}