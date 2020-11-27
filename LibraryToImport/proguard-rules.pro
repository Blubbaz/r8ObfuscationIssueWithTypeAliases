-dontshrink
-dontoptimize

-dontskipnonpubliclibraryclasses
-verbose

-overloadaggressively

-renamesourcefileattribute SourceFile
-keepattributes Exceptions,Deprecated,SourceFile,LineNumberTable,*Annotation*,EnclosingMethod

-keepattributes RuntimeVisibleAnnotations
-keep class kotlin.Metadata { *; }

-keep class com.example.librarytoimport.* {
    protected *;
    public *;
}