package com.naveen.kotlinbasics

fun main(){
    val stringList : List<String> = listOf(
         "Denis", "Frank", "Naveen", "Garry")
    val mixedTypeList : List<Any> = listOf(
        "Denis", 31, 5, "BDay", 70.5, "weighs", "Kg")

    for(value in mixedTypeList){
        if(value is Int){
            println("Integer :'$value'")
        } else if (value is Double){
            println("Double : '$value' with Floor value ${Math.floor(value)}")
        } else if(value is String){
            println("String : '$value' of lenght ${value.length}")
        } else {
            println("Unknown Type")
        }
    }
}

// Skip alternate way for now and get back later