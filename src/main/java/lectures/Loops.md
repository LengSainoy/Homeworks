# Loop
## The while loop
The while loop consists of a block of code and a condition (a Boolean expression). If the condition is `true`, the code within the block is executed. This code repeats until the condition becomes `false`. Since this loop checks the condition before the block is executed, the control structure is also known as a **pre-test loop**. You can think of the **while** loop as a repetitive conditional statement.

The basic syntax of the **while** loop is the following:
```java
while (condition) {
   // body: do something repetitive
}
```
A loop's body can contain any correct Java statements including conditional statements and even other loops, the latter being called nested loops.

It is also possible to write an **infinite loop** if the condition is invariably `true`:
```java
while (true) {
   // body: do something indefinitely
}
```
**Example:** The following program displays English letters in a single line.
```java
public class WhileDemo {
    public static void main(String[] args) {
        char letter = 'A';
        while (letter <= 'Z') {
            System.out.print(letter);
            letter++;
        }
    }
}
```
The program takes the first letter `A` and then goes on like this:

- if the `letter` is less than or equal to `Z` the program goes to the loop's body;
- inside the body, it prints the current character and `letter` takes the next alphabet letter.

The program prints:

>ABCDEFGHIJKLMNOPQRSTUVWXYZ

## The do-while loop
This loop contains three parts: the do keyword, a body, and while(condition):
```java
do {
   // body: do something
} while (condition);
```

A good example of using it is a program that reads data from the standard input until a user enters a certain number or string. The following program reads integer numbers from the standard input and displays them. If the number 0 is entered, the program prints it and then stops. The following example demonstrates the **do-while** loop:
```java
public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            value = scanner.nextInt();
            System.out.println(value);
        } while (value != 0);
    }
}
```
## Reading a sequence with an unknown length
The `while` loop can also be used to read a sequence of characters of an arbitrary length. For that, we can invoke the `hasNextInt()` method of `Scanner` inside the condition. The method returns `true` if the next element is an integer number and `false` otherwise.

Here is a code that calculates the sum of all elements from the provided sequence:

```java
Scanner scanner = new Scanner(System.in);
int sum = 0;
while (scanner.hasNextInt()) {
  int elem = scanner.nextInt();
  sum += elem;
}
System.out.println(sum);
```
If the input sequence is `1 2 3`, the code prints `6`, if it is `5 18 9 23 4`, the code prints `59`.

As you see, the **while** loop can be used to solve different interesting tasks in your programs.

## For-Loop

The basic for-loop syntax The for-loop has the following basic syntax:

```java
for ( initialization; condition; modification ) {
   // do something 
} 
```

### Parts of the loop:

- the **initialization statement** is executed once before the loop begins; usually, loop variables
  are initialized here;
- the **condition** is a Boolean expression that determines the need for the next iteration; if it's
  `false`, the loop terminates;
- the **modification** is a statement that changes the value of the loop variables; it is invoked
  after each iteration of the loop; usually, it uses
  **increment or decrement** to modify the loop's variable.

Inside the loop's body, the program can perform any correct Java statements. It can even contain
other loops.

The order of execution for any for-loop is always the same:

1. the initialization statement;
2. if the condition is `false` then terminate the loop;
3. if the condition is `true`, then the loop's body is executed;
4. the modification is performed;
5. go to stage 2 (condition).

Let's write a loop for printing integer numbers from 0 to 9 on the same line.

```java
int n = 9;
for (int i = 0; i <= n; i++) {
   System.out.print(i + " "); // here, a space is used to separate numbers 
} 
```

The code displays:
> 0 1 2 3 4 5 6 7 8 9

The variables declared in the initialization statement are visible only inside the scope that
includes all parts of the loop: the condition, the body, and the modification. The integer loop
variables are often named as `i`, `j`, `k`, or `index`.

### Skipping parts

The initialization statement, the condition, and the modification parts are optional, the for loop
might not have all of them.

It is possible to declare a variable outside the loop:

```java
int i = 10;
for ( ; i > 0; i--) {
   System.out.print(i + " ");
}
```

Moreover, it is also possible to write an infinite loop without these parts at all:

```java
for (;;) {
   // do something
}
```

## Nested Loops

Nested loops It's possible to nest one for-loop in another for-loop. This approach is used to
process multidimensional structures like tables (matrices), data cubes, and so on.

## Branching Statement

**Branching statements** are used to alter the standard behavior of loops; they can terminate a loop
or skip some iterations.

### The break statement

The break statement has two uses:

- it terminates the current loop of any type (**for**, **while**, **do-while**);
- it terminates a case in the **switch** statement;

In this topic, we will learn how to use it to terminate loops.

The following example demonstrates a loop that includes one `break`.

```java
int i = 10;
while (true) { // the condition to continue the loop
   if (i == 0) { // the condition to perform the break that stops this loop
      break;
   }
   i--;
}
```

In the code above, the condition to continue the loop is always `true`, but it will be successfully
stopped when the variable `i` becomes `0` through the use of `break` inside the conditional
statement.

The **break** statement terminates only the loop in which it is currently located. If this loop is
performed inside another loop, the outer loop won't be stopped.

The following code prints a ladder of numbers.

```java
for (int i = 0; i < 10; i++) {
   for (int j = 0; j < 10; j++) {
      System.out.print(j + " ");
      if (i == j) {
         break;
      }
   }
System.out.println();
}
```

The break statement can't stop the outer loop (with variable `i`) and the code prints:

```text
0 
0 1 
0 1 2 
0 1 2 3 
0 1 2 3 4 
0 1 2 3 4 5 
0 1 2 3 4 5 6 
0 1 2 3 4 5 6 7 
0 1 2 3 4 5 6 7 8 
0 1 2 3 4 5 6 7 8 9
```

To stop the outer loop we'd like to declare a Boolean variable `stopped` and use it as a special
Boolean flag.

```java
boolean stopped=false;
for(int i=0;(i< 10)&&!stopped;i++){
   for(int j=0;j< 10;j++){
      System.out.print(j+" ");
      if(i==j){
         stopped=true;
         break;
      }
   }
System.out.println();
}
```

Now, the program's output is not the same:

```text
0 
```

There is another way to stop the outer loop: the **labeled break operator**. However, it's not good
practice to use it. Google it if you are really interested.

### The continue statement

It causes a loop to skip the current iteration and go to the next one.

This statement can be used inside any kind of loops.

- inside the **for-loop**, the continue causes control to immediately move to the
  increment/decrement statement;
- inside the **while** or **do-while loop**, control immediately moves to the condition.

In the following example, a sequence of numbers is output. Odd numbers are skipped.

```java
int n = 10; 
for (int i = 0; i < n; i++) { 
   if (i % 2 != 0) { 
      continue; 
   } 
   System.out.print(i + " "); 
}
```
The output:
```text
0 2 4 6 8 
```

The `continue` statement and the `break` statement only affect the loop in which they are
located. The `continue` statement cannot skip the current iteration of the outer loop.

Often, we can rewrite our loop without using the continue statement. Here is an example:
```java
int n = 10; 
for (int i = 0; i < n; i++) { 
   if (i % 2 == 0) { 
      System.out.print(i + " "); 
   } 
} 
```
The result is the same as above, but the code became shorter and more readable.




