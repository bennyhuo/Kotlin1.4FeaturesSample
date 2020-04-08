package com.bennyhuo.kotlin

fun interface Action {
    fun run()
}

fun runAction(a: Action) = a.run()

fun runRunnable(r: Runnable) = r.run()

fun main() {
    runAction(Action { println("Not good..") })

    val action = {
        println("Action")
    }

    runAction(action)

    runAction {
        println("Hello, Kotlin 1.4!")
    }

    runRunnable {
        println("Hello, Kotlin 1.4!")
    }
}