## Description

Running a cinema theatre is no easy business. To help our friends, let's add
statistics to your program. The stats will show the current income, total
income, the number of available seats, and the percentage of occupancy.

In addition, our friends asked you to take care of a small inconvenience: it's
not good when a user can buy a ticket that has already been purchased by another
user. Let's fix this!

## Objectives

Now your menu should look like this:

```text
1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
```

When the item Statistics is chosen, your program should print the following
information:

- The number of purchased tickets;
- The number of purchased tickets represented as a percentage. Percentages
  should be rounded to 2 decimal places;
- Current income;
- The total income that shows how much money the theatre will get if all the
  tickets are sold.

The rest of the menu items should work the same way as before, except the item
`Buy a ticket` shouldn't allow a user to buy a ticket that has already been
purchased.

If a user chooses an already taken seat, print `That ticket has already been
purchased!` and ask them to enter different seat coordinates until they pick an
available seat. Of course, you shouldn't allow coordinates that are out of
bounds. If this happens, print `Wrong input!` and ask to enter different seat
coordinates until the user picks an available seat.

## Examples

The greater-than symbol followed by a space `(> )` represents the user input.
Note that it's not part of the input.