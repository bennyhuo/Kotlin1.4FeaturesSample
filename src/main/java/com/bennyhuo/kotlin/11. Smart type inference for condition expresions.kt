package com.bennyhuo.kotlin

import java.util.concurrent.atomic.AtomicInteger

fun main() {
    val int = if (validation()) 1 else 2
    val long = if (validation()) 1 else 2L

    val number = if (validation()) 1 else 2.0

    val number2 = if (validation()) 1F else 2.0

    val number3 = if(validation()) 1 else AtomicInteger(10)

    operator fun Number.compareTo(other: Number): Int {
        return this.toDouble().compareTo(other.toDouble())
    }

    if (number > number2) {
        println("$number > $number2")
    } else {
        println("$number <= $number2")
    }


    val pet = if(validation()) object : Bird{
        override fun fly() {
            TODO("Not yet implemented")
        }

        override fun layEggs() {
            TODO("Not yet implemented")
        }
    }else object : Fish{
        override fun swim() {
            TODO("Not yet implemented")
        }

        override fun layEggs() {
            TODO("Not yet implemented")
        }
    }

//    pet.layEggs() // Error.
}



fun validation(): Boolean {
    return true
}

interface Bird {
    fun fly()
    fun layEggs()
}

interface Fish {
    fun swim()
    fun layEggs()
}