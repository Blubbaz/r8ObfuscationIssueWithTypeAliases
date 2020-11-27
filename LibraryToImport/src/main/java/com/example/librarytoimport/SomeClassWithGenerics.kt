package com.example.librarytoimport

typealias SomeClassWithGenericsObserver<ValueType> = (SomeClassWithGenerics<ValueType>) -> Unit

class SomeClassWithGenerics<ValueType> {
    fun b() {}
}

fun <ValueType> SomeClassWithGenerics<ValueType>.extensionFunctionB() {}