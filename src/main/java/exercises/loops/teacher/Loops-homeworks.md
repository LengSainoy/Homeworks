# Control Flow Statement Homework

## Task A:

Write a Java program to convert seconds to hour, minute and seconds.

```text
Input: 
86399
Output: 
23:23:59
```

## Task B:

Create a class called `SalaryCalculator`
- declare the following variables:
   hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
- use the given info in above variables to calculate the followings:
   * salaryBeforeTax
   * stateTax
   * federalTax
   * totalTax
   * salaryAfterTax
- use print statement to print each of the above

```text
input:
hourlyRate = $50
weeklyHours = 45
stateTaxRate = 6 (given as percentage, you need to convert to decimal)
federalTaxRate = 26 (given as percentage, you need to convert to decimal)
output:
Gross pay is: $117000
Federal tax is: $30420
State tax is: $7020
Total tax is: $37440
Net income is: $79560
```

### Tips

- salaryBeforeTax = hourlyRate * weeklyHour * 52

## Task C:

Write a program that can calculate the salary after tax based on the following requirements
the tax rates are:
35% for salary of 130K or more
30% for salary of 100K to 130k (excluded)
25% for salary of 80K to 100K (excluded)
20% for salary less than 80K
in addition, if the person is married, he/she will pay 5% less tax

## Task D:

Write a program that asks the user to enter a number for 5 times.
and return the maximum number

## Task E:

Write a method which prints out the numbers from 1 to 100 but for numbers which are divisible both
3 and 5, print "FINRA" instead of the number, for numbers which are divisible by 3, print "FIN" instead of the number
and for numbers which are divisible by 5, print "RA" instead of the number.

```text
output:
1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ... 100
```

## Task F:

Write a program that can return the factorial number of any given number

```text
input: 5
output: 120
```

#### Explanation:

because:
5!
5 * 4 * 3 * 2 * 1 = 120

## Task G:
Write a program that can find sum of multiple of 3 and 5. Start from 0 to n. 
```text
sumOfMultipleOf3N5(10) -> 33
sumOfMultipleOf3N5(20) -> 98
```