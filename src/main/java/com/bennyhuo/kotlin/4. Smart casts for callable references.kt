package com.bennyhuo.kotlin

fun foo(i: Int = 0): String = "$i!"

fun apply1(func: () -> String): String = func()
fun apply2(func: (Int) -> String): String = func(42)

fun main() {
    println(apply1(::foo))
    println(apply2(::foo))
}