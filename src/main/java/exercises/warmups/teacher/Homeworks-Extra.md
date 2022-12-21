# Warmups-Extra Homework

---
## Task E1: Stylist Date Night

You and your date are trying to get a table at a restaurant.

The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the
stylishness of your date's clothes.

**Rule for getting a table**

- Write program that take 2 input from user in one line. 1st value is your stylishness & 2nd value
  is your date's stylishness
- If either of you is very stylish, 8 or more, then the result
  is `Yes, you both will definitely get a table`
- With the exception that if either of you has style of 2 or less, then the result is
  `Sorry, but no table for both of you`.
- Otherwise, the result is 1 `Ahh, you maybe lucky tonight`.

**Example:**

```text
What are you and your date stylishness?
> 5 10
Yes, you both will definitely get a table

What are you and your date stylishness?
> 2 8
Sorry, but no table for both of you

What are you and your date stylishness?
> 5 5
Ahh, you maybe lucky tonight
```


### Task M1 - Lucky Number

A four-digit number `ABCD` is called lucky if `A` + `B` = `C` + `D`

Write a program that asks the user to enter a four-digit number and tell if the number is a lucky
number or not. if it's a lucky number print `Yay, <number> is a lucky number`, otherwise
print `Nah, <number> is not a lucky number`

**Example 1:**

```text
Please enter 4 digits number:
> 3719
Yay, 3719 is a lucky number
```

**Example 2:**

```text
Please enter 4 digits number:
> 3521
Nah, 3521 is not a lucky number
```

### Task M2 - Upper, Lower or Number

Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z )
or number (0-9). if the input letter is lowercase, print `<letter> is a lowercase alphabet`
if the letter is the uppercase, print `<letter> is a uppercase alphabet`
if the letter is a number, print `<letter> is a number`
if the letter is not an alphabet and number, print `this input cannot be computed`

#### Tips:

- you can refer to ASCII table
- use `next().charAt(0)` to receive `char` input from user

### Task M3 - Weird Number

Given an integer `n` , perform the following conditional actions:

- If `n` is odd, print `Weird`
- If `n` is even and in the inclusive range of `2` to `5` , print `Not Weird`
- If `n` is even and in the inclusive range of `6` to `20` , print `Weird`
- If `n` is even and greater than `20`, print `Not Weird`

#### Input Format

A single line containing a positive integer `n` .

#### Constraints

- 1 <= `n` <= 100

#### Example:

```text
Input:
> 3
Output:
> Weird

Input:
> 24
Output:
> Not Weird
```

### Task H1 - Speeding Ticket

Write a program that calculates the fine for a speeding ticket. Prompt the user for several items of
information. These data items will be used to determine the fine.

**Here is what your program must do:**

Prompt for: driver lastName, firstName, age, speedLimit, actual speed, and whether you are in a
construction zone.

Calculate the components of the fine and the total fine (see rules below).

**Rules to calculate fine:**

1. if driver is less than 5mph over limit, no fine is assessed, but you finish all prompts,
   calculations and generate the report.
2. else if driver is over limit by 20mph or less, charge $30 per every 5mph over limit.
3. else if driver is more than 20mph over limit charge $50 per every 5 mph over limit.
4. Don't mix rates! - driver is either charged $30 per 5mph over or $50 per 5mph over.
5. if the violation occurred in a construction zone, you are to **DOUBLE** the fine.

Lastly -- AFTER ALL OTHER CALCULATIONS ARE DONE: if driver is under 21 AND more than 20mph over limit then you must add
an additional straight $300 underage speeder fine. ** You are NOT to double this

#### Constraints

- Only enter positive numbers for driver's age, speed limit and actual speed.
- Don't enter ridiculously huge numbers. Your variables could overflow and formatting may not fit.

#### Tips:

- use `Scanner` class to receive input from user

> Scanner scanner = new Scanner(System.in);

- use `next().charAt(0)` to receive `char` input from user

#### Example:

```text
What is driver's firstname?
> Greg
What is driver's lastname?
> Naman
What is driver's age?
> 30
What is the speed limit (mph)?
> 25
What is driver's speed (mph)?
> 45
Is this a construction zone (Y/N)?
> Y

=========REPORT=========

Driver name: 
    Greg Naman
Age:        
    30 years old
Speed limit:    25 mph
Current speed:  45 mph
Construction zone (Y/N)?: Y
Speeding fine:  $120.00

==========END===========
```

```text
What is driver's firstname?
> Lee
What is driver's lastname?
> Johns
What is driver's age?
> 18
What is the speed limit (mph)?
> 55
What is driver's speed (mph)?
> 78
Is this a construction zone (Y/N)?
> Y

=========REPORT=========

Driver name: 
    Lee Johns
Age:        
    18 years old
Speed limit:    55 mph
Current speed:  78 mph
Construction zone (Y/N)?: Y
Speeding fine:  $700.00

==========END===========
```
