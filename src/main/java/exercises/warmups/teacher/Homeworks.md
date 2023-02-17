# Warmups Homework

---

## Some Important Rules

1. Your class name and file name has to be same
2. At JAVA for every opening brackets "{","(","[" you need to have
   closing brackets "}",")","]" (balanced brackets)
3. you need to have semicolon at each line of code ";"
4. You need to have main method to run your codes
5. Initialize variable syntax
    ```java
    class HelloWorld {
      public static void main(String[] args){
        // DataType varName = value;
        String varName = "value";
      }
    }
    ```
6. Use camelCase for all variable names
7. Variable names should be descriptive and meaningful
---

## Create A java Project from scratch

1. project name: `Java-Homework`
2. Create a package named `warmups`
3. Create `HelloWorld` Class Under the `warmups` package
4. Create `main` method on the `HelloWorld` Class

## Implement the following Tasks

### Task A

Write Java program to store the following employee information

* name
* companyName ----- camelCase first letter starts small, second
  one starts Capital
* jobTitle
* gender --- char M/F
* salary --- double
* employeeID -- int
* hasBenefits --- boolean true/false
* isMarried --- char Y/N

### Task B - Say hello

Write Java program to print `Hello` on screen and then print _your name_ on a separate line

### Task C - Mathematical operators

Write Java program to print the following operators of two numbers

- sum (addition),
- multiply,
- subtract,
- divide and
- remainder

```text
Input: 
5
6

Output:
5 + 6 = 11
5 * 6 = 30
5 - 6 = -1
5 / 6 = 0
5 % 6 = 5
```

### Task D - Swap variables

Write Java program to swap two number without using a temporary variable.

  ```
  input:
  int x = 10;
  int y = 20:
  output:
  x = 20;
  y = 10;
  ```

### Task E - Calculate GPA

Create a program to find out students' grades and GPA based on their score.
Here is the requirement:

- Letter
- Grade
- Percentage GPA

```gherkin
Examples:
A+ | 97–100% | 4.0
A  | 93–96%  | 3.9
A− | 90–92%  | 3.7
B+ | 87–89%  | 3.3
B  | 83–86%  | 3.0
B− | 80–82%  | 2.7
C+ | 77–79%  | 2.3
C  | 73–76%  | 2.0
C− | 70–72%  | 1.7
D+ | 67–69%  | 1.3
D  | 63–66%  | 1.0
D− | 60–62%  | 0.7
F  | 0–59%   | 0.0
```

### Task F - Stages of human life

Create a program to print out the name of the age group based on the age provided.

- Infancy (1-2 years)
- Toddle (2-4 years)
- Childhood (5-7 years)
- Puberty (8-12 years)
- Teenager (13-18 years)
- Adulthood (19-30 years)
- Middle age (31-50 years)
- Senior (51 and up)
- If the age is not display in above list print `Invalid age`

  ```text
  Input:
  Age = 2
  Output:
  Infancy
  
  Input:
  Age = 18
  Output:
  Teenager
  
  Input: 
  Age = 0
  Output:
  Invalid Age
  ```

### Task G - Largest in three

Write a Java Program to Find the largest value between the 3 numbers.

  ```text
  input:
  -1.0, 4.5, -5.3
  output:
  4.5
  
  input:
  3, 0, -4
  output:
  3
  ```

### Task H - Day of the week

Write a Java Program that prints the day of the week.
**Note:** Your input must be between 1 to 7

```text
Example:
Input : 1
output : Monday
Input : 7
output : Sunday
```

### Task I - Greeting by the hour

Write a Java Program that take a input between 0-23 then print the following message

When do the greetings (Good morning, afternoon, and evening) change?

- Good Morning. 5 — 11
- Good Afternoon. 12 — 16
- Good Evening. 15 — 4
- if input not between 1 - 24 Print `Invalid Input`

  ```text
  Example:
  input: 3
  output: Good Morning
  
  input: 18
  output: Good Evening
  
  input: 28
  output: I don't understand
  ```

### Task J - Basic calculator

Create a calculator that can calculate basic operators like

- addition,
- subtraction,
- multiplication and
- division.

**Example 1**
  ```text
  Enter the 1st number:
  > 3 
  Enter the 2nd number
  > 4
  Enter the operation (addition, subtraction, multiplication, division)
  > addition
  Output:
  3 + 4 = 7;
  ```

**Example 2**
  ```text
  Enter the 1st number:
  > 4 
  Enter the 2nd number
  > 3
  Enter the operation (addition, subtraction, multiplication, division)
  > multiplication
  Output:
  4 x 3 = 12;
  ```

### Task K - Can vote?

Write Java program to check if the person is eligible to vote

Vote Condition:

- has to be a `USA` or `United States` citizenship
- has to be `21` years or older

**Example 1**
  ```text
  Enter the name:
  > John
  What is the country of citizenship? 
  > USA
  Enter is the age:
  > 43
  
  Output:
  Is John eligible to vote: true
  ```
**Example 2**
  ```text
  Enter the name:
  > Zoe
  What is the country of citizenship? 
  > United States
  Enter is the age:
  > 21
  
  Output:
  Is Zoe eligible to vote: true
  ```
**Example 3**
  ```text
  Enter the name:
  > Kathy
  What is the country of citizenship? 
  > Japanese
  Enter is the age:
  > 52
  
  Output:
  Is Kathy eligible to vote: false
  ```

### Task M - Even or Odd

Write Java program to check that given number is odd or even

```text
input: 100
output: 100 is even number

input: 55
output: 55 is odd number
```

### Task N

Write a program to print following information on the counsel.

```text
  Input:
  first integer: 25
  second integer: 39
  Output:
  25 != 39
  25 < 39
  25 <= 39
    
  Input:
  first integer: 1
  second integer: 1
  Output:
  1 == 1
  1 >= 1
```

### Task O - Sum it up

Write Java program to compute the sum of the digits of an integer. Constraint: Input < 100

```text
Input:
25
Output
7

Input:
45
Output:
9

Input: 5
Output: 5
```

### Task P - Days in month

Write Java program to find the number of days in a month (Assume that Fab has 28 days)

```text
Input:
2
Output:
28 days

Input:
9
Output:
30 days
```