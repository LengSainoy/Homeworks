# String

## The String type

`String` is a reference type consisting of characters. It is one of the most widely used types in
Java. Here is an example of a string: `"Hello, Java"`. This string is a sequence of 11 characters,
including one space.

This type has some features:

- **immutable type**: it's impossible to change a character in a string;
- it has methods for getting individual characters and extracting substrings;
- individual characters can be accessed by indexes, the first character has the index **0**, the
  last one – **the length of the string – 1**;
- non-primitive type.

## Creating strings

A string literal is surrounded by a pair of double quotes, for instance:

```java
String simpleString="It is a simple string"; // a simple string
System.out.println(simpleString);  // it prints "It is a simple string"

String anotherString="This is\na multiple\nstring"; // a string with escape sequences
System.out.println(anotherString); // it prints the result in several lines
```

A string can represent a long character sequence (text). A string can have one or zero characters.

```java
String strangeText="aaaaaaaaaaaassssssssssss gggggggggggggggggggg ddddddddddd qqqqqq ffff";

String emptyString="";

String s="s"; // a string consisting of one character
```

A string can be `null`. It means no value was assigned.

```text
String nullString = null; // it is null
```

Another way to create a variable of String is by using the keyword new.

```java
String str=new String("my-string"); // it creates an object and assigns it to the variable
```

## Get the length and characters of a String

Any string has two useful methods:

- `length()` returns the number of characters in the string;
- `charAt(int index)` returns a character by its index; 
 
Here is an example:
```java
String s = "Hi, all";

int len = s.length(); // the len is 7

char theFirstChar = s.charAt(0); // 'H' has the index 0

char theFifthChar = s.charAt(4); // 'a' has the index 4

char theLastChar = s.charAt(s.length() - 1); // 'l' has the index 6 
```

## Useful methods of strings
The standard library of Java provides a lot of useful methods for processing strings:

- `isEmpty()` returns `true` if the string is empty, otherwise – `false`;
- `toUpperCase()` returns a new string in uppercase;
- `toLowerCase()` returns a new string in lowercase;
- `startsWith(prefix)` returns `true` if the string starts with the given string prefix, otherwise, 
  `false`;
- `endsWith(suffix)` returns `true` if the string ends with the given string suffix, otherwise, `false`.
- `contains(...)` returns `true` if the string contains the given string or character;
- `substring(beginIndex, endIndex)` returns a substring of the string in the range: `beginIndex`, 
  `endIndex - 1`;
- `replace(old, new)` returns a new string obtained by replacing all occurrences of `old` with `new` 
  that can be chars or strings.
- `trim()` returns a copy of the string obtained by omitting the leading and trailing whitespace. 
  Note that whitespace includes not only the space character, but mostly everything that looks empty: tab, carriage return, newline character, etc.

See the following example to better understand these methods:
```java
String text = "The simple text string";

boolean empty = text.isEmpty(); // false

String textInUpperCase = text.toUpperCase(); // "THE SIMPLE TEXT STRING"

boolean startsWith = textInUpperCase.startsWith("THE"); // true

/* replace all space characters with empty strings */
String noSpaces = textInUpperCase.replace(" ", ""); // "THESIMPLETEXTSTRING"

String textWithWhitespaces = "\t text with whitespaces   !\n  \t";

String trimmedText = textWithWhitespaces.trim(); // "text with whitespaces   !"
```

To learn more about different methods and arguments you can check out the [documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).

## Exceptions when processing strings
When working with strings, there can be several exceptions.

1. `NullPointerException`. If a string is `null` and you call a method of the string, it throws a NullPointerException.
```java
String s = null;
int length = s.length(); // it throws NullPointerException
```
2. `StringIndexOutOfBoundsException`. If you try to access a non-existing character by an index then this exception occurs.
```java
String s = "ab";
char c = s.charAt(2); // it throws StringIndexOutOfBoundsException because indexing starts with 0
```
We will consider how to handle different types of exceptions later.

## Concatenating strings
Two strings can be concatenated using the "+" operator or the `concat` method. Both approaches lead to the same results.
```java
String firstName = "John";
String lastName = "Smith";

// concatenation using the "+" operator
String fullName1 = firstName + " " + lastName; // "John Smith"

// concatenation using the concat method
String fullName2 = firstName.concat(" ").concat(lastName); // "John Smith"
```
When we concatenate two strings a new string is created (because strings are **immutable**).

>**Important:** in the general case `str1 + str2` is not the same as `str2 + str1` because concatenation 
> is not a commutative operation.

## Appending values to a string
It's possible to add values of different types to a string. The value will be automatically converted to a string. See an example below.
```java
String str = "str" + 10 + false; // the result is "str10false"
```
In the example above, the order of execution is:

1. "str" + 10 => "str10"
2. "str10" + false = "str10false"

