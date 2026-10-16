package com.example.hw04.task3

fun String.wordCount(): Int {
    if (this.isBlank()) return 0
    return this.trim().split("\\s+".toRegex()).size
}
fun Int.toRupiahString(): String {
    val reversedChars = this.toString().reversed()
    val formatted = reversedChars.chunked(3).joinToString(".")
    return "Rp ${formatted.reversed()}"
}
fun List<Int>.clampedAverage(min: Int, max: Int): Double {
    val filtered = this.filter { it in min..max }
    return if (filtered.isEmpty()) 0.0 else filtered.average()
}

fun main() {
    val text1 = "Mobile Application Development"
    val text2 = "Belajar bahasa Kotlin itu menyenangkan dan ringkas"
    val text3 = "Halo"

    println("Word count text 1: ${text1.wordCount()}")
    println("Word count text 2: ${text2.wordCount()}")
    println("Word count text 3: ${text3.wordCount()}")

    println()

    println(1000.toRupiahString())
    println(50000.toRupiahString())
    println(1000000.toRupiahString())

    println()

    val numbers = listOf(10, 50, 200, 85, -5)
    val avg = numbers.clampedAverage(0, 100)
    println("listOf(10, 50, 200, 85, -5).clampedAverage(0, 100) = $avg")
}