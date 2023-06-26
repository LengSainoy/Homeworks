# Interface in Java

An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. An
interface in Java is a blueprint of a class.

A Java interface contains `static` constants and `abstract` methods.

- Interfaces specify what a class must do and not how. It is the blueprint of the class.
- An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able
  to (or must implement) move(). So it specifies a set of methods that the class has to implement.
- If a class implements an interface and does not provide method bodies for all functions specified in the interface,
  then the class must be declared abstract.
- A Java library example is Comparator Interface. If a class implements this interface, then it can be used to sort a
  collection.
- Interface naming convention
    - prefix with `I`, `Can`
    - suffix with `Interface`, `able`

```java
interface DemoInterface {
    // declare constant fields
    // declare methods that abstract 
    // by default.   
}
```

## Why do we use an Interface?

- It is used to achieve total abstraction.
- Since java does not support multiple inheritances in the case of class, by using an interface it can achieve multiple
  inheritances.
- It is also used to achieve loose coupling.
- Interfaces are used to implement abstraction. So the question arises why use interfaces when we have abstract classes?

Real World Example

```java
// Java program to demonstrate the
// real-world example of Interfaces

interface Vehicle {

    // all are the abstract methods.
    void changeGear(int a);

    void speedUp(int a);

    void applyBrakes(int a);
}

class Bicycle implements Vehicle {

    int speed;
    int gear;

    // to change gear
    @Override
    public void changeGear(int newGear) {

        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment) {

        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement) {

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}

class Bike implements Vehicle {

    int speed;
    int gear;

    // to change gear
    @Override
    public void changeGear(int newGear) {

        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment) {

        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement) {

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}

class GFG {

    public static void main(String[] args) {

        // creating an instance of Bicycle
        // doing some operations
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state :");
        bicycle.printStates();

        // creating instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state :");
        bike.printStates();
    }
}
```

## New Features Added in Interfaces in JDK 8

Prior to JDK 8, the interface could not define the implementation. We can now add default implementation for
interface methods. This default implementation has a special use and does not affect the intention behind interfaces.

```java
// Java program to show that interfaces can
// have methods from JDK 1.8 onwards

interface In1 {
    final int a = 10;

    default void display() {
        System.out.println("hello");
    }
}

// A class that implements the interface.
class TestClass implements In1 {
    // Driver Code
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
    }
}
```

## Abstract Class Vs Interface

- abstract class use when you want to use abstract method with similar & relate class
- interface, use when you want implement method to subclass that not related.  Animal & Human both can poop()

## Summary
- Like abstract class, we can’t create an instance(interface can’t be instantiated) of the interface but we can make the
  reference of it that refers to the Object of its implementing class.
- A class can implement more than one interface.
- An interface can extend to another interface or interface (more than one interface).
- A class that implements the interface must implement all the methods in the interface.
- All the methods are public and abstract. And all the fields are public, static, and final.
- It is used to achieve multiple inheritances.
- It is used to achieve loose coupling.