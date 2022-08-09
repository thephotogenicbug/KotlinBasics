package com.naveen.kotlinbasics

fun main(){
    // Object of a class / instance
   var denis =  Person("Naveen", "Kumar")
    // it will show John Doe as default value
    var john = Person2()
    // Print lastName
    var Doe = Person2(lastName = "Peterson")
}
// constructor allows us to add values to our objects
class Person (firstName: String, lastName: String){
    // class body
//    initializer will be called once the object is created
    // Initializer Block
    init {
        println("Person created")
        println("Initialized a new person object with firstName = $firstName and lastName = $lastName")
        println("********************")
    }



}

class Person2 (firstName: String = "John", lastName: String = "Doe"){
    // class body
//    initializer will be called once the object is created
    // Initializer Block
    init {
        println("Person2 created")
        println("Initialized a new person object with firstName = $firstName and lastName = $lastName")
    }

}