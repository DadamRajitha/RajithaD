//Arthematic operations
fun main() {
     val num1 = 10
     val num2 = 15
    //addition
    val sum = num1 + num2
    println("sum of num $num1 and $num2 is: $sum")

    //subtraction
    val difference = num1 - num2
    println("difference of num $num1 and $num2 is: $difference")

    //multiplication
    val product = num1 * num2
    println("product of  num $num1 and $num2 is: $product")

    // division 
    val quotient =num1.toDouble() / num2.toDouble()
    println("quotient of $num1 and $num2 is: $quotient")
//modulus
val modulus = num1 % num2
println("modulus of $num1 and  $num2 is: $modulus") 

}

//variables and constants

fun main() {
    // Mutable variable (can be reassigned)
    var myVariable: Int = 10
    println("Initial value of myVariable: $myVariable")
    
    // Reassigning the mutable variable
    myVariable = 20
    println("Updated value of myVariable: $myVariable")
    
    // Immutable constant (cannot be reassigned)
    val myConstant: String = "Hello, Kotlin!"
    println("Value of myConstant: $myConstant")
    
    // Trying to reassign a constant will result in a compilation error
    // myConstant = "New Value" // Uncommenting this line will cause an error
    
    // Kotlin can infer types, so you can omit the type declaration
    val inferredConstant = 3.14
    println("Value of inferredConstant: $inferredConstant")
    
    // Kotlin also supports mutable lists and collections
    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(4)
    println("Mutable list: $mutableList")
}

//strings
fun main(){
    val name="rajitha"
    val greeting="gopi,$name!"
    println(greeting)
}

//Lists
fun main() {
    val numbers= listOf(1,2,3,4,5,)
    numbers[2]
}

//List
fun main() {
    // List
    val numbers = listOf(1, 2, 3, 4, 5)
    println("List elements:")
    for (number in numbers) {
        println(number)
    }
}

 // Array
 fun main() {
 val colors = arrayOf("Red", "Green", "Blue")
 println("Array elements:")
 for (color in colors) {
     println(color)
 }
}

//functions
fun main(){
    val result = addnumbers(3,5)
    println("Result of addition: $result")
}

fun addnumbers(a: Int, b: Int): Int {
    return a + b
}


//conditional statements

fun main(){
    val number = 10
    if(number > 0){
        println("number is positive")
    }else if(number < 0){
        println("number is negative")
    }else {
        println("number is zero")
    }
 }

 //loops
 fun main() {
    for (i in 1..5){
        println("count: $i")
    }
    var x = 5
    while (x > 0 ){
         println("current value of x: $x")
    x--
    }
 }

//classes and objects

class Car(var brand: String, val model: String){
    fun displayInfo(){
        println("Car: $brand $model")
    }
}

fun main() {
    val myCar = Car("BMW", "toyota")
    val anotherCar = Car("Honda", "civic")

    myCar.displayInfo()
    anotherCar.displayInfo()
}