package com.example.hw05.task2

fun applyTwice(n: Int, operation: (Int) -> Int): Int {
    return operation(operation(n))
}

fun printIf(items: List<String>, condition: (String) -> Boolean) {
    items.filter(condition).forEach { println(it) }
}

fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> {
    return list.map(mapper)
}

fun main() {
    val doubleLambda = { x: Int -> x * 2 }
    println(applyTwice(3, doubleLambda)) // (3 * 2) * 2 = 12

    println()

    val courses = listOf("Algorithms", "Mobile Programming", "English", "Operating Systems", "UI Design")
    val startsWithVowel = { s: String ->
        s.isNotEmpty() && s.first().lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')
    }
    printIf(courses, startsWithVowel)

    println()

    val numbers = listOf(2, 3, 4)
    val squaredStrings = transform(numbers) { (it * it).toString() }
    println(squaredStrings)
}