package com.example.kotlinmod

fun main() {
// test2("Henry",  10)
//    println(newTest("Henry", 10))
//    println(catAge(20))
//    lambdaWithoutReturn(209)

//    trailingLambdaExample("The message", { str -> catAge(100) }, 7)

//    trailingLambdaExample("The message") {
//        print(it)
//        catAge(20)
//    }

//    val aMap = mutableMapOf("Up" to 1, "Down" to 2)
//    if (4 in aMap.values)
//        print("Yes!")

    val thisobj = TestObject
}

// normal function with braces
fun test(name: String, age: Int) {
    println("$name $age")
}
fun returnTest(string: String): Int {
    return 23
}

object TestObject {
     var loadState: String = "first string"

    fun thisFunction() {

    }
}



// normal function
fun test2(name: String, age: Int) =
    println("$name $age")

// lambda
// A lambda is basically a function without a name
val newTest: (String, Int) -> String = {a, b -> "$a $b"}

// another lambda example
val catAge: (Int) -> Int = {a -> a * 7}

// for lambdas with one parameter, the keyword 'it' can be
// substituted as our object's variable name,
val carAge2: (Int) -> Int = { it * 7}

// for lambdas that should not be returning anything use Unit (similar to void)
val lambdaWithoutReturn : (Int) -> Unit = {println("This string printed $it!")}

// Trailing lambdas:
// This a unique feature in kotlin, when the last parameter of a function is a function
// we can call / run that function inside a curly brace without calling it inside it's alloted slot

fun trailingLambdaExample (message: String, function: (String) -> Int) { // the function parameter takes a String return an Int
    println("$message ${function("String")}")

    // The trailingLambdaExample can be called like so:

    // As it should be
//    trailingLambdaExample("The message", {
//        print(it)
//        catAge(20)
//    })

    // As kotlin recommends: moving it outside the alloted slot if the function is the last parameter
//    trailingLambdaExample("The message")  {
//        print(it)
//        catAge(20)
//    }
}