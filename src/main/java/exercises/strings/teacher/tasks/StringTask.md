# String Tasks

## Task1
write a program that asks user to enter a sentence.
then print the first & last characters of the sentence

Example:
```text
Input: Welcome To TechCircle
output: We
```

## Task2
Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.

- If word is shorter, display message: `Too short!`.
- If word is longer, display message: `Too long!`.
- Otherwise, _reverse this word_ and print out result into the console.


## Task3
write a program that asks user to enter two strings, and print out the longest string

## Task4

write a program that can check if the first and last characters of the string are same

Example:
```text
input:
level
output:
same

input:
domino
output:
not same
```


## Task5

Your team has created a new bank website that requires email address to be validated.

- The email string must contain an `@` character.
- The email string must contain an `.` character.
- The `@` must contain at least one character in front of it.
  e.g. "a@example.com" is _valid_ while "@example.com" is _invalid_.
- The `.` and `@` must be in the appropriate places.
  e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.

For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.

Examples:

```text
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false
str = "test.automation@example" --> false
```

## Task6

write a program that can return the initials of the user

Example :

```text
input:
techcircle
school

output:
T.S
```

## Task7

Write a method that asks user to enter a string.

- if the string _is empty_, print: `string is empty`
- if the string has _more than 3 characters_, print the **last three characters**
- f the string has _less than or equal 3 characters_, print the **string itself**

## Task8

write a program that asks the user enter a three letter word. Check if the middle
character of the given word is `a`. In the case it is print: `Cool word`, but in the case
the middle letter is not `a` print: `Okay word`.

If the user does not enter a 3 letter word do the following:

- the word is less than 3 letters: `Word is too short`
- the word is greater then 3 letters. Print: `Word is too long`

## Task9

Ask user to enter two words. Print first word without its first character
then print the second word without its first character.

```text
Input:
apple
banana
Output:
ppleanana
```

## Task10

ask the user to enter a word. if the word _ends with_ `ly`, print `really???` , if not, print `never mind`

## Task11

Ask user to enter a word. If the work starts with x, print the word without x.

```text
Input:
xcode
Output:
code
```

## Task12

Create a class calledEmailTask1.
Assume that email address is constructed by person's first name and followed by an underscore and last name.

Write a program that can swap first name with last name in the email (Seperated by an underscore).
If the email doesn't contain an underscore print the given input email.

Example:

```text
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
```

## Task13

Create a class called EmailTask2.
Assume that email address is constructed by person's first name and followed by an underscore and last name.

Write a program that will print out information about user based on email. Print first name, last name, and domain.

First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

Example:

```text
input:
techcircle_school@aws.com

Output:
First name: Techcircle
Last name: School
Domain: aws.com
```

## Task14

Write a program that asks user to enter first and last names, and then prints the full name in regular format (first
character in upper case)

```text
input:
firstName = "tecHCIrcle"
lastName = "SCHOOL";

output:
Techcircle School
```

## Task15

Write a program to extract digits from a String:

```text
input: 
ab123c4d56efg
output: 
123456
```

## Task16

Write a program to extract distinct character from a string

```text
input: abcabcabcabc
output: abc
```

# coding challenges

## Task - Tip calculator

Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.

Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

There will also the ability to calculate based on the number of people in the party and if there is a split of the bill
or not.

The program should display the following information based on the user input:

Split or No split (Yes or No), Number of people entered: (number) (each person = & in output) Check amount: (number)
Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

Example:

```text
Split or No split (Yes or No)?
> Yes
Enter the number of people
> 4
Enter the check amount:
> 476
How was the service quality? (Excellent/Great/Good/Fair/Poor)
> Excellent

Party of :          4
Grand Total:        $ 595.0
Tips Total:         $ 119.0
Total per person:   $ 148.75
Tips per person:    $ 29.75
```


