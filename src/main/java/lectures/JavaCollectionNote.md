# Java Collections

## Iterable Interface

part of java.lang any interface & class that implement this. will be able to use forEach loop in
that collection

how to iterate over class the derived iterable interface

```java
import java.util.ArrayList;
import java.util.Arrays;

class IterableDemo {
   public static void main(String[] args) {
      ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3));
      var iterator = numList.iterator();
      // [1, 2, 3]
      //  ^
      while (iterator.hasNext()) { // this is implementation of for each loop
         var current = iterator.next();
         System.out.println(current);
      }
   }
}
```

## Collection Interface

container for other obj

- add(T) Add the object
- remove(T) Remove the object by value of obj
- contains(T) Check existence of the object
- addAll(Collection<T>, T... args) add multiple elements to collection
- size() return number elements in collection
- clear() remove all elements
- isEmpty() check if the collection is empty
- toArray(T[]) convert collection to Array of type T[], if use without param, it will become
  Object[]
- equals() to compare two collection

don't memorize all of these methods. check oracle java documentation instead

### List Interface

extends Collections store sequence collection. can access object by index

have overload method from Collections

- add(index, T) add obj at specific index
- get(index) get obj from specific index
- set(index, T) set obj in specific index to another obj
- remove(index) can remove obj by index
- indexOf(T) return index of first occurrence of `T`. if obj doesn't exist, return `-1`
- lastIndexOf(T) return index of last occurrence of `T`
- subList(fromIndex, toIndex) `fromIndex` is inclusive. `toIndex` is exclusive. return new list so
  original list is not effected

### Comparable Interface

take a look at example of basic class

```java
import java.util.ArrayList;
import java.util.Collections;

class Customer {
   private String name;

   public Customer(String name) {
      this.name = name;
   }
}

class Main {
   public static void main(String[] args) {
      var customerList = new ArrayList<Customer>();
      customerList.add(new Customer("Larry"));
      customerList.add(new Customer("Adam"));
      customerList.add(new Customer("Bobby"));
      // we want to sort this list by customer name
      Collections.sort(customerList); // this will give compilation error
   }
}
```

it will not work. because the new class doesn't implement Comparable Interface so we have to
implement it like this

```java
class Customer implements Comparable<T> {
   private String name;

   public Customer(String name) {
      this.name = name;
   }

   public int compareTo(Customer other) {
      return name.compareTo(other.name);
      // if name < other.name -> return -1 or any negative value
      // name == other.name -> 0
      // name > other.name -> return 1 or any positive value
   }
}

class Main {
   public static void main(String[] args) {
      var customerList = new ArrayList<Customer>();
      customerList.add(new Customer("Larry"))
      customerList.add(new Customer("Adam"));
      customerList.add(new Customer("Bobby"));
      // we want to sort this list by customer name
      Collections.sort(customerList); // this will sort list by customer name
   }
}
```

### Comparator Interface

from example above, what if there is a new email field in Customer class

```java
import java.util.Collections;
import java.util.Comparator;

class Customer implements Comparable<T> {
  private String name;
  private String email;

  public Customer(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public int compareTo(Customer other) {
    return name.compareTo(other.name);
  }

  public String getEmail() {
    return email;
  }
}


// we will need to create a new class that implement Comparator Interface like this
class EmailComparator implements Comparator<Customer> {
  int compare(Customer o1, Customer o2) {
    return o1.getEmail().compareTo(o2.getEmail());
  }
}

class Main {
  public static void main(String[] args) {
    var customerList = new ArrayList<Customer>();
    customerList.add(new Customer("Larry", "abc@test.com"));
    customerList.add(new Customer("Adam", "adjj@test.com"));
    customerList.add(new Customer("Bobby", "bart@test.com"));
    // we want to sort this list by customer name
    Collections.sort(customerList); // this will sort list by customer name
    Collections.sort(customerList,new EmailComparator()); // sort customer by their email
  }
}
```

#### ArrayList

Implementation of dynamic array. resizable

### Queue
official [docs](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html)
extends Collections Interface
Working with queue of object. use with the resource that share amount many consumer. ie. printer
jobs

#### PriorityQueue
queue where each items get priority. item with higher priority move to the front of the queue
let's see the demo.

```java
import java.util.ArrayDeque;
import java.util.Queue;

class QueueDemo {
  public static void show() {
    Queue<String> queue = new ArrayDeque<>();
    queue.add("c");
    queue.add("a");
    queue.add("b"); // if the queue is full, throw exception
    // b -> a -> c    c is at the front of the queue
    queue.offer("d"); // if the queue is full, return false
    // d -> b -> a -> c
    
    var front = queue.peek(); // will return item at the front of the queue, 
    // if queue is empty return null
    queue.element(); // similar to peek(), will throw an exception if queue is empty
    
    var front2 = queue.remove(); // remove item at the front of the queue and return it
    // if queue is empty throw an exception
    // d -> b -> a
    queue.poll(); // similar to remove(), will return null if queue is empty
  }
}

```

### Set
Official [docs](https://docs.oracle.com/javase/8/docs/api/java/util/Set.html)
this collection will only store unique obj. no duplicated item
will NOT guarantee order of item

```java
import java.util.*;

class SetDemo {
  public static void show() {
    Set<String> set = new HashSet<>();
    set.add("sky");
    set.add("is");
    set.add("blue");
    set.add("blue");
    System.out.println(set); // sky, blue, is
  }

  public static void show2() {
    Collections<String> collections = new ArrayList<>();
    Collections.addAll(collections, "a", "b", "c", "d", "c");
    Set<String> set = new HashSet<>(collections); // this will remove duplicate
    System.out.println();
  }
  
  public static void setOperation() {
    Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
    Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));
    
    // Union = combination of 2 set
    set1.addAll(set2);
    System.out.println(set1); // a,b,c,d
    
    // Intersection = get element that common in both sets
    set1.retainAll(set2);
    System.out.println(set1); // b, c
    
    // Difference
    set.removeAll(set2);
    System.out.println(set1); // a
    
  }
}
```

## Map
NOT iterable
```java
import java.util.HashMap;
import java.util.Map;
// Given Customer Class
class Customer implements Comparable<T> {
  private String name;
  private String email;

  public Customer(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public int compareTo(Customer other) {
    return name.compareTo(other.name)
  }

  public String getEmail() {
    return email;
  }
}

class MapDemo {
  public static void show() {
    var c1 = new Customer("a", "e1");
    var c2 = new Customer("b", "e2");
    var unknown = new Customer("Unknow","")

    Map<String, Customer> map = new HashMap<>();
    map.put(c1.getEmail(), c1);
    map.put(c2.getEmail(), c2);
    
    var customer = map.get("e1"); // if key not exist, return null
    System.out.println(customer); // a

    var customer2 = map.get("e10"); // if key not exist, return null
    var customer3 = map.getOrDefault("e10",unknown) // if key not found, will return default value

    var isExist = map.containsKey("e10");
    
    // how to iterate
    for (var key: map.keySet())
      System.out.println(key);
    
    for (var entry: map.entrySet()) {
      System.out.println(entry);
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }
    
    // Note: order not guarantee like Set
  }
}
```