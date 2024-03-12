## Description 
Good job: our friends really liked your program! Now they want to
expand their cinema and add screen rooms with more seats. However, this is
expensive, so they want to make sure this will pay off. Help them calculate the
profit from all the sold tickets depending on the number of available seats.

## Objectives 
In this stage, you need to read two positive integer numbers from the
input: the number of rows and the number of seats in each row. The ticket price
is determined by the following rules:

- If the total number of seats in the screen room is **not more than 60**, then the
price of each ticket is **10 dollars**. 
- In a larger room, the tickets are **10 dollars**
for the **front half of the rows** and **8 dollars** for the **back half**. _Please note that
the number of rows can be odd, for example, 9 rows. In this case, the first half
is the first 4 rows, and the second half is the other 5 rows._ 

Calculate the profit from the sold tickets depending on the number of seats 
and print the result as shown in the examples below. After that, your program should stop.
Note that in this project, the number of rows and seats won't be greater than 9.

## Examples
The greater-than symbol followed by a space `(> )` represents the user input. 
Note that it's not part of the input.
###Example 1
```text
Enter the number of rows:
> 4
Enter the number of seats in each row:
> 5
Total income:
$200
```
###Example 2
```text
Enter the number of rows:
> 9
Enter the number of seats in each row:
> 7
Total income:
$560
```