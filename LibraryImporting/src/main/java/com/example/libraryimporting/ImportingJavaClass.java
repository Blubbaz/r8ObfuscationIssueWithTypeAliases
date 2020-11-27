package com.example.libraryimporting;

import com.example.librarytoimport.SomeClass;
import com.example.librarytoimport.SomeClassKt;
import com.example.librarytoimport.SomeClassWithGenerics;
import com.example.librarytoimport.SomeClassWithGenericsKt;
import com.example.librarytoimport.SomeClassWithGenericsTypeAliasesOtherFile;
import com.example.librarytoimport.SomeClassWithGenericsTypeAliasesOtherFileKt;

public class ImportingJavaClass {

    public void someMethodUsingSomeClass() {
        final SomeClass someClass = new SomeClass();
        someClass.a();
        SomeClassKt.extensionFunctionA(someClass);
    }

    public void someMethodUsingSomeClassWithGenerics() {
        final SomeClassWithGenerics<String> someClass = new SomeClassWithGenerics<>();
        someClass.b();
        SomeClassWithGenericsKt.extensionFunctionB(someClass);
    }

    public void someMethodUsingSomeClassWithGenericsTypeAliasesSeparateFile() {
        final SomeClassWithGenericsTypeAliasesOtherFile<String> someClass = new SomeClassWithGenericsTypeAliasesOtherFile<>();
        someClass.c();
        SomeClassWithGenericsTypeAliasesOtherFileKt.extensionFunctionC(someClass);
    }
}
