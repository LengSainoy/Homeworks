## Java Operators

## Arithmetic operation

The Java programming language provides operators to perform arithmetic operations:

- addition `+`
- subtraction `-`
- multiplication `*`
- division `/`
- remainder `%`

The operators are called binary because they take two values as operands.

The following example prints results of **addition**, **subtraction**, and **multiplication**.

```java
System.out.println(13+25); // prints 38
System.out.println(20+70); // prints 90

System.out.println(70-30); // prints 40
System.out.println(30-70); // prints -40

System.out.println(21*3);  // prints 63
System.out.println(20*10); // prints 200
```

The `/` operator returns the integer part of the division of two integer numbers, and _any
fractional part is discarded_.

```java
System.out.println(8/3); // prints 2
System.out.println(41/5); // prints 8
```

The `%` in Java is the **modulus** or _remainder operator_. It returns the remainder of the division
of two numbers.

**Note:** that when the dividend is less than the divisor, the quotient is zero and the remainder
equals the dividend.

```java
System.out.println(10%3); // prints 1, because 10 divided by 3 leaves a remainder of 1
System.out.println(12%4); // prints 0, because 12 divided by 4 leaves no remainder
System.out.println(5%9); // prints 5, because 5 divided by 9 leaves a remainder of 5
```

### Writing complex expressions

The operations can be combined to write more complex expressions:

```java
System.out.println(1+3*4-2); // prints 11
```

The calculation order coincides with arithmetic rules. Multiplication has a **higher priority**
level than addition and subtraction, so the operation `3 * 4` is calculated first.

To specify the order of execution we can use **parentheses** as in the following:

```java
System.out.println((1+3)*(4-2)); // prints 8 
```

As in arithmetic, **parentheses** can be nested. You can also use them for clarity.

### The precedence order

There is a precedence order of all arithmetic operators, including parentheses. The list below is
sorted from the highest to the lowest precedence level.

1. parentheses `()`
2. multiplication, division `*` `/`
3. addition, subtraction `+` `-`

### The forms of the assignment operator

Suppose you want to add some value to a variable. You may write something like this:

```java
int n = 10;
n = n + 4; // 14
```

The assignment operator `=` has several forms which combine it with an operation to avoid repeating
the variable twice:

```java
int n = 10;
n += 4; // 14
```

As you may see, this form looks more concise. There are a few other possible forms such as `*=`
, `/=`, `%=`.

### Using ++ and -- in Java

Java has two opposite operations called increment (`++`) and decrement (`--`) to increase/decrease
the value of a variable by one.

```java
int n = 10;
n++; // 11
n--; // 10
```

The code above is actually the same as below.

```java
int n = 10;
n+=1; // 11
n-=1; // 10
```

### Prefix and postfix forms

Both increment and decrement operators have two forms which are very important when using the result
in the current statement:

- prefix (`++n` or `--n`) increases/decreases the value of a variable before it is used;
- postfix (`n++` or `n--`) increases/decreases the value of a variable after it is used.

The following examples demonstrate both forms of increment.

**Prefix increment:**

```java
int a = 4;
int b = ++a;

System.out.println(a); // 5
System.out.println(b); // 5
```

In this case, the value of `a` has been incremented and then assigned to `b`. So, `b` is 5.

**Postfix increment:**

```java
int a = 4;
int b = a++;

System.out.println(a); // 5
System.out.println(b); // 4
```

## Logical operators

Variables of the `boolean` type are often used to build logical expressions using logical operators.
Java has four logical operators **NOT**, **AND**, **OR** and **XOR**:

- **NOT** is a unary operator that reverses the boolean value. It is denoted as `!`.

```java
boolean f = false; // f is false
boolean t = !f; // t is true 
```

- **AND** is a binary operator that returns `true` if both are `true`, otherwise, it returns `false`
  . It is denoted as `&&`.

```java
boolean b1 = false && false; // false 
boolean b2 = false && true; // false
boolean b3 = true && false; // false 
boolean b4 = true && true; // true 
```

- **OR** is a binary operator that returns `true` if at least one operand is `true`, otherwise, it
  returns `false`. It is denoted as
  `||`.

```java
boolean b1 = false || false; // false 
boolean b2 = false || true; // true 
boolean b3 = true || false; // true 
boolean b4 = true || true; // true
```

- **XOR (exclusive OR)** is a binary operator that returns true if boolean operands have different
  values, otherwise, it returns false. It is denoted as ^.

```java
boolean b1 = false ^ false; // false 
boolean b2 = false ^ true; // true 
boolean b3 = true ^ false; // true 
boolean b4 = true ^ true; // false 
```

> **Note:** The **XOR** operator is used less often than others. Just remember that Java has it. If you really
need it, you can use it.

### The precedence of logical operators 
Below are the logical operations sorted in order of decreasing
their priorities in expressions: 
1. ()
2. `!` (NOT)
3. `^` (XOR), `&&` (AND), `||` (OR).

So, the following variable is `true`:

```java
boolean b = true && !false; // true, because !false is evaluated first 
```

To change the order of
execution you can use round brackets `(...)`.

### Short-circuiting evaluation
An interesting thing is that the `&&` and `||` operators don't evaluate the second argument if it isn't necessary. When the first argument of the `&&` operator evaluates to `false`, the overall value must be `false`; and when the first argument of the `||` operator evaluates to `true`, the overall value must be `true`. So:

- `false && ...` -> `false`, since it is not necessary to know what the right-hand side is;
- `true || ...` -> `true`, since it is not necessary to know what the right-hand side is.

##Comparison / Relational Operators

Java provides six relational operators to compare numbers:

![java-operators](C:\Users\Lengg\Documents\TechCircleCode\cohort11-java\src\day6_2ndReview\FNXMemr.jpg)

The result of applying a relational operator to its operands will be `boolean` (`true` or `false`) regardless of the types of operands.
###Comparing integer numbers
###Joining relational operations using logical operators
In Java, you cannot write an expression like a <= b <= c. Instead, 
you should join two boolean expressions using logical operators like `||` and `&&.`

Here is an example:
```java
number > 100 && number < 200; // it means 100 < number < 200
```
Also, we can write parts of the expression in parentheses to improve readability:
```java
(number > 100) && (number < 200);
```
But parentheses are not necessary here because relational operators have a _higher priority_ than logical operators.

## Comparison operators (relational oper.)
Comparison operators are used to compare two values (or variables). This is important in programming, because it helps us to find answers and make decisions.

The return value of a comparison is either true or false.

## Assignment Operator

## Scanner Class
use to read input. it could be from file or even user input
```java
Scanner sc = new Scanner(System.in);
```