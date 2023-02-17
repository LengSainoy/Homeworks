# Control Flow Extra Homework

## Warm-up tasks
- Write program to print all number in reverse in one line (from `n` to 1) - using while loop
  Example:
```text
input: 20
output:
20 19 18 17 16 ... 3 2 1

input: 0
output:
<empty_line>
```
- Write program that count number of digits in number
  Example:
```text
345234
345234 has 6 digits
```
- Write program to print all alphabets with their ASCII values. (lower / uppercase)

## Task E1:

Given a non-negative number "num", return true if num is within 2 of a multiple of 10.

```text
nearTen(12) → true		
nearTen(17) → false		
nearTen(19) → true		
nearTen(31) → true		
nearTen(6) → false		
nearTen(10) → true		
nearTen(11) → true	
```

## Task E2:

When squirrels get together for a party, they like to have cigars. 
A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
Return true if the party with the given values is successful, or false otherwise.

```text
cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
cigarParty(30, true) → false
cigarParty(50, true) → true
cigarParty(60, false) → true
cigarParty(61, false) → false
cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
```

## Task E3:
## Task H: Stylist Date Night

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

## Task E4:
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, 
or return 0 if neither is in that range.

```text
max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11	
max1020(9, 21) → 0	
max1020(10, 21) → 10
max1020(21, 10) → 10
max1020(9, 11) → 11	
max1020(23, 10) → 10
```

## Task M1:

Given 3 int values, a b c, return their sum. However,
if one of the values is 13 then it does not count towards the sum and values.
And All value its right do not count as well.
So for example, if b is 13, then both b and c do not count.

```text
luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1
luckySum(13, 2, 3) → 0
```

## Task M2:

Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
it does not count towards the sum.

```text
loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
```

## Task H1:

We want to make a row of bricks that is `goal` inches long. We have a number of _small bricks_ (1 inch each) and _big
bricks_ (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.

#### Constraint:

- length of small brick is `1`
- length of large brick is `5`

#### Examples:

```text
// makeBricks(small, large, goal)
makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false	
makeBricks(3, 2, 10) → true	
makeBricks(3, 2, 8) → true	
makeBricks(3, 2, 9) → false	
makeBricks(6, 1, 11) → true	
makeBricks(6, 0, 11) → false	
makeBricks(1, 4, 11) → true	
makeBricks(0, 3, 10) → true	
makeBricks(0, 2, 10) → true
```
