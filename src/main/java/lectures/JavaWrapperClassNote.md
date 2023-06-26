# Wrapper classes:

classes that are dedicated to primitives        
Byte, Short, Integer, Long, Float, Double, Character, Boolean presented in "java.lang" package

## AutoBoxing:

converting primitive values to wrapper class

```
int a = 100;
Integer b = a  // auto boxing
```

## Unboxing:

converting wrapper class value to primitives

```text
Integer a = 100;
int b = a;  // unboxing
int a = 100;
double b = a;    // none
```

## Need of Wrapper Classes

They convert primitive data types into objects. 
Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value). 
The classes in java.util package handles only objects and hence wrapper classes help in this case also. 
Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference
types) and not primitive types. An object is needed to support synchronization in multithreading.

# var keyword (Java 10 and up)
`var` represent the same type of other side of assignment operator

```java
var name = "Tom Anderson"; // var => String
var day = 5; // var => int
var scanner = new Scanner(System.in); // var => Scanner
var arrList = new ArrayList<Integer>();
```

Warning: cannot use `var` without assignment operator
```java
var numArr; // this will have complier error
numArr = new int[4];
```
