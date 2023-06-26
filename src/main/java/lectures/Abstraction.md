# Abstraction

The meaning of the word “Abstraction”, in general words, is the process of working with ideas rather than their
implementation.

What, not How

In Java, we can achieve Data Abstraction using Abstract classes and interfaces.
Interfaces allow 100% abstraction (complete abstraction). Interfaces allow you to abstract the implementation
completely.

Abstract classes allow 0 to 100% abstraction (partial to complete abstraction) because abstract classes can contain
concrete methods that have the implementation which results in a partial abstraction.

## Abstract Class

- An `Abstract` class is a class whose objects can’t be created. An Abstract class is created through the use of
  the `abstract` keyword. It is used to represent a concept.
- An abstract class can have `abstract` methods (methods without body) as well as non-abstract methods or concrete
  methods (methods with the body). A non-abstract class cannot have abstract methods.
- The class has to be declared as abstract if it contains at least one abstract method.
- An abstract class does not allow you to create objects of its type. In this case, we can only use the objects of its
  subclass.
- Using an abstract class, we can achieve 0 to 100% abstraction.
- There is always a default constructor in an abstract class, it can also have a parameterized constructor.
- The abstract class can also contain final and static methods.

### Abstract Methods in Java

- Abstract methods are methods with no implementation and without a method body. They do not contain any method
  statement.
- An abstract method is declared with an abstract keyword.
- The declaration of an abstract method must end with a semicolon ;
- The child classes which inherit the abstract class must provide the implementation of these inherited abstract
  methods.

### Example of Abstract Class & Abstract method

```java
abstract class BaseClass {
    //abstract method
    abstract public void show1();

    //concrete method
    public void show2() {
        System.out.println("Concrete method of parent class");
    }
}

//child class
class ChildClass extends BaseClass {
    // Must Override this method while extending the Parent class
    public void show1() {
        System.out.println("Overriding the abstract method of the parent class");
    }

    //Overriding concrete method is not compulsory
    public voidshow2() {
        System.out.println("Overriding concrete method of the parent class");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        /* we can't create object of the parent class hence we are creating object of the child class */
        ChildClass obj = new ChildClass();
        obj.show1();
        obj.show2();
    }
}
```

### Why do we need Abstract Classes

To answer this question, let’s take a situation where we want to create a class that just declares the general form or
structure or guidelines of a particular idea, without giving a complete implementation of every method.

And, we want that this generalized form or structure of the class can be used by all of its child classes, and the child
classes will impose these guidelines by fulfilling all the implementation details according to the need.

**Example**

```java
abstract class GeometricShapes {
    String nameOfShape;

    //abstract methods
    abstract double calculateArea();

    public abstract String toString();

    //constructor
    public GeometricShapes(String nameOfShape) {
        System.out.println("Inside the Constructor of GeometricShapes class ");
        this.nameOfShape = nameOfShape;
    }

    //non-abstract method
    public String getNameOfShape() {
        return nameOfShape;
    }
}

class Circle extends GeometricShapes {
    double radius;

    public Circle(String nameOfShape, double radius) {
        super(nameOfShape);
        System.out.println("Inside the Constructor of Circle class ");
        this.radius = radius;
    }

    //implementing the methods
    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Name of the shape is " + super.nameOfShape +
                " and its area is: " + calculateArea();
    }
}

class Square extends GeometricShapes {
    double length;

    public Square(String nameOfShape, double length) {
        //calling Shape constructor
        super(nameOfShape);
        System.out.println("Inside the Constructor of Square class ");
        this.length = length;
    }

    //implementing the methods
    @Override
    double calculateArea() {
        return length * length;
    }

    @Override
    public String toString() {
        return "Name of the Shape is " + super.nameOfShape +
                " and its area is: " + calculateArea();
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        GeometricShapes shapeObject1 = new Circle("Circle", 6.5);
        System.out.println(shapeObject1.toString());
        GeometricShapes shapeObject2 = new Square("Rectangle", 8);
        System.out.println(shapeObject2.toString());
    }
}
```

### Type of Abstraction in Java

1. **Data abstraction** is the most common type of abstraction in which we create complex data types such as HashMap or
   HashSet, and hide its implementation details from the users and display only the meaningful operations to interact
   with the data type.

The benefit of this approach solves the performance issues and improves the implementation over time. Any changes which
occur while improving the performance, do not reflect on the code present on the client-side.

2. **Control abstraction** is the process of determining all such statements which are similar and repeat over many
   times
   and expose them as a single unit of work. We normally use this type of abstraction is when we want to create a
   function to perform any given task.

### Data Encapsulation vs Data Abstraction in Java

- Encapsulation is one step beyond abstraction.
- Data Encapsulation is hiding data or information while Abstraction is hiding the implementation details.
- Encapsulation binds the data members and methods together while data abstraction deals with showing the external
  details of an entity to the user and hiding the details of its implementation.
- Abstraction provides access to a specific part of data while encapsulation hides the data.
