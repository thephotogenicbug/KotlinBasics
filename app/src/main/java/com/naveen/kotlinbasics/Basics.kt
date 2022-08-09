package com.naveen.kotlinbasics

fun main(){
    // var variable can be overwritten
    // var myName = "Naveen"
    // val variable can be set once and cannot be overwritten
    // immutable variable
    // TODO: Add New Functionality

    /*
      This is a multiline comment
     */
    // type string
    val myName = "Naveen"
    // type int 32 bit
    // type inference (finds out the type from context)
    var myAge = 25

    // Integer TYPES : Byte (8 bit), Short (16 bit),
    // Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt : Int = 123123123
    val myLong : Long = 39_812_309_487_120_300

    // Floating Point Number Types : Float (32 bit), Double (64 bit)
    val myFloat : Float = 13.27F
    val myDouble: Double = 3.14159265358979323846

    // Booleans he type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny = true
    isSunny = false

    // Characters
    val letterChar = "A"
    val digitChar = '$'

    // String
    val myStr = "Hello world"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

//    print("First Character " + lastCharInStr)
    // String Interpolation ( String Template )
//    print("First Character $lastCharInStr and the length of myStr is ${myStr.length}")

//    Arithmetic Operators (+, -, *, /, %)
    var result = 5+3
//    result *= 2
    result = 15%4
//    print(result)

//    Comparison Operators (==, !=, <, >, <=, >=)
      val isEqual = 5==3
    println("IsEqual is $isEqual")

    println("**************************")

    val isNotEqual = 5!=5
//    String Interpolation
    println("IsNotEqual is $isNotEqual")

    println("**************************")

    println("is5greater3 ${5>3}")
    println("is-5greater3 ${-5>3}")
    println("is5LowerEqual3 ${5<=3}")
    println("isGreaterEqual3 ${5>=3}")
    println("isGreaterEqual5 ${5>=5}")

    println("**************************")
//    Assignment Operator (+=, -=, *=, /=, %=)

      var myNum = 5
      myNum +=3
      println("MyNum is ${myNum}")

     myNum *= 4
    println("MyNum is $myNum")

    // Increment & Decrement operators (++, -- )
     myNum++
    println("MyNum Increment is $myNum")
//     Increase +1 after execution
    println("MyNum Increment is ${myNum++}")
//     Increase +1 before execution
    println("MyNum Increment is ${++myNum}")
    //     Decrease -1 before execution
    println("MyNum Decrease by ${--myNum}")

    println("**************************")

    // If Statement
    var heightPerson1 = 170
    var heightPerson2 = 159

    if(heightPerson1 > heightPerson2){
        println("use raw force")
    }else if(heightPerson1 == heightPerson2){
        println("use your power technique 1337")
    }else{
        println("use technique")
    }
    println("**************************")

   val age = 25

    if(age >= 30){
        println("your over 30")
    }
    println("**************************")

    if(age >= 21){
        println("now You may drink in the india")
    } else if(age >= 18){
        println("you may vote now")
    } else if(age >= 16){
        println("you may drive now")
    } else {
        print("Your too young")
    }
    println("**************************")

    when(age){
//        !in 0..20 ->  println("now You may drink in the india") if the person is less then 0 or older than 20 execute this code
        in 21..150 ->  println("now You may drink in the india")
        in 18..20 -> println("you may vote now")
         16,17 ->  println("you may drive now")
        else -> print("Your too young")
    }
    println("**************************")
//     Keyword called is
    // any type (use this to check any type)
    var x : Any = 13.37f
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is an Double")
        is String -> println("$x is an String")
        else -> println("$x is none of the above")
    }
    println("**************************")


//    if statement with string, and other datatypes

    var name = "Naveen"

    if(name == "Naveen"){
        println("Welcome home Naveen")
    } else {
        println("Who are you ?")
    }
    println("**************************")

    var isRainy = true
    if(isRainy)
        println("Its Rainy")

    println("**************************")


    // When Expression (Replacement of switch statement)
    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    println("**************************")

     // when expression using different approach using range of values
    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")

    }
    println("**************************")

    // While loop ( executes a block of code repeatedly as long as a given condition is true )
    var xx = 1
    while(xx <= 10){
        // code to be executed
        println("$xx")
        xx++
    }
    println("\n While loop is done")

    println("**************************")

    var descending = 100
    while(descending >= 0){
        // code to be executed
        println("$descending")
        descending -= 2
    }
    println("\n While loop is done")

    var Dowhile = 100
    while(Dowhile >= 0){
        // code to be executed
        println("$Dowhile")
        Dowhile -= 2
    }
    println("\n While loop is done")
    println("**************************")

    Dowhile = 1
    do{
         print("$Dowhile")
         Dowhile++
    }while  (Dowhile <= 10)
    println("\n Do While loop is done")
    println("**************************")


    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            println("$roomTemp")
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }
    println("**************************")
    for(num in 1..10){
        print("$num")
    }
    println("**************************")
    for(i in 1 until 10){
        print("$i")
    }

    println("**************************")
    for(i in 10 downTo 1){
        print("$i")
    }
    println("**************************")
    for(i in 10 downTo 1 step 2){
        print("$i")
    }
    println("**************************")
    // Break and continue
    for(i in 1 until 20){
        print("$i")
        if(i/2 == 5){
            break
        }
    }
    print("Done with the loop")
    println("**************************")
    for(i in 1 until 20){
        print("$i")
        if(i/2 == 5){
            continue
        }
    }
    print("Done with the loop")


}