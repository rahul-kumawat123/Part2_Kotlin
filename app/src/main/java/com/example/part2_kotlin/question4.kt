package com.example.part2_kotlin

/*
Create Kotlin classes having suitable attributes for Library management system.
Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
 */

open class lib(){
    val b1 = "Book1"
    val b2 = "Book2"
    val b3 = "Book3"
    val b4 = "Book4"
    val b5 = "Book5"
    val b6 = "Book6"

    open fun booksAvailable(){
        println("These books are availabe ${b1}, ${b2}, ${b4}, ${b5}")
    }

    open fun booksUnavailable(){
        println("These books are unavailable ${b3}, ${b6}")
    }
}

abstract class books{
    abstract fun addBooks()
}

interface report{
    fun checkExpenditure()
}

class A: lib(), report {
    override fun booksUnavailable() {
        super.booksUnavailable()
    }

    override fun booksAvailable() {
        super.booksAvailable()
    }

    override fun checkExpenditure() {
       println("Expense of two books is ${1000}")
    }
}

class B:books(){
    val b7 = "Book7"
    val b8 = "Book8"
    override fun addBooks() {
        println("Books added are ${b7},${b8}")
    }
}

class question4{
    fun library(){
        val a = A()
        a.booksAvailable()
        a.booksUnavailable()
        a.checkExpenditure()

        val b = B()
        b.addBooks()
        println("----------------------------------------------------------------------------------")
    }

}
