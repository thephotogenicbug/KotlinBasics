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

    val isNotEqual = 5!=5
//    String Interpolation
    println("IsNotEqual is $isNotEqual")

    println("is5greater3 ${5>3}")
    println("is-5greater3 ${-5>3}")
    println("is5LowerEqual3 ${5<=3}")
    println("isGreaterEqual3 ${5>=3}")
    println("isGreaterEqual5 ${5>=5}")

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







}