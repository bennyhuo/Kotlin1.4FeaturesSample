package com.bennyhuo.kotlin

import kotlin.reflect.KMutableProperty0
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty0

operator fun <R> KProperty0<R>.getValue(thisRef: Any, property: KProperty<*>): R {
    return get()
}

operator fun <R> KMutableProperty0<R>.setValue(thisRef: Any, property: KProperty<*>, value: R) {
    set(value)
}

class DelegateDemo {

    var newValue: Int = 3

    var oldValue by this::newValue
    
    val newReadOnlyProperty: String = "Hello"

    val oldReadOnlyPropery by this::newReadOnlyProperty

}

fun main() {
    val delegateDemo = DelegateDemo()

    println(delegateDemo.oldReadOnlyPropery)
    println(delegateDemo.oldValue)

    delegateDemo.oldValue = 10
    println(delegateDemo.oldValue)
    println(delegateDemo.newValue)
}