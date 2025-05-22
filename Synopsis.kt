// Kotlin Synopsis - All-in-One Reference File

// Entry point
fun main() {
    println("Hello, Kotlin!")
    val message = greet("World")
    println(message)

    val person = Person("Alice", 30)
    person.sayHello()

    val sum = add(5, 7)
    println("Sum: $sum")

    val nums = listOf(1, 2, 3)
    nums.forEach { println(it) }
}

// Variables
val constantValue = 10         // Immutable
var mutableValue = 20          // Mutable

// Basic Types
val anInt: Int = 100
val aDouble: Double = 3.14
val aChar: Char = 'A'
val aString: String = "Kotlin"
val aBoolean: Boolean = true

// String templates
val name = "John"
val greeting = "Hello, $name"

// Null safety
var nullableName: String? = null
nullableName?.let { println(it.length) }

// Functions
fun greet(name: String): String {
    return "Hello, $name"
}

fun add(a: Int, b: Int) = a + b

// Control Flow
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// Loops
fun loopDemo() {
    for (i in 1..5) println(i)         // 1 to 5
    for (i in 1 until 5) println(i)    // 1 to 4
    for (i in 5 downTo 1 step 2) println(i)

    var x = 0
    while (x < 5) {
        println(x)
        x++
    }
}

// Collections
val numbers = listOf(1, 2, 3)              // Immutable list
val mutableList = mutableListOf(1, 2, 3)   // Mutable list
val map = mapOf("a" to 1, "b" to 2)

// Classes
class Person(val name: String, var age: Int) {
    fun sayHello() {
        println("Hi, my name is $name and I'm $age years old.")
    }
}

// Data Class
data class User(val id: Int, val username: String)

// Object & Companion Object
object Singleton {
    val data = "I'm a singleton"
}

class Utils {
    companion object {
        fun staticLikeMethod() = "Called from companion object"
    }
}

// Inheritance
open class Animal(val name: String) {
    open fun speak() = "..."
}

class Dog(name: String) : Animal(name) {
    override fun speak() = "Woof"
}

// Interfaces
interface Clickable {
    fun click()
}

class Button : Clickable {
    override fun click() = println("Button clicked")
}

// Lambdas & Higher-Order Functions
fun operateOnNumbers(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

val result = operateOnNumbers(4, 5) { x, y -> x + y }

// Extension Functions
fun String.addSmile(): String = this + " :)"

// Sealed Classes
sealed class Result
data class Success(val data: String) : Result()
data class Error(val error: String) : Result()

// Exception Handling
fun riskyOperation() {
    try {
        val result = 10 / 0
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
    } finally {
        println("Cleanup")
    }
}
