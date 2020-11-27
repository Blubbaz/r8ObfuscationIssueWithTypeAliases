package com.example.libraryimporting

import com.example.librarytoimport.SomeClass
import com.example.librarytoimport.SomeClassWithGenerics
import com.example.librarytoimport.SomeClassWithGenericsTypeAliasesOtherFile
import com.example.librarytoimport.extensionFunctionA
import com.example.librarytoimport.extensionFunctionB
import com.example.librarytoimport.extensionFunctionC

class ImportingClass {

    fun someFunctionUsingSomeClass() {
        val someClass = SomeClass()
        someClass.a()
        someClass.extensionFunctionA()
    }

    fun someFunctionUsingSomeClassWithGenerics() {
        val someClass = SomeClassWithGenerics<Unit>()
        someClass.b()
        someClass.extensionFunctionB()
    }

    fun someFunctionUsingSomeClassWithGenericsTypeAliasesSeparateFile() {
        val someClass = SomeClassWithGenericsTypeAliasesOtherFile<Unit>()
        someClass.c()
        someClass.extensionFunctionC()
    }
}