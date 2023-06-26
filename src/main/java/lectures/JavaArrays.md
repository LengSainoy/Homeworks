# Arrays

is a group of collection of the _same type_ of object. it uses to store multiple values in a single
variable Arrays in Java have fixed size. Can't growth or shrink Each element will have an index that
start from 0

Declare & Initialize

```java
String[]names=new String[5]; 
// this will declare array with size of 5, with initial value
String[]fruits={"Orange","Mango","Banana","Apple","Strawberry"};
int[]numbers=new int[]{3,4,6,32,4,76};
```

if values of array are not initialize, array will be assigned with default value

- String/Non-Primitive = null
- Integer/int = 0
- Double/double = 0.0
- Boolean/boolean = false

Get the size of array

```java
System.out.println(numbers.length); // 6
```

Get an element

```java
System.out.println(fruits[0]); // Orange
System.out.println(fruits[fruits.length-1]) // Get last element of the array -> "Strawberry"
```

Set an element

```java
fruits[1]="Pear";
```

Print the array

```java
System.out.println(fruits); // this will print the memory location of fruits array
   System.out.println(Arrays.toString(fruits)) // {"Orange","Pear","Banana","Apple","Strawberry"}
```

Add element to an array

```java
// Nope! you cannot do that
```

## Logics

following are the sample algorithm that will appear a lot in coding interview

### Find Max/Min

Exercise:

Create array that store 20 randoms numbers between 1-99. Then write the program that can find `max`
and `min` number from that list then store them in new int[2]{`min`,`max`}

### Bubble Sorting

Exercise:

Create array that store 10 unique colors. Then write program to sort the all the colors by the
length of the word in descending order.
["red","blue","purple","pink","green"] -> ["red","blue","pink","green","purple"]

#### How to swap variable
Show them in java file

## Array Utils Method

### sort() 

this will sort the array in ascending order

```java
int[]numbers={0,6,3,-1};
   Arrays.sort(numbers);
   System.out.println(Arrays.toString(arr1)) // [-1,0,3,6]
```

### fill()

to fill an array with specified value.

```java
int[]healthList=new int[5];
   Arrays.fill(healthList,100)
   System.out.println(Arrays.toString(healthList)) // [100,100,100,100,100]
```

### copyOf()

Since array is not a primitive data type. when you copy an array, it will point to the same memory
location.

```java
int[]arr1=new int[3]; // {0,0,0}
   int[]arr2=arr1;
   arr1[0]=1;
   System.out.println(Arrays.toString(arr1)) // [1,0,0]
   System.out.println(Arrays.toString(arr2)) // [1,0,0]
```

but when you use `.copyOf()` the `arr2` will not be effected

```java
int[]arr1=new int[3]; // {0,0,0}
   int[]arr2=Arrays.copyOf(arr1,arr1.length);
   arr1[0]=1;
   System.out.println(Arrays.toString(arr1)) // [1,0,0]
   System.out.println(Arrays.toString(arr2)) // [0,0,0]
```

### equals()

### compare()

## String Methods that relate with Arrays

### toCharArray()

will convert String to array of character

```java
String str="Hello";
   char[]charArr=str.toCharArray(); // ['H','e','l','l','o']
```

### split()

will convert string to array, depend on the separator will take regex/regexp or Regular Expression
or pattern as a parameter

#### Regular Expression

is a sequence of characters that specifies a search pattern in text. Usually such patterns are used
by string-searching algorithms for "find" or "find and replace" operations on strings

Examples:

```text
[hc]?at matches "at", "hat", and "cat".
[hc]*at matches "at", "hat", "cat", "hhat", "chat", "hcat", "cchchat", and so on.
[hc]+at matches "hat", "cat", "hhat", "chat", "hcat", "cchchat", and so on, but not "at".
cat|dog matches "cat" or "dog".
```

```java
class Main {
   public static void main(String[] args) {
      String sentence = "is a sequence of characters that specifies a search pattern in text. Usually such patterns are used by string -searching algorithms for \"find\" or \"find and replace\" operations on strings ";
      String[] sentenceArr = sentence.split("\\s",10);
      System.out.println(Arrays.toString(sentenceArr)); // What will it print?
   }
}
```
