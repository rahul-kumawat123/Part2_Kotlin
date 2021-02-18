package com.example.part2_kotlin

/*
Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which
provide there specific details like rateofinterest etc,print details of every bank.
*/

open class bank {
    open fun getDetails(){
        var roi = 4
        var employeescount = 100000
        var location = "India"
        println("rate of Interest: "+roi+ ", Employees Count: "+employeescount+", Location: "+location)
    }
}

class SBI:bank(){
    override fun getDetails() {
        var roi = 5
        var employeescount = 30000
        var location = "Mumbai"
        println("rate of Interest: "+roi+ ", Employees Count: "+employeescount+", Location: "+location)
    }
}

class BOI:bank(){
    override fun getDetails() {

        var roi = 8
        var employeescount = 10000
        var location = "Delhi"
        println("rate of Interest: "+roi+ ", Employees Count: "+employeescount+", Location: "+location)

    }
}

class ICICI:bank(){
    override fun getDetails() {

        var roi = 6
        var employeescount = 25000
        var location = "Mumbai"
        println("rate of Interest: "+roi+ ", Employees Count: "+employeescount+", Location: "+location)
    }
}

class question3() {
    fun showdetails() {
        val b = bank()
        b.getDetails()
        val sbi = SBI()
        sbi.getDetails()
        val boi = BOI()
        boi.getDetails()
        val icici = ICICI()
        icici.getDetails()
        println("----------------------------------------------------------------------------------")
    }
}