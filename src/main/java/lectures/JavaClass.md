# Object and Class in Java

## Object:

An object is an identifiable entity with some characteristics, state and behavior. Understanding the
concept of objects is much easier when we consider real-life examples around us because an object is
simply a real-world entity.

You will find yourself surrounded by the number of objects which have certain characteristics and
behaviors.

_For example, we can say ‘Orange’ is an object. Its characteristics are: spherical in shape and
color is orange. Its behavior is: juicy and tastes sweet-sour._

## Class:

A class is a group of objects that share common properties and behavior. it should define as 
single entity.

For example, we can consider a car as a class that has characteristics like steering wheels, seats,
brakes, etc. And its behavior is mobility. But we can say Honda City having a reg.number 4654 is an
‘object’ that belongs to the class ‘car’.

It was a brief description of objects and classes. Now we will understand the Java class in detail.

## Declaration of Java Classes

In order to bring class into existence, we should declare it. We can declare a class with the use of
a class keyword.

The components of the Java Class declaration are –

1. **Access Modifiers** – We can access Java classes using any access modifiers such as public,
   private, protected and default.
2. **Class Name** – In Java, the class name generally represents nouns which should begin with a
   capital letter without any spaces.
3. **Superclass (if any)** – The name of the parent class is a superclass and its child class is a
   subclass, and child class inherits the properties of a parent using the extends keyword. A
   subclass can only inherit a single parent.
4. **Interfaces (if any)** – To declare an interface, we just write the keyword interface followed
   by the interface name.
5. **Class Body** – The class body follows the class declaration and embeds within curly braces `{}`
   .

## In Class body
there are 2 things that class could have
- **variable** (attribute | property | field) when in the class they will be called **instance variable**. it 
  can be any type, can have as many as you want
- **method** (behavior | function) 

Accessing the members of a Java Class We can access the data members of a class using the object of
the class. We just write the name of the object which is followed by a dot operator then we write
the name of the data member (either variables or methods) which we want to access.

**The syntax for declaring simple class:**

```java
class Student {
   String name;
   int age;

   void display() {
      //method body;
   }
}
```

## Creating Objects from a Java class

We know that an object is an instance of a class. To create an object of a class, first, we need to
declare it and then instantiate it with the help of a `new` keyword.

**Syntax of creating an object of a class:**

To create an object of a class, specify the class name, followed by the object name, by using the
new keyword –

```java
ClassName objectName=new ClassName();
```

## Accessing the members of a Java class

We can access the data members of a class using the object of the class. We just write the name of
the object which is followed by a dot (`.`) operator then we write the name of the data member
(either variables or methods) which we want to access.

**Syntax to access member and method**

```java
   objectName.variableName; //accessing the variables 
   objectName.MethodName(); //accessing the methods
```

Code snippet to understand the usage of Java Class and Object:

```java
//creating a class named City
public class City {
   //declaring class variables
   public String name;
   public long population;

   //defining the method of the class
   public void display() {
      System.out.println("City name: " + name);
      System.out.println("Population: " + population);
   }

   public static void main(String args[]) {
//declaring the objects of the class City
      City metro1, metro2;
//Instantiating the objects of the class using the new keyword
      metro1 = new City();
      metro2 = new City();
      metro1.name = "Delhi";
      metro1.population = 10000000;
      System.out.println("Details of metro city 1:");
      metro1.display(); //display() method is being invoked for the object metro1
      metro2.name = "Bangalore";
      metro2.population = 5000000;
      System.out.println("Details of metro city 2:");
      metro2.display(); //display() method is being invoked for the object metro2
   }
}
```

### Output:

```text
Details of metro city 1:
City name: Delhi Population: 10000000 Details of metro city 2:
City name: Bangalore Population: 5000000
```

## The `this` keyword

`this` is a keyword in Java which is used as a reference to the object of the current class, with in
an instance method or a constructor. Using this you can refer the members of a class such as
constructors, variables and methods.

