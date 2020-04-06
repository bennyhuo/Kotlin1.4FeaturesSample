package com.bennyhuo.kotlin

fun main() {
    val list = listOf(1, 2, "3", 4.0, 5F)
    for (i in list) {
        when(i){
            2 -> {
                continue
            }
            4.0 -> {
                break
            }
            else -> {
                println(i)
            }
        }
    }
}