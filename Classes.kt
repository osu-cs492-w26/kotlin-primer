import java.io.File

class Student(val id: Int, val name: String, var gpa: Double)

class Rectangle(var width: Int, var height: Int) {
  val area get() = this.width * this.height

  fun print() {
    println("This is a ${this.width} x ${this.height} rectangle")
  }
}

class FileUser(val filename: String) {
  val fileContents: String
  init {
    val file = File(filename)
    fileContents = file.readText()
  }
  val fileContentsCopy = this.fileContents
  init {
    println("-- This is a second initializer block")
  }
}

fun main() {
  val s = Student(933111111, "Luke Skywalker", 3.75)
  println("GPA for ${s.name} (${s.id}): ${s.gpa}")

  val r = Rectangle(4, 8)
  println(r.area)
  r.width = 16
  println(r.area)
  r.print()

  val f = FileUser("Classes.kt")
  println("f.fileContents: ${f.fileContents}")
}
