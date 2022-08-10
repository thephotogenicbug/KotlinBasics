package com.naveen.kotlinbasics

import java.lang.IllegalArgumentException

fun main(){
    var myCar = Car()
    myCar.owner
   println("brand is : ${myCar.myBrand}")
    // we are setting the value here
    myCar.maxSpeed = 240
    // we are getting the value here
    println("maxspeed is ${myCar.maxSpeed}")
    println("Model is ${myCar.myModel}")
        // Private setter
//    myCar.myModel = "M3"
}

class Car(){
    // lateinit (i will initialize it later on)
  lateinit var owner : String

  val myBrand: String = "HONDA"
      // Custom getter
    get(){
        return field.lowercase()
    }

    var maxSpeed: Int = 250
        // default getter
//    get() = field
    set(value){
        field = if(value > 0) value else throw IllegalArgumentException("Maxspeed cannot be less than 0")
    }


    var myModel : String = "MS"
        // private (you can only change the model within the same class)
    private set

  init {
      this.myModel = "M5"
      this.owner = "Naveen"
  }
}