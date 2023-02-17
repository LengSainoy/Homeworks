# Extra Homeworks



## Task - Find sum of multiple

Write program to create array from 2 specific numbers

```text
arrayFromRange(1,5) => [1,2,3,4,5]
arrayFromRange(-8,-5) => [-8,-7,-6,-5]
arrayFromRange(10,10) => [10]
arrayFromRange(100,1) => []
```

## Task - Sum of Average

Write program to find sum of average of 2 dimensional array

```text
sumOfAverage([2,3],[5],[0,1,2,3]] => 9.0
sumOfAverage([-5,5], [-3,5,9,10], [4,5,6,-1],[20]]) => 55.0
```

## Task - Max of divisible by 4

You are given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible
by 4. As input, the program gets the number of elements in the sequence, and then the elements
themselves.

In the sequence, there is always an element divisible by 4. The number of elements does not exceed `1000`. The program
should print a single number: the maximum element of the sequence divisible by 4.

Examples:

```
[8,63,12,10,64,12,36,77,16]  => 64
[98, 104, 46, 22, 209] => 104
```

## Task - Count before 0

For its input, the program gets a sequence of non-negative integers array. The sequence ends with an integer `0` when 
the program reads 0, it should end its work

and output the length of the sequence (not counting the final 0).

Don’t read numbers following the number 0.

Examples:

```text
[1,7,9,0,5,10] => 3
[1,7,0,1,2,3] => 2
[0,1,900,20,0] => 0
```