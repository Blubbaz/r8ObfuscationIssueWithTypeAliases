package com.example.librarytoimport

typealias SomeClassObserver = (SomeClass) -> Unit

class SomeClass {

    fun a() {}
}

fun SomeClass.extensionFunctionA() {}