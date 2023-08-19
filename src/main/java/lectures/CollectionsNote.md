# Collections

## Introduction

## So far

- Iterable Interface
- Collection Interface
- List Interface -> ArrayList

## Queue Interface

extends Collections Interface use to process jobs in the order they're received. (ex. printer)

### Documentation

[here](https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html)

### PriorityQueue class

#### Methods

|   |Throw exception|Return special Value|
|---|---|---|
|Insert|`add(e)`|`offer(e)`|
|Remove|    `remove()`|    `poll()`|
|Examine|    `element()`|    `peek()`|

## Set Interface

it's collection that contain no duplicates. great way to store list of unique values.

### Documentation

[here](https://docs.oracle.com/javase/8/docs/api/java/util/Set.html)

### HashSet

only contain unique values, but the order will not guarantee.

```java
import java.util.Arrays;
import java.util.HashSet;

public class SetDemo {
   public static void main(String[] args) {
      Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
      Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));
   }
}
```

### Set Operations

**Union** Operation = `.addAll()`

```text
before:
set1 =  a, b, c
set2 =     b, c, d

after:   
set1 =  a, b, c, d
```

**Intersection** Operation = `retainAll()` get element(s) that common on both set

```text
before:
set1 =  a, b, c
set2 =     b, c, d

after:   
set1 =  b, c
```

**Difference** Operation = `removeAll()` to remove everything in `set2` and keep the rest.

```text
before:
set1 =  a, b, c
set2 =     b, c, d

after:   
set1 =  a
```

## Hash Tables

is a data structure in computer science.

let's see the problem with list

```java
import java.util.ArrayList;

public class MapDemo {
   public static void main(String[] args) {
      List<Customer> customers = new ArrayList<>();
      findCustomerByEmail(customers, "leng@gmail.com")
   }

   // let's write algorithm to find customer by email from this list
   public static Customer findCustomerByEmail(List<Customer> customerList, String email) {
      // O(n) - big O notation, `n` is number of items in the list.
      for (var customer : customerList) {
         if (customer.getEmail().equalsIgnoreCase(email)) {
            System.out.println("Found");
            return customer;
         }
      }
      return null;
   }
}
```

the worst case the customer that we're looking for is at the end of the list. if we have list of
size 100000. We have to loop and compare data 100000 times to find the single customer.

with Hash Table, it doesn't matter how big of the collection is. it only compares the Key then
return the value (O(1))

Collections that Implement Hash Table in each language

- Java : Maps
- C#: Dictionary
- Python: Dictionary
- JavaScript: Objects

## Map Interface

Collections in java.util package, but it's not from Iterable Hierarchy. It's mapping key to a
value <K,V>

let's try with similar example

```java
import java.util.*;

public class MapDemo {
   public static void main(String[] args) {
      var c1 = new Customer("a", "e1.com");
      var c2 = new Customer("b", "e2.com");
      Map<String, Customer> map = new HashMap<>();
      map.put(c1.getEmail(), c1);
      map.put(c2.getEmail(), c2);
   }

   // let's write algorithm to find customer by email from the map
   public static Customer findCustomerByEmail(Map<String, Customer> customerList, String email) {
      return customerList.get(email);
   }
}
```

### Method

- `.put(key,value)` add data to map
- `.get(key)` retrieve value from map with matching key. it will return null if key doesn't exist
- `.getOrDefault(key,E)`  retrieve value from map with matching key. if key doesn't exist, it will
  return default value
- `.containsKey()` return a `boolean`, key is exist or not.
- `.replace(key,value)` will update a key with value args.
- `.keySet()` return Set of key.
- `.entrySet()` return Set of Entry
- `.values()` return collections for values

### Map is not iterable

```java
class MapDemo {
   public static void main(String[] args) {
      var c1 = new Customer("a", "e1.com");
      var c2 = new Customer("b", "e2.com");
      Map<String, Customer> map = new HashMap<>();
      map.put(c1.getEmail(), c1);
      map.put(c2.getEmail(), c2);

      // for (Customer c : map) // this will not work
      for (var key : map.keySet())
         System.out.println(k + " = " + map.get(k));

      for (var entry : map.entrySet()) {
         System.out.println(entry); // key=value
         System.out.println(entry.getKey()); // will return only key
         System.out.println(entry.getValue()); // will return only value
      }
   }
}
```

## Summary

## Exercise

### Task: Topping1

Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".

```text
topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
topping1({}) → {"bread": "butter"}
topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
```

### Task: Topping2

Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".
```text
topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
```

### Task: Word Count

The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.
```text
wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
```