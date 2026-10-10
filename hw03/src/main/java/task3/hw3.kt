package com.example.hw03.task3
fun testNullSafety(studentName: String?) {
    println("Length: ${studentName?.length}")
    println("Name: ${studentName ?: "Unknown"}")
    studentName?.let {
        println("Hello, $it!")
    }
}
fun main() {
    println("// with studentName = null")
    var studentName: String? = null
    testNullSafety(studentName)

    println()

    println("// with studentName = \"Ayu\"")
    studentName = "Ayu"
    testNullSafety(studentName)
}