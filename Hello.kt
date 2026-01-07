


fun main() {
  println("Hello, world!")

  var a: Int = 16
  a *= 8

  var b = 128
  // b = 4.25
  var x: Double
  x = 4.toDouble()

  val pi = 3.14
  // pi = 3.1415

  var nonNull = "This string can't be null"
  // nonNull = null

  var nullable: String? = "This string is nullable"
  // nullable = null
  val l = nullable?.length ?: 0

  println(nonNull.length)
  println(l)

  // x?.y?.z

  val str = "The value of a is: $a"
  println(str)

  println("The value of a + b is: ${a + b}")

  val bigStr = str + nonNull
  println(bigStr)

  // === vs ==
  var str1 = "This is a string"
  var str2 = "This is a string"
  if (str1 == str2) {
    println("The strings are the same")
  } else {
    println("The strings are NOT the same")
  }

  val max = if (a > b) {
    println("a wins!")
    a
  } else {
    println("b wins!")
    b
  }
  println("max: $max")

  when (a > b) {
    true -> println("a is bigger")
    else -> println("b is bigger")
  }

  when {
    a > b -> println("a is bigger")
    a < b -> println("b is bigger")
    a == b -> println("They're equal")
  }

  val whatsUpWithA = when (a) {
    0, 1 -> "a is small"
    in 2..100 -> "a is a little bigger"
    else -> "a is much bigger"
  }
  println(whatsUpWithA)

  val donuts = listOf("glazed", "sugar", "buttermilk")
  // donuts.add("cream filled")
  println("donuts: $donuts")

  val mutableDonuts = mutableListOf("glazed", "sugar", "buttermilk")
  mutableDonuts.add("cream filled")
  println("mutableDonuts: $mutableDonuts")

  val donutsArray = arrayOf("glazed", "sugar", "buttermilk")
  println("donutsArray: $donutsArray")

  val squares = List(10) { it * it }
  println("squares: $squares")

  printGreeting("CS 492")
  printGreeting("CS 492", greeting = "What's up")
  printGreeting(greeting = "What's up", who = "world")

  println("2^8 = ${powerOf(2, 8)}")
  println("2*2 = ${timesTwo(2)}")
}

fun printGreeting (
  who: String,
  greeting: String = "Hello",
  punctuation: String = "!")
{
  println("$greeting, $who$punctuation")
}

fun powerOf(base: Int, exponent: Int): Int {
  var result = 1
  for (i in exponent downTo 1) result *= base
  return result
}

fun timesTwo(n: Int) = n * 2