Let's see a more complex example:
```java
String shortString = "str";
int number = 100;

String result1 = shortString + number + 50; // the result is "str10050"
String result2 = number + 50 + shortString; // what is the result2?
```
The `result2` is `150str`, because, first, we calculate the sum of `number` and `50` and then `concat` it with `str`. The order of operations is important.

## How to compare strings correctly?
Since `String` is a reference type you shouldn't compare strings using the `==` or `!=` operators. In this case, only addresses will be compared, but not actual values.

`String` has two convenient methods for comparing the equivalence of the actual content of one string with the content of another string: `equals(other)` and `equalsIgnoreCase(other)`. See an example below.

```java
class Main {
  public static void main(String[] args) {

    String first = "first";
    String second = "second";

    String anotherFirst = "first";
    String secondInUpperCase = "SECOND";

    System.out.println(first.equals(second)); // false, the strings have different values
    System.out.println(first.equals(anotherFirst)); // true, the strings have the same value

    System.out.println(second.equals(secondInUpperCase)); // false, the strings have different cases
    System.out.println(second.equalsIgnoreCase(secondInUpperCase);
  }
}
```

## Mutable String
Fortunately, there is a special class named `StringBuilder` that is used to create mutable string objects. An object of this class is similar to a regular string, except that it can be modified. As an example, it is better to use `StringBuilder` than `String` where lots of concatenations are performed at runtime.

### Constructing objects
It is possible to create an empty object of the type `StringBuilder`:
```java
StringBuilder empty = new StringBuilder();
System.out.println(empty); // ""
```
or pass a string to it:
```java
StringBuilder sb = new StringBuilder("Hello!");
System.out.println(sb); // "Hello!"
```
>**Note**, we do not need to import anything to use this class in programs.

### Some important methods
The `StringBuilder` class provides a set of useful methods to manipulate objects. Let's consider some of them.

- `int **length()**` returns the length (the character count), like in regular strings. This method 
does not modify the object.
```java
StringBuilder sb = new StringBuilder("I use Java");
System.out.println(sb.length()); // 10
```
- `char **charAt(int index)**` returns a character located at the specified index. The first character 
has the index 0. This method does not modify the object.
```java
StringBuilder sb = new StringBuilder("I use Java");
System.out.println(sb.charAt(0)); // 'I'
System.out.println(sb.charAt(6)); // 'J'
```
- `void **setCharAt(int index, char ch)**` sets a character located at the specified index to ch.
```java
StringBuilder sb = new StringBuilder("start");
sb.setCharAt(1, 'm');
System.out.println(sb); // "smart"
```

- `StringBuilder **deleteCharAt(int index)**` removes the character at the specified position.
```java
StringBuilder sb = new StringBuilder("dessert");
sb.deleteCharAt(2);
System.out.println(sb); // "desert"
```

- `StringBuilder **append(String str)**` concatenates the given string to the end of the invoking 
`StringBuilder` object. There are also several overloadings to take primitive types and even arrays of characters.
```java
StringBuilder sb = new StringBuilder("abc");
sb.append("123");
System.out.println(sb); // "abc123"
```
It is also possible to invoke this method multiple times on the same object in the same statement because this method returns the same modified object.
```java
StringBuilder messageBuilder = new StringBuilder(); // empty

messageBuilder
.append("From: Kate@gmail.com\n")
.append("To: Max@gmail.com\n")
.append("Text: I lost my keys.\n")
.append("Please, open the door!");

System.out.println(messageBuilder);
```
Output:
```text
From: Kate@gmail.com
To: Max@gmail.com
Text: I lost my keys.
Please, open the door!
```

- `StringBuilder **insert(int offset, String str)**` inserts the given string into the existing 
`StringBuilder` object at the given position indicated by the offset. This method has a lot of overloadings for different types.

```java
StringBuilder sb = new StringBuilder("I'm a programmer.");
sb.insert(6, "Java ");
System.out.println(sb); // I'm a Java programmer.
```

- `StringBuilder **replace(int start, int end, String str)**` replaces the substring from the specified 
string index (inclusive) to the end index (exclusive) with a given string.

```java
StringBuilder sb = new StringBuilder("Let's use C#");
sb.replace(10,12,"Java");
System.out.println(sb); // Let's use Java
``` 
- `StringBuilder **delete(int start, int end)**` removes the substring from the start index (inclusive) 
to the end index (exclusive).

```java
StringBuilder sb = new StringBuilder("Welcome");
sb.delete(0,3);
System.out.println(sb); // "come"
```

- `StringBuilder **reverse()**` causes this character sequence to be replaced by the reverse of the 
sequence.

```java
StringBuilder sb = new StringBuilder("2 * 3 + 8 * 4");
sb.reverse();
System.out.println(sb); // "4 * 8 + 3 * 2"
```

> Note, when you have a `StringBuilder` object, you can get a `String` by invoking the `toString` method.
> For more details about methods see the documentation.