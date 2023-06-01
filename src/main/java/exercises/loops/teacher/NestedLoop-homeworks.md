# Homeworks

# Loop - Extra

## Task - Advanced guessing game

Create number guessing game between 1-100 for 1 player. the program should generate random number
between 1-100. then player keep guessing it until it's correct.

the program should have the following features:

- should ask name of the player
- program should ask what level do player want to play (easy(1), medium(2), hard(3))
- have prompt to ask player to enter and the range of entered number.
  - easy - the guess range should be in between 1-10
  - medium - the guess range should be in between 1-25
  - hard - the guess range should be in between 1-100
```text
What level would you like to play? (easy 1, medium 2, hard 3)
> 2
You've selected medium difficulty.
Guest number between 1 - 25
```
- if the guessing number is wrong, the program will give feedback to player that the guessing number
  is `greater` or `lower` than the winner number and ask player to try again

```
<guess_number> is lower than winner number. Please try again
```

- the new prompt should get update with new range when, player enter the wrong guess
- the program should keep track of the _number of guess_ of the player
- if the player guess number outside the limited range. player should received error message, but _number of guess_
  should still be counted.

```
<guess_number> is invalid number. please try again
```

- if the player guess correct, it should display congratulation message, wining number, and number
  of tries

```
Congrats, You've won. 
The winner number is <winner_number>
Your total guess are <number_of_times> times.
```

> Tip:
> Use `Random` class and `.nextInt(100)` for generate random number between 1-100.

**Example:**

```text
// assuming the winner number is 62
What is your name?
> Leng

Hi Leng, What level would you like to play? (easy 1, medium 2, hard 3)
> 3
You've selected hard difficulty.

Guest number between 1 - 100:
> 50
50 is lower than winner number. Please try again

Guest number between 51 - 100:
> 75
75 is higher than winner number. Please try again

Guest number between 51 - 74:
> 89
89 is invalid number. Please try again

Guest number between 51 - 74:
> 1003
1003 is invalid number. Please try again

Guest number between 51 - 74:
> 62

Congrats Leng, You've won. 
The winner number is 62
Your total guess are 5 times.
```

### Extra: Keeping high score (optional)

- program should always keep record of high score (lowest number of guess)
- each level should have their own high scores. hence you should have 3 high scores
- high score should NOT be mixed for each level.
- after finish the program should prompt player to try again with display the high score of the
  previous game.

```
// use the example above
The best scores are
 - easy difficulty : <number_of_guess> tries
 - medium difficulty : <number_of_guess> tries
 - hard difficulty : <number_of_guess> tried
Would you like to try again. (y/n)
```

- if `y`, player can start play again from the beginning
- if `n`, the program is stop and the high score is reset

---

## Task - Multiplication grid

Write java program that print this on the console

```text
1   2   3   4   5   6   7   8   9  
2   4   6   8   10  12  14  16  18  
3   6   9   12  15  18  21  24  27  
4   8   12  16  20  24  28  32  36  
5   10  15  20  25  30  35  40  45  
6   12  18  24  30  36  42  48  54  
7   14  21  28  35  42  49  56  63  
8   16  24  32  40  48  56  64  72  
9   18  27  36  45  54  63  72  81 
```

## Task - Prime numbers

Write program that can print all prime numbers until the input number

```text
input:
> 20
output:
> 2,3,5,7,11,13,17

input:
> 5
output:
> 2,3,5
```

## Task - Draw shapes

Write the code that can draw these shape dynamically. shape will change according to the user input

### Triangles

```text
input:
> 5
output:
  #1      |     #2      |       #3      |
----------|-------------|---------------|
*         |       *     |       *       |
**        |      **     |      ***      |
***       |     ***     |     *****     |
****      |    ****     |    *******    |
*****     |   *****     |   *********   |
```

### Rectangle

```text
input:
> 4
output:
   #1     |     #2      |      #3
----------|-------------|------------
****      |     ****    |      *
****      |    ****     |     ***
****      |   ****      |    *****
****      |  ****       |   *******
          |             |    *****
          |             |     ***
          |             |      *

input:
> 6
output:
  #1      |     #2          |       #3
----------|-----------------|------------------
******    |       ******    |        *
******    |      ******     |       ***
******    |     ******      |      *****
******    |    ******       |     *******
******    |   ******        |    *********
******    |  ******         |   ***********
          |                 |    *********
          |                 |     *******
          |                 |      *****
          |                 |       ***
          |                 |        *
```

### Other shapes (extras)

```text
input:
> 3
output:
   #1   |     #2
--------|------------
***     |   *****
 ***    |    ***
  ***   |     *
 ***    |    ***
***     |   *****
  
input:
> 5
output:
   #1       |      #2
------------|--------------
*****       |  *********
 *****      |   *******
  *****     |    *****
   *****    |     ***
    *****   |      *
   *****    |     ***
  *****     |    *****
 *****      |   *******
*****       |  *********
```

**Challenge** : Print hollow version of above shapes