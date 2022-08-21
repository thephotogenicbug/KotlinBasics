package com.naveen.kotlinbasics

fun main(){

//    set is a type of collection that elemenates duplicate data
//    this collection is unordered which means the elements or not sorted

//     Duplicates or ignored
    val fruits = setOf("Orange","Apple", "Grape", "Apple","Mango", "Orange")
    println(fruits.toSortedSet()) // toSortedSet Sorts list in alphabetical order

//    convert fruits into a mutable list to add new items
    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    println(newFruits)
    println(newFruits.elementAt(4))  // if u want to access any item in the list


//  Create a Map of or map list
//  (map is a type of collection tht holds data in a form of key value pairs)

//    MapOf daysOfTheWeek with key as a number and value as a string
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
//     gets the key value not the index
    println(daysOfTheWeek[2])

//     Loop daysOfTheWeek
    for(key in daysOfTheWeek.keys){
        println("$key is to ${daysOfTheWeek[key]}")
    }

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thu"
    newDaysOfWeek[5] = "Fri"
    newDaysOfWeek[6] = "Sat"

    println(newDaysOfWeek.toSortedMap()) // sorted by its key

//      mapOf Fruit Data Class with Key as a String and value as an object
     val fruitsMap = mapOf("Fav" to Fruit("Grape", 2.5),
         "Ok" to Fruit("Apple", 1.0))


}

// Create a fruit class
data class Fruit(val name:String, val price:Double)