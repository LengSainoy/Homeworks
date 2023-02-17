## Description

The theatre is getting popular, and the customers started complaining that it's
not practical that the program stops after buying one ticket. Let's add a menu
that will allow them to buy tickets and display the current state of the seating
arrangement when needed.

## Objectives

At the start, your program should read two positive integer numbers that
represent the number of rows and seats in each row. Then, it should print a menu
with the following three items:

- `Show the seats` should print the current seating arrangement. The empty seats
  should be marked with an `S` symbol, and taken seats are marked with a `B`
  symbol.
- `Buy a ticket` should read the seat coordinates from the input and print the
  ticket price like in the previous stage. After that, the chosen seat should be
  marked with a B when the item `Show the seats` is called.
- `Exit` should stop the program.

## Examples

The greater-than symbol followed by a space `(> )` represents the user input.
Note that it's not part of the input.

```text
Enter the number of rows:
> 7
Enter the number of seats in each row:
> 7

1. Show the seats
2. Buy a ticket
0. Exit
> 1

Cinema:
  1 2 3 4 5 6 7
1 S S S S S S S
2 S S S S S S S
3 S S S S S S S
4 S S S S S S S
5 S S S S S S S
6 S S S S S S S
7 S S S S S S S

1. Show the seats
2. Buy a ticket
0. Exit
> 2

Enter a row number:
> 4
Enter a seat number in that row:
> 5
Ticket price: $10

1. Show the seats
2. Buy a ticket
0. Exit
> 1

Cinema:
  1 2 3 4 5 6 7
1 S S S S S S S
2 S S S S S S S
3 S S S S S S S
4 S S S S B S S
5 S S S S S S S
6 S S S S S S S
7 S S S S S S S

1. Show the seats
2. Buy a ticket
0. Exit
> 2

Enter a row number:
> 6
Enter a seat number in that row:
> 6
Ticket price: $10

1. Show the seats
2. Buy a ticket
0. Exit
> 1

Cinema:
  1 2 3 4 5 6 7
1 S S S S S S S
2 S S S S S S S
3 S S S S S S S
4 S S S S B S S
5 S S S S S S S
6 S S S S S B S
7 S S S S S S S

1. Show the seats
2. Buy a ticket
0. Exit
> 0
```