package com.bennyhuo.kotlin

var counter = 0
fun inc() = counter++

tailrec fun test(i: Int, x: Int = inc(), y: Int = inc()) {
    println("x: $x, y: $y")
    if (i > 0) test(i - 1)
}

fun main() {
    test(1)
}