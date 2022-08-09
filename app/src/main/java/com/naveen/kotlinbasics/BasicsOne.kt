package com.naveen.kotlinbasics

/*

Advantages of functions are :
Reuse of code

 */

fun main(){
      // call my function
     // myFunction()
    // argument
    var result =  addUp(5, 8)
    print("result is $result")
    var avgResult = avg(5.3, 13.37)
    println("AvgResult is $avgResult")

}


fun avg(a: Double, b: Double) : Double{
    return (a+b)/2
}

// Method - a Method is a Function within a class
// Parameter (input)
fun addUp(a: Int, b:Int) : Int{
    // output
    return a+b
}

fun myFunction(){
    print("Called from myFunction")
}