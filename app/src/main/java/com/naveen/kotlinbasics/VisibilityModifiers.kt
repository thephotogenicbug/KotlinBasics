package com.naveen.kotlinbasics

// What is visibility modifier ?

/*
    ! Visibility modifiers are the keywords which are used to restrict the use of classes,
    interfaces,methods,and properties in kotlin.
    ! This modifiers are used at multiple places such as class header or method body.
    ! Visibility Modifiers are categorized into four different types:
    * public
    * private
    * protected
    * internal

    Public Modifier
    * A public modifier element is accessible from anywhere in the project
    * It is a default modifier in kotlin. if any class, interface etc are not specified with
    any access/visibility then that class, interface etc. is used in a public scope
    * All public declarations can be placed at the top of the file.
    * If a member of a class is not specified then it is by default public.

       //Syntax of public modifiers
        public class Example{

        }
        class Demo{

        }

        public fun hello()
        fun demo()
        public val x =5
        val y = 10

      Private Modifier
      * A private modifier allows the element to be accessible only within the block
      in which properties,fields,etc are declared.
      * The private modifier declaration does not allow access outside the scope.
      * A private package can be accessible within that specific file.

      Syntax for private Modifier
      private class Example{
        private val x = 1

      private doSomething(){
      }
       }
   * In above class Example, val x and function doSomething() are declared as private.
     The class "Example" is accessible from the same source file "val x" and "fun doSomething()"
     are accessible within Example class.

     Internal Modifier
     * The internal modifier is feature in Kotlin, which is not available in java.
     * The internal modifier makes the field visible only inside the module in which
     it is implemented.
     * All the fields are declared as internal which are accessible only inside the module
     in which they are implemented.

     Syntax Internal Modifier
     internal class Example{
      internal val x = 5

        internal fun getValue(){

        }
     }
     internal val y = 10

     open keyword
     * in kotlin all classes are final by default, so they cant be inherited by default
     * sideNote : in java its the opposite, there you have to make your class final explicitly
     * so to make a class inheritable to other classes you must mark it with the open keyword,
     else you get an error "type is final so cant be inherited"

     Protected modifier
     * A protected modifier with a class or an interface allows visibility to its class or
     subclass only.
     * A protected declaration when overriden in its subclass is also protected unless
     it is explicitly changed.
     * The protected modifiers cannot be declared at top level ( for package)

     Syntax of protected modifier
     open class Base{
      protected val i= 0
     }
     class Derived : Base(){
     fun getValue():Int {
      return i
     }
     }

 Overriding of protected types
 ope class Base {
   open protected val i = 5
   }
   class Another : Base(){
    fun getValue(): Int{
            return i
            }
     override val i = 10
     }
 */

