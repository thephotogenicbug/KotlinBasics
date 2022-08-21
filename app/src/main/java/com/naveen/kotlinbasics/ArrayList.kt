package com.naveen.kotlinbasics

// Why should you use ArrayList ?
 /*
 ! ArrayList are used to create a dynamic array. which Means the size of an ArrayList can be
 Increased or decreased according to your requirement.
 ! The ArrayList class provides both read and write functionalities.
 ! The ArrayList follows the sequence of insertion order.
 ! An ArrayList is non synchronized and it may contain duplicate elements.
  */

// Constructor of ArrayList
//ArrayList<E>() : is used to create an empty ArrayList
//ArrayList(capacity:Int) : is used to create an ArrayList of specified capacity
//ArrayList(elements:Collection<E>) : is used to create an ArrayList filled with the elements of a collection

// Functions of ArrayList
//open fun add(element:E): Boolean -> used to add the specific element into the collection
//open fun clear() -> used to remove all elements from the collection
//open fun get(index:Int): E -> used to return the element at specified index in the list
//open fun remove(element:E): Boolean -> used to remove a single instance of the specific element from
                                        // current collection, if it is available

// Empty ArrayList Example
fun main(){
    val arrayList = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    println("...... print ArrayList $arrayList")
//     Call the second function in main function
    mainTwo()
//    mainThree()
}


// ArrayList using collections
fun mainTwo(){
    val arrayListCollection : ArrayList<String> = ArrayList<String>(5)
    val list : MutableList<String> = mutableListOf<String>()
    list.add("One")
    list.add("Two")
    arrayListCollection.addAll(list)

    val itr = arrayListCollection.iterator()
    while(itr.hasNext()){
        println(itr.next())
    }
    println("Size of arrayList collection" +arrayListCollection.size)


    println("..... print ArrayList collection $arrayListCollection")
}

// ArrayList - get()
// TODO("Not yet implemented")
fun mainThree(args:ArrayList<String>){
    val arrayList : ArrayList<String> = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    for(i in arrayList){
        println(i)
    }
    println("Array List" +arrayList.get(1))
    println(arrayList.get(1))
}