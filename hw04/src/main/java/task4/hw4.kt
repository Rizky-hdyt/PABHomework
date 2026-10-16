package com.example.hw04.task4

fun main() {
    val courses = mutableListOf("SIF101", "SIF202", "SIF303", "SIF202")
    courses.add("SIF404")
    courses.add("SIF505")
    courses.remove("SIF202")
    println("Final course list: $courses")

    val uniqueCourses = courses.toSet()
    println("Unique courses: $uniqueCourses")

    val creditMap = mapOf(
        "SIF101" to 3,
        "SIF202" to 4,
        "SIF303" to 3,
        "SIF404" to 3,
        "SIF505" to 2
    )

    val sif101Credits = creditMap.getOrDefault("SIF101", 0)
    val unknownCredits = creditMap.getOrDefault("SIF999", 0)
    println("Credits for SIF101: $sif101Credits")
    println("Credits for SIF999: $unknownCredits")

    val totalCourses = courses.size
    val totalCredits = courses.sumOf { creditMap.getOrDefault(it, 0) }
    println("Total enrolled courses: $totalCourses")
    println("Total credit hours: $totalCredits")
}