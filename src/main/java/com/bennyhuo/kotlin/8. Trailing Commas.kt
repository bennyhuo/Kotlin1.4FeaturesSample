package com.bennyhuo.kotlin

data class Person(val name: String, val age: Int, val id: Int)

fun main() {
    val person = Person(
        "bennyhuo",
        30,
        1
    )
}