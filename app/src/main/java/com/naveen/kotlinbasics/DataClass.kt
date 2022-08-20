package com.naveen.kotlinbasics

data class User(val id: Long, var name: String)

fun main(){
    val user = User(1, "Naveen")

//    val name = user.name
//    println(name)
    user.name = "Michael"
    val user1 = User(1, "Michael")

    println(user == user1)
    println("User Details :$user1")

    // copy object or
    // copy its content except the variable u want to change
    val updatedUser = user.copy(name = "Denis panjuta")
    println(user)
    println(updatedUser)

    // get updatedUser components
    println(updatedUser.component1()) // print id 1
    println(updatedUser.component2()) // prints Denis panjuta

    // constructor
    // get the id and name variable make dependent on updatedUser
    // its gonna take id and name from updatedUser and store it in a seperate variables
    val (id, name) = updatedUser
    println("id = $id, name=$name")
}