# This vs Super

- `super` keyword is used to access/call the parent class members (variables and methods).
- `this` keyword is used to call the current class members (variables and methods). this is required
  when we have a parameter with the same name as an instance variable (field).

> Note: We can use both of then anywhere in a class except static contexts (the static block or a static method). Any attempt to do so will lead to compile-time errors

## this keyword

is commonly used with constructors and setters, and optionally in getters (easier for beginners).

```java
class House {
   private String color;

   public House(String color) {
      //this keyword is required, same parameter name as field
      this.color = color;
   }

   public String getColor() {
      // this is an optional
      return color; // same as return this.color;
   }

   public void setColor(String color) {
      //this keyword is required, same parameter name as field
      this.color = color;
   }
}
```

## super keyword

is commonly used with method overriding, when we call a method with the same anme from the parent
class. In the example below we have a method `printMethod()` that calls `super.printMethod()`

```java
class SuperClass {
   public void printMethod() {
      System.out.println("Printed in SuperClass.");
   }
}

class SubClass extends SuperClass {
   // overrides method from parent
   @Override
   public void printMethod() {
      super.printMethod(); // calls method in SuperClass (parent)
      System.out.println("Printed in Subclass");
   }
}

class MainClass {
   public static void main(String[] args) {
      SubClass s = new SubClass();
      s.printMethod();
   }
}
```

## this() vs super() call

- In Java we have `this()` call and the `super()` call. Notice the braces it is known as a call
  since it looks like a regular method call.
- Use `this()` to call a constructor from another overloaded constructor in the same class.
- The call to `this()` can be used only in a constructor, and it must be the first statement in a
  constructor. It's used with constructor chaining, in other words when one constructor calls
  another constructor, and helps to reduce duplicated code.
- The only way to call a parent constructor is by calling `super()`. This calls the parent
  constructor.
- The Java Compiler puts a default call to `super()` if we don't add it, and it is always the
  no-args `super` which is inserted by compiler (constructor without arguments).
- The call to `super()` must be the first statement in each constructor.
- Even Abstract classes have constructors, although you can never instantiate an abstract class
  using the new keyword.
- An abstract class is still a `super` class, so its constructors run when someone makes an instance
  of a concrete subclass.

> Note: A constructor can have a call to `super()` or `this()` but never both

### this() call examples

#### this is bad example

```java
class Rectangle {
   private int x;
   private int y;
   private int width;
   private int height;

   public Rectangle() {
      x = 0;
      y = 0;
      width = 0;
      height = 0;
   }

   public Rectangle(int width, int height) {
      x = 0;
      y = 0;
      this.width = width;
      this.height = height;
   }

   public Rectangle(int x, int y, int width, int height) {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
   }
}
```

#### Good Example

```java
class Rectangle {
   private int x;
   private int y;
   private int width;
   private int height;

   public Rectangle() { // 1st constructor
      this(0, 0); // calls 2nd constructor
   }

   public Rectangle(int width, int height) { // 2nd constructor
      this(0, 0, width, height); // calls 3rd constructor
   }

   public Rectangle(int x, int y, int width, int height) { //3rd constructor
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
   }
}
```

### super() call example

```java
class Shape {
   private int x;
   private int y;

   public Shape(int x, int y) {
      this.x = x;
      this.y = y;
   }
}

class Rectangle extends Shape {
   private int width;
   private int height;

   public Rectangle(int x, int y) { // 1st constructor
      this(x, y, 0, 0); // call 2nd constructor
   }

   public Rectangle(int x, int y, int width, int height) {
      super(x, y); // calls constructor from parent (Shape)
      this.width = width;
      this.height = height;
   }
}
```
