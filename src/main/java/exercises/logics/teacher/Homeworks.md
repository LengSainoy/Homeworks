# Control Flow - Homeworks

## Task E1

Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

```text
makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
makes10(12, -2) → true
```

## Task M1

Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.

```text
close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
```

## Task M2

Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50
inclusive.

```text
in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
```

## Task M3

Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50
inclusive.

```text
in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
in3050(40, 51) → false
in3050(39, 50) → false
in3050(50, 39) → false
in3050(40, 39) → true	
in3050(49, 48) → true	
in3050(50, 40) → true	
```