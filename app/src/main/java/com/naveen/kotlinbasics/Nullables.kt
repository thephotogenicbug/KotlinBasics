package com.naveen.kotlinbasics

fun main(){

//    var name :String = "Naveen"
//    name = null -> Compilation Error
    var nullableName : String? = "Naveen"
//    nullableName = null

//    var len = name.length

    // new method to check if a variable is null
    var len2 = nullableName?.length
//    println(nullableName?.lowercase())
    // Safe call operator with let ( only if a value is present execute something)
    nullableName?.let{ println(it.length)}

    // If nullableName is empty then use default value "Guest" using elvis operator
//    otherwise use the value from nullableName
//    ?:  Elvis operator
    val name = nullableName ?: "Guest"
//    println("name is $name")
   // force lowercase
   println(nullableName!!.lowercase())

    // You can perform a chain safe calls:
//    val wifesAge: String? = user?.wife?.age ?: 0

    // old method to check if a variable is null
//    if(nullableName != null){
//        var len2 = nullableName.length
//    }else{
//        null
//    }
//


}