package com.bennyhuo.kotlin

fun interface Action {
    fun run()
}

fun hello(action: Action) {
    action.run()
}

fun hello2(runnable: Runnable){
    runnable.run()
}

fun main() {
    hello {
        println("Hello")
    }

    hello2 {
        println("Hello")
    }
}