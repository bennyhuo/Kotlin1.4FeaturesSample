package com.bennyhuo.kotlin

import kotlin.properties.Delegates

class MyClass {
    var myProp: String by Delegates.observable("<no name>") {
            _, oldValue, newValue ->
        println("My prop: $oldValue -> $newValue")
    }
}

class MyOtherClass {
    val lazyProp by lazy { 42 }
    var myProp: String by Delegates.observable("<no name>") {
            kProperty, oldValue, newValue ->
        println("${kProperty.name}: $oldValue -> $newValue")
    }
}

fun main() {
    val user = MyClass()
    user.myProp = "first"
    user.myProp = "second"
}