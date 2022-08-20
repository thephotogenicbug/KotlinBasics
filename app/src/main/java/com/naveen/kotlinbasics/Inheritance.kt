package com.naveen.kotlinbasics

// The class that inherits the features of another
// class is called the sub class or Child class or
// Derived class, and the class whose features are
// inherited is called the super class or parent class
// or Base class

// Vehicle should be open class otherwise
// i cant use inheritance here
// all classes in kotlin are final by default which means non inheritable
// we need to use open keyword to make a class inheritable

//// Super class, Parent class , Base class
//open class Vehicle{
////     properties
////    methods
//}

// Sub class, Child , Derived class of Vehicle
// Super class, Parent class , Base class of Vehicle
//open class Cars : Vehicle(){
//
//}


// interfaces are a feature which allow us to extend the functionality of classes
// Example our car class could extend the functionality of an interface tht has
// certain features

// skipped for now com back later and go through the video
interface Drivable{
    val maxSpeed : Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}


// Super class, Parent class , Base class of Vehicle
open class Cars(val name : String , val brand:String){
  open var range: Double = 0.0

    fun extendRange(amount:Double){
        if(amount > 0){
            range += amount
        }
    }
  open fun drive(distance:Double){
        println("Drove for $distance KM")
    }

}
// Sub class, Child , Derived class of Vehicle of the Cars class
class ElectricCar(name: String, brand: String, batterLife:Double) : Cars(name, brand){

     var chargerType = "Type1"
//    override range and drive in ECar
    override var range = batterLife * 6

    //     we have a drive function which we override from our parent class
    override fun drive (distance: Double){
        println("Drove for $distance KM on Electricity")
    }

//     and we have a drive function which we created inside of an inheritance which we created inside of
//     subClass
    fun drive(){
        println("Drove for $range KM on Electricity")
    }
}
// main function
// Any class inherits from the Any class
fun main(){
    var audiA3 = Cars("A3", "Audi")
    var teslaS = ElectricCar("S-Model", "Tesla", 85.0)
//     Any is a class in Kotline
//     Any is a open class the root of Kotlin class hierarchy every kotlin class has Any as a super class
//     thtz y u can alway use the method equals , hashCode, toString
    var obj : Any
     teslaS.extendRange(200.0)

    teslaS.chargerType ="Type2"
//     override result
    teslaS.drive()

//  Polymorphism is an ability to treat objects with similar traits in a common way
    audiA3.drive(200.0)
    teslaS.drive(200.0)
}
