## Task - First Half

Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

## Task - Middle Two

Given a string of even length, return a string made of the middle two chars, so the string "string"
yields "ri". The string length will be at least 2.

## Task - Has Bad?

Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "
badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.

## Task - See Color

Given a string, if the string begins with "red" or "blue" return that color string, otherwise return
the empty string.

Example:

```text
Input   : redxx
Output  : red

Input   : xxred
Output  : 

Input   : blueTimes
Output  : blue

Input   : xyzred
Output  : 
```

## Task - Seeing Double?

Given a string, return a string where for every char in the original, there are two chars.

Example:

```text
Input   : The
Output  : TThhee

Input   : AAbb
Output  : AAAAbbbb

Input   : Hi-There
Output  : HHii--TThheerree
```

## Task - Mix String

Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
the second char of a, the second char of b, and so on. Any leftover chars go at the end of the
result.

Example:

```text
Input   : abc xyz
Output  : axbycz

Input   : Hi There
Output  : HTihere

Input   : xxxx There
Output  : xTxhxexre
```

## Task - Repeat Separator

Given two strings, word and a separator sep, return a big string made of count occurrences of the
word, separated by the separator string.

```text
repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
```

## Task - Is Bob There
Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

```text
bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
```
