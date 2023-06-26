# Overriding Vs Overloading

## Method Overloading

- means providing two or more separate methods in a class with the **same name** but **different
  parameters**
- Method return type may or may not be different and that allows us to **reuse** the same method
  name.
- reduces duplicated code, and we don't have to remember multiple method names
- **Overloading** happens at to compile time
- In other words the compiler decided which method is going to be called based on the method name,
  return type and argument list.
- We can overload **static** and **instance** methods.
- Usually **overloading** happens inside a single class, but a method can also be treated as **
  overloaded**
  in the subclass of that class.
- That is because a **subclass inherits** one version of the method from the parent class and then
  the subclass can have another overloaded version of the method.

### Method Overloading Rules

- Methods must have the same method name.
- Methods must have different parameters

if the methods follow the rules above then they may or may not

- have different return types
- have different access modifiers
- throw different checked or unchecked exceptions

## Method Overriding

- means defining a method in a child class that already exists in the parent class with same
  signature (same name, same arguments)
- By deriving the parent class the child class get all the methods defined in the parent class.
  (also known as derived methods)
- **Method overriding** is also known as **Runtime Polymorphism**, because the method that is going
  to be called is decided at the runtime by the JVM.
- When **override** a method it's recommended to put `@Override` immediately above the method
  definition. this show us an error if we don't follow overriding rules correctly.
- We **cannot override** static methods.

### Method Overriding Rules

- it must have same name and same arguments.
- return type can be a subclass of the return type in the parent class
- it can't have a lower access modifier

> For example: if the parent method is protected then using private in the child is not allowed
> but using public in the child would be allowed

- only inherited methods can be overridden, in other words methods can be overridden only in the
  child classes
- Constructor and Private methods cannot be overridden
- Method that are final cannot be overridden
- A subclass can use `super.methodName()` to call the superclass version of an overridden method

## Examples

### Overriding

```java
class Dog {
   public void bark() { // same signature
      System.out.println("woof");
   }
}

class GermanShepherd extends Dog {
   @Override
   public void bark() { // same signature
      System.out.println("woof woof woof");
   }
}
```

### Overloading

```java
class Dog {
   public void bark() { // same name but different params
      System.out.println("woof");
   }

   public void bark(int numberOfTimes) {
      for (int i = 0; i < numberOfTimes; i++) {
         System.out.println("woof");
      }
   }
}
```

##Recap

![recap](C:\Users\Lengg\Documents\TechCircleCode\cohort11-java\src\day39_10thReview\reviewnote\img.
png)