**Note** − _The keyword this is used only within instance methods or constructors_
![](day27_7thReview/JavaMethodNote/referalPics/img.png)
In general, the keyword `this` is used to −

- Differentiate the instance variables from local variables if they have same names, within a
  constructor or a method.

```java
class Student {
   int age;

   Student(int age) {
      this.age = age;
   }
} 
```

- Call one type of constructor (parametrized constructor or default) from other in a class. It is
  known as explicit constructor invocation.

```java
class Student {
   int age

   Student() {
      this(20);
   }

   Student(int age) {
      this.age = age;
   }
}
```

**Example**

Here is an example that uses `this` keyword to access the members of a class. Copy and paste the
following program in a file with the name, `This_Example.java.`

```java
public class This_Example { // Instance variable num 
   int num = 10;

   This_Example() {
      System.out.println("This is an example program on keyword this");
   }

   This_Example(int num) { // overloaded constructor
      // Invoking the default constructor 
      this();
      // Assigning the local variable num to the instance variable num
      this.num = num;
   }

   public void greet() {
      System.out.println("Hi Welcome to TechCircle");
   }

   public void print() {
      // Local variable num 
      int num = 20;

      // Printing the local variable
      System.out.println("value of local variable num is : " + num);

      // Printing the instance variable
      System.out.println("value of instance variable num is : " + this.num);

      // Invoking the greet method of a class
      this.greet();
   }

   public static void main(String[] args) {
      // Instantiating the class 
      This_Example obj1 = new This_Example();

      // Invoking the print method
      obj1.print();

      // Passing a new value to the num variable through parametrized constructor
      This_Example obj2 = new This_Example(30);

      // Invoking the print method again
      obj2.print();
   }
} 
```

This will produce the following result −

Output

```text
This is an example program on keyword this 
value of local variable num is : 20 
value of instance variable num is : 10 
Hi Welcome to TechCircle 
This is an example program on keyword this 
value of local variable num is : 20 
value of instance variable num is : 30 
Hi Welcome to TechCircle
```

## Reference vs Object vs Instance vs Class
Let's use the analogy of building a house to understand Classes.
- A **class** is basically a blueprint for a house, using the blueprint (plans) we can build as 
  many houses as we like based on those plans.
- Each house you build (in other words **instantiate** using the `new` operator) is an **object** also 
  known as an **instance**
- Each house you build has an address (a physical location). In other words if you want to tell 
  someone where you live, you give them your address (perhaps written on a piece of paper). This 
  is known as a **reference**.
- You can copy that reference as many times as you like but there is still just one house. In 
  other words we are copying the paper that has address on ity not the house itself.
- We can pass **references** as **parameters** to **constructors** and **methods**

```java
class House {
   private String color;
   public House(String color) {
      this.color = color;
   }
   public String getColor() {
      return color;
   }
   public void setColor(String color) {
      this.color = color;
   }
}

public class Main {
   public static void main(String[] args) {
      House blueHouse = new House("blue");
      House anotherHouse = blueHouse;

      System.out.println(blueHouse.getColor());
      System.out.println(anotherHouse.getColor());
      
      anotherHouse.setColor("red");
      System.out.println(blueHouse.getColor());
      System.out.println(anotherHouse.getColor());

      House greenHouse = new House("green");
      anotherHouse = greenHouse;

      System.out.println(blueHouse.getColor());
      System.out.println(greenHouse.getColor());
      System.out.println(anotherHouse.getColor());
   }
}
```

Reference:

- [Techvidvan](https://techvidvan.com/tutorials/java-class/#:~:text=A%20class%20is%20a%20non,the%20nature%20of%20an%20object.)
- [Tutorialspoint](https://www.tutorialspoint.com/java/java_methods.htm#)
- [geeksforgeeks.org](https://www.geeksforgeeks.org/classes-objects-java/)