# Extra Homeworks

## Task - Find sum of multiple

Write program to create array from 2 specific numbers 
only when the first arg is less than the second arg.
if other way around return empty array instead
output array should be in ascending order 

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

## Task - Median of two sorted array
Given two sorted array `num1` and `num2`, return the *median* of the two sorted arrays.

#### Example 1:
```text
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2
```

#### Example 2:
```text
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2+3) / 2 = 5
```

#### Constraints:
- 0 <= nums1.length <= 1000
- 0 <= nums2.length <= 1000

## Task - Single Number
Given a **non-empty** array of integers `nums`. every element appears twice except for one. Find that single one. 

#### Example 1:
```text
Input: nums = [2,2,1]
Output: 1
```

#### Example 2:
```text
Input: nums = [4,1,2,1,2]
Output: 4
```

#### Example 3:
```text
Input: nums = [1]
Output: 1
```

## Task - Longest common prefix
Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, 
return empty string.

#### Example 1:
```text
input: strs = ["flower","flow","flight"]
Output: "fl"
```

#### Example 2:
```text
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
```

#### Example 3:
```text
input: strs = ["techcircle","technology","technician"]
Output: "tech"
```