package com.naveen.kotlinbasics

// What is Lambda Expression ?

/*
  ! Lambda Expression is a function which has no name.
  ! Lambda expression and anonymous functions are function literals ie functions
   that are not declared but passed immediately as an expression
   ! Lambda is defined with curly braces {} which takes variables as a parameter
   if any and a body of a function
   ! The body of a function is written after the variable if any followed by -> operator
   ! Syntax : {variable(s) -> body_of_lambda}
 */

/*
   Normal function : addition of two numbers
   ! we create a function addNumber() passing two arguments (a,b)
   addNumber(5,10) lets say passing the values are a=5 and b=10;

   fun addNumber(a:Int, b:Int){
     val add = a+b
     println(add)
   }

 */

/*
   Lambda Expression : addition of two numbers

   we will write the same example using a lambda expression
   val sum: (Int,Int) -> Int = {a:Int, b:Int -> a+b}
   println(su,(10,5)

//  Shorter way
    val sum = {a:Int,b:Int -> println(a+b) }
    sum(10,5)
 */