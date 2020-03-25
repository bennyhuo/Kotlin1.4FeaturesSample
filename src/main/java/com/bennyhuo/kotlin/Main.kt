package com.bennyhuo.kotlin



inline fun <T> test(block: () -> T): T {
    return block()
}



fun main() {




    val result = run {
        var str = currentValue()
        if (str == null) {
            str = "test"
        }
        str // the Kotlin compiler knows that str is not null here
    }

    println(result::class)

    var y: String? = null

    if (y == null){
        y = "hello"
    }
    y.length
    
}