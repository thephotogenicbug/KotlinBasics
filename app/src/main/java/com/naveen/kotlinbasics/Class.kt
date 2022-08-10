package com.naveen.kotlinbasics

fun main(){
    // Object of a class / instance
   var denis =  Person("Naveen", "Kumar", 25)
//    denis.hobby = "To Skateboard"
//    denis.age = 32
//    println("Denis age is ${denis.age} old")
    denis.stateHobby()
    // it will show John Doe as default value
    var john = Person2()
    john.hobby = "Play video games"
//    john.stateHobby()
    // Print lastName
//    var Doe = Person2(lastName = "Peterson")
}
// constructor allows us to add values to our objects
class Person (firstName: String, lastName: String){

    // Member variables - Properties
    var age : Int? = null
    var hobby : String = "Watch netflix"
    var firstName : String? = null


    // class body
//    initializer will be called once the object is created
    // Initializer Block
    init {
        this.firstName = firstName
        println("Person created")
        println("Initialized a new person object with firstName = $firstName and lastName = $lastName")
        println("********************")
    }

    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age:Int):
            this(firstName, lastName){
                this.age = age
              println("Initialized a new person object with firstName = $firstName and lastName = $lastName and age $age")
              println("********************")
            }

    // Member functions - Methods
    fun stateHobby(){
        println("$firstName Hobby is $hobby")
    }


}

class Person2 (firstName: String = "John", lastName: String = "Doe"){
    // class body
//    initializer will be called once the object is created
    // Initializer Block
    var hobby : String = "Watch netflix"
    init {
        println("Person2 created")
        println("Initialized a new person object with firstName = $firstName and lastName = $lastName")
    }

    // Member functions - Methods
//    fun stateHobby(){
//        println("My Hobby is $hobby")
//    }

}