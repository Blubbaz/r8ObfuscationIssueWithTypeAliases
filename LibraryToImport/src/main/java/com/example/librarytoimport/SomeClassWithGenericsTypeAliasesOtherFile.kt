package com.example.librarytoimport

class SomeClassWithGenericsTypeAliasesOtherFile<ValueType> {
    fun c() {}
}

fun <ValueType> SomeClassWithGenericsTypeAliasesOtherFile<ValueType>.extensionFunctionC() {}