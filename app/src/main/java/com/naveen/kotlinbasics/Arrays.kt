package com.naveen.kotlinbasics

fun main(){

    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1,2,3,true,false,"String")
    println(anyTypes.size)
//    println(months[1])

//    Loop
    for(month in months){
        println(month)
    }

//     convert months to MutableList to add new items in it
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
//    combine them
    additionalMonths.addAll(newMonths)
    additionalMonths.add("July")
    println(additionalMonths)

//    create MutableList with particular type
    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
//    override items in a given list
    days[2] = "Sunday"
//    remove a given item
    days.removeAt(3)
//     remove all
//     pass the filter u want to remove
    val removeList = mutableListOf<String>("Mon", "Wed")
//    days.removeAll(removeList)
    days.removeAll(days)
    println(days)
}