# Static & Instance
## Methods
### Static Methods

- **Static methods** are declared using a **static** modifier.
- **Static method cannot** access **instance methods** and **instance variables** directly.
- They are usually used for operations that don't require any data from an **instance** of the class
  (from `this`)

> Note: `this` = current instance of a class

- In **static methods** we can't use the `this` keyword.
- Whenever you see a method that does NOT use instance variables that method should be declared as a
  static method.
- For example main is a static method, and it is called by the JVM when it starts an applications.

Static Method Example:

```java
class Calculator {
   public static void printSum(int a, int b) {
      System.out.println("sum = " + (a + b));
   }
}

public class Main {
   public static void main(String[] args) {
      Calculator.printSum(5, 10);
      printHello();
   }

   public static void printHello() {
      System.out.println("Hello");
   }
}
```

### Instance Methods

- **Instance methods** belong to an instance of a class.
- To use an **instance method** we have to instantiate the class first usually by using the `new`
  keyword.

- **Instance methods** can access instance methods and instance variables directly
- **Instance methods** can also access static methods and static variables directly

Instance Method Example:

```java
class Dog {
   public void bark() {
      System.out.println("woof");
   }
}

public class Main {
   public static void main(String[] args) {
      Dog rex = new Dog(); // create an instance
      rex.bark(); // call instance method
   }
}
```

###Static or Instance Method?
Should a method be static?

Does it use any fields (instance variables) or instance methods?
```text
if (yes) {
  it should probably be an instance method
} else {
  it should probably be a static method
}
```

##Variable
###Static Variable
- Declare by using the keyword `static`
- **Static variable** are also known as **static member variables**
- Every instance of that class **shares** the same static variable.
- If changes are made to that variable, all other instance will see the effect of the change.
- **Static variables** are not used very often but can sometimes be very useful.

Static Variable Example
```java
class Dog {
   private static String name;
   public Dog(String name) {
      Dog.name = name;
   }
  public void printName() {
    System.out.println("name = "+name);
  }
}

public class Main {
  public static void main(String[] args) {
    Dog rex = new Dog("rex"); // create an instance (rex)
    Dog trigger = new Dog("trigger"); // create an instance (trigger)
    rex.printName(); // print trigger
    trigger.printName(); // print trigger
  }
}
```

###Instance Variables
- don't use `static` keyword
- **Instance variables** are also known as **fields** or **member variables**.
- **Instance variables** belong to an instance (object) of a class
- Every instance has its own copy of an instance variable.
- Every instance can have a different value (state).
- Instance variables represent the state of an instance.
- you can access instance variables in its own class by using `this` keyword

Instance Variable Example:
```java
class Dog {
  private String name;
  public Dog(String name) {
    this.name = name;
  }
  public void printName() {
    System.out.println("name = "+name);
  }
}

public class Main {
  public static void main(String[] args) {
    Dog rex = new Dog("rex"); // create an instance (rex)
    Dog trigger = new Dog("trigger"); // create an instance (trigger)
    rex.printName(); // print rex
    trigger.printName(); // print trigger
  }
}
```
