package com.naveen.kotlinbasics

// Nested class and inner class
/*
    a class which is created inside another and a class which is created inside another
    with keyword inner

    Nested class
    * Nested class is such class which is created inside another class.
    * In kotlin a nested class is default static, so its data members and member
    functions can be accessed without creating an object of the class
    * Nested classes cannot access the data memebers of outer class.

    Syntax of nested class
    class OuterClass{
      // outer class code

      class NestedClass{
        // nested class code
      }
    }

    Nested class Example

    class OuterClass{
     private var name:String = "Mr X"
     class NestedClass{
      var description : String = "code inside nested class"
      private var id:Int = 101
      fun foo(){
         print("name is ${name}") // cannot access the private outer class member
         println("Id is ${id}")
      }
     }
    }

    fun main(args:Array<String>){
               // nested class must be initialized
       println(OuterClass.NestedClass().description) // accessing property

       var obj = OuterClass.NestedClass() // object creation
       obj.foo() // access member function
    }
    Output:code inside nested class
           name is Mr X
           Id is 101

     Inner class
     * An inner class is a class which is created inside another class with keyword inner.
     * In other words we can say that a nested class which is marked as "inner" is called inner class.
     * Inner class cannot be declared inside interfaces or non-inner nested classes.
     * The advantage of inner class over nested class is that, it is able to access members of
     its outer class even it is private.

     Syntax of inner class
     class OuterClass{
       // outer class code

       inner class InnerClass{
//         inner class code
       }
     }

     Inner class example

     class OuterClass{
     private var name:String = "Mr X"
     inner class InnerClass{
      var description : String = "code inside inner class"
      private var id:Int = 101
      fun foo(){
         print("name is ${name}") // cannot access the private outer class member
         println("Id is ${id}")
      }
     }
    }

     fun main(args:Array<String>){
               // inner class must be initialized
       println(OuterClass.InnerClass().description) // accessing property

       var obj = OuterClass.InnerClass() // object creation
       obj.foo() // access member function
    }
    Output:code inside inner class
           name is Mr X
           Id is 101
 */