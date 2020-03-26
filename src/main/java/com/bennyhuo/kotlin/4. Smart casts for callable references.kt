package com.bennyhuo.kotlin

import kotlin.reflect.KFunction0

fun foo(i: Int = 0): String = "$i!"

fun apply1(func: () -> String): String = func()
fun apply2(func: (Int) -> String): String = func(42)

fun main() {

    val f = ::foo as Function0<String>
    println(f.invoke())

    println(apply1(::foo))
    println(apply2(::foo))
}