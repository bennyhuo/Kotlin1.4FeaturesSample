package com.bennyhuo.kotlin

val result = run {
    var str = currentValue()
    if (str == null) {
        str = "test"
    }
    str // the Kotlin compiler knows that str is not null here
}

fun currentValue(): String? {
    return null
}
// The type of 'result' is String? in Kotlin 1.3 and String in Kotlin 1.4