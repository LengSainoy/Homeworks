# Java Collections Tasks

## Task - A

Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all
cases remove the key "c", leaving the rest of the map unchanged.

```text
mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
```

## Task - B

Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a
value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".

```text
topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
```

## Task - C

Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "
c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the
map.

```text
mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
```

## Task - D
**This will come up in interview a lot
The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different
string, with the value the number of times that string appears in the array.

```text
wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
```

## Interview Question - Common Key

Find the common keys. Once you find the common keys, print out its respective values from each map.

### Example 1 
```text
Input: 
HM1 = { 1="x", 2="y", 3="z"};
HM2 = { 3="A", 4="B", 5="C", 6="D"};

Output:
3z 3A
```

### Example 2
```text
Input:
HM1 = { 0="apple", 100="orange", 50="banana"};
HM2 = { 0="dog",1="cat",15="tiger",50="bear"};

Output:
0apple 0dog 50banana 50bear
```

## Interview Question - Calculate click by domain

You are in charge of a display advertising program. Your ads are displayed on websites all over the
internet. You have some CSV input data that counts how many times that users have clicked on an ad
on each individual domain. Every line consists of a click count and a domain name, like this:

```text
counts = [ 
"900,google.com",
"60,mail.yahoo.com",
"10,mobile.sports.yahoo.com",
"40,sports.yahoo.com",
"300,yahoo.com",
"10,stackoverflow.com",
"20,overflow.com",
"5,com.com",
"2,en.wikipedia.org",
"1,m.wikipedia.org",
"1,mobile.sports",
"1,google.co.uk"
]
```

Write a function that takes this input as a parameter and returns a data structure containing the
number of clicks that were recorded on each **domain** AND each **subdomain** under it. 

For example, a click on "mail.yahoo.com" counts toward the totals for "mail.yahoo.com", "yahoo.com", and "com". (
Subdomains are added to the left of their parent domain. So "mail" and "mail.yahoo" are not valid
domains. 

Note that "mobile.sports" appears as a separate domain near the bottom of the input.)

Sample output (in any order/format):

calculateClicksByDomain(counts) =>

```text
com:                     1345 
google.com:              900 
stackoverflow.com:       10 
overflow.com:            20 
yahoo.com:               410 
mail.yahoo.com:          60 
mobile.sports.yahoo.com: 10
sports.yahoo.com:        50 
com.com:                 5 
org:                     3 
wikipedia.org:           3 
en.wikipedia.org:        2 
m.wikipedia.org:         1 
mobile.sports:           1 
sports:                  1 
uk:                      1 
co.uk:                   1 
google.co.uk:            1
```

n: number of domains in the input
(individual domains and subdomains have a constant upper length)

## Interview Question - Device Names

assuming you building a program that can rename the device name for wifi connection. Because of Wifi, all devices name
cannot be duplicate.
if your program find the duplicate name (2nd or more). you program should append a digit to that device name.

```text
input:
[fan,tv,tv,oven,laptop,phone,tv]
output:
[fan,tv,tv1,oven,laptop,phone,tv2]

input:
[a,a,a,b,c,c,a]
output:
[a,a1,a2,b,c1,c2,a3]
```

**Constraint:**

- The maximum connect devices cannot exceed 50

## Interview Question - Longest Substring

Given a string `s`, find the length of the longest substring without repeating characters.

### Example 1:
```text
input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3
```

### Example 2:
```text
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1
```

### Example 3:
```text
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3
```

Notice that the answer mush be a substring, "pwke" is a subsequence and not a substring.

### Constraints:
- 0 <= s.length <= 5 * 100000
- s consists of English letters, digits, symbols and spaces.

# Interview Question - Stock price

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to
sell that stock. We are only permitted to complete only one transaction(buy one or sell one share of the stock) per day.

Write a Java function to find the maximum profit.

Note:
- A stock can't be sold before buying

### Example 1
```text
Input: [15,3,3,1,8,11,12,11,1]
Output: 11

Explanation:
Buy on day 4 (price = 1) and sell on day 7 (price = 12), profit = 12 - 1 = 11
Not 15-1 = 14, as the selling price needs to be larger than buying price.
```

### Example 2
```text
Input: [100,20,35,37,59,30,58]
Output: 39

Explanation:
Buy on day 2 (price = 20) and sell on day 5 (price = 59), profit = 39
```