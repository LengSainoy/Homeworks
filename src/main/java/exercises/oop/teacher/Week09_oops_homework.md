## Assignment 1

**Topic**: Understanding Access Modifiers

### Description

- Create a Java class called `Person` with private instance variables for `name`, `age`, and `email`.
- Implement getter and setter methods for each variable.
- Then, create another class called `Main` to demonstrate how these access modifiers work by setting and retrieving
  values for the `Person` object.

## Assignment 2

**Topic**: Encapsulation with Constructors

### Description

- Build a class named `Book` with private instance variables for `title`, `author`, and `ISBN`.
- Use a constructor to initialize these variables when a `Book` object is created.
- Implement getter methods to access the book's details.
- Create a sample `Main` class to create and display information about different books.

## Assignment 3

**Topic**: Encapsulation in a Banking System

### Description

- Develop a Java class called `BankAccount` with private instance variables for `account number`, `account holder
  name`, and `balance`.
- Implement getter and setter methods for these variables.
- Include methods for deposit and withdrawal, making sure to validate withdrawals to prevent a negative balance.
- Create a `Main` class to test these functionalities.

## Assignment 4

**Topic**: Encapsulation in a School Management System

### Description

- Design a class named `Student` with private instance variables for `student ID`, `name`, and `grade`.
- Implement getter and setter methods.
- Create a class called `Course` with private instance variables for course name and
  the list of enrolled students.
- Ensure that you encapsulate the list of students properly to prevent direct access.
- Implement methods to add and remove students from the course. Develop a `Main` class to enroll and manage students in
  courses.

## Assignment 5

**Topic**: Encapsulation and Inheritance

### Description

- Create a base class called `Vehicle` with private instance variables for `make`, `model`, and `year`.
- Implement getter and setter methods.
- Extend the `Vehicle` class to create two subclasses, `Car` and `Motorcycle`, each
  with their unique properties and behaviors.
- Ensure that encapsulation is maintained throughout the class hierarchy.
- Write a `Main` class to demonstrate the usage of these classes.

## Assignment 6

**Topic**: Basic Inheritance

### Description

- Create a base class called `Shape` with instance variables for color and filled (a boolean indicating whether the
  shape is filled with color).
- Implement getter and setter methods for these variables.
- Extend the `Shape` class to create two subclasses, `Circle` and `Rectangle`, each with their unique properties and
  methods.
- Demonstrate inheritance by creating instances of these subclasses and using their methods.

## Assignment 7

**Topic**: Inheritance in a Banking System

### Description

- Extend the `BankAccount` class from a previous assignment (Assignment 3) to create specialized subclasses
  for `SavingsAccount` and `CheckingAccount`.
- Add instance variables and methods specific to each type of
  account, such as
   - interest rates for savings accounts and
   - overdraft protection for checking accounts.
- Implement
  inheritance and demonstrate the functionality in a `Main` class.

## Assignment 8

**Topic**: Inheritance and Polymorphism with Animals

### Description

- Create a base class called `Animal` with properties such as `name`, `species`, and `age`.
- Extend the `Animal` class to create subclasses for different types of animals, such as `Dog`, `Cat`, and `Bird`.
- Implement a method called `makeSound()` in each subclass that returns the appropriate sound for that animal.
- Use polymorphism to create an array of `Animal` objects and iterate through it to make each animal "speak."

## Assignment 9

**Topic**: Inheritance in a University System

### Description

- Design a class hierarchy for a university system.
- Create a base class called `Person` with properties like `name`, `age`, and `address`.
- Extend the `Person` class to create subclasses for `Student` and `Professor`.
- Add properties and methods specific to each subclass, such as a student's GPA and a professor's department.
- Create a `Main` class to demonstrate the use of these classes and their inheritance relationship.

## Assignment 10

**Topic**: Inheritance and Interfaces in a Shape Hierarchy

### Description

- Build a hierarchy of geometric shapes.
- Create a base class called `Shape` with methods to **calculate area** and **perimeter**.
- Implement these methods as abstract, and create two subclasses, `Circle` and `Rectangle`, that
  provide concrete implementations.
- Define an interface called `Drawable` with a method `draw()` to display the shape.
- Make `Circle` and `Rectangle` implement this interface.
- Create a `Main` class to create instances of these shapes and
  demonstrate both inheritance and interface implementation.

## Assignment 11

**Topic**: Polymorphism with Animal Sounds

### Description

- Create a base class called `Animal` with a method `makeSound()`.
- Extend the `Animal` class to create subclasses for different animals, such as `Dog`, `Cat`, and `Bird`.
- Override the `makeSound()` method in each subclass to make each animal produce its unique sound.
- Demonstrate polymorphism by creating an array of `Animal` objects and
  calling the `makeSound()` method on each of them.

## Assignment 12

**Topic**: Polymorphism in a Shape Hierarchy

### Description

- Extend the shape hierarchy from a previous assignment (Assignment 10) with additional shape types, such as `Triangle`
  and `Square`.
- Implement the `Drawable` interface for these new shapes as well.
- Create a `Main` class that stores various shapes in an array and calls the `draw()` method on each of them to display
  their drawings.
- Show how polymorphism simplifies the code.

## Assignment 13

**Topic**: Polymorphism in a Library System

### Description

- Design a library system with a base class called `LibraryItem` representing items like books and DVDs, with properties
  like title and author/producer.
- Extend the `LibraryItem` class to create subclasses for `Book` and `DVD`.
- Implement a `displayInformation()` method in each subclass to display relevant information.
- Create a `Main` class to demonstrate polymorphism by managing a library collection containing both books and DVDs.

## Assignment 14

**Topic**: Polymorphism in a Shape Sorting System

### Description

- Create a base class called `Shape` with properties for area and perimeter.
- Extend the `Shape` class to create subclasses for different shapes, such as `Circle`, `Rectangle`, and `Triangle`.
- Implement methods to calculate the area and perimeter for each shape.
- Use polymorphism to store instances of these shapes in a collection and sort them
  by area.
- Demonstrate the sorting functionality in a `Main` class.

## Assignment 15

**Topic**: Polymorphism in a Vehicle Rental System

### Description

- Design a vehicle rental system with a base class called `Vehicle` representing vehicles available for rent, with
  properties like make, model, and rental price.
- Extend the `Vehicle` class to create subclasses for different vehicle types, such as `Car`, `Motorcycle`, and `Truck`.
- Implement a `rent()` method in each subclass to calculate the rental cost.
- Create a `Main` class to demonstrate polymorphism by renting various types of vehicles and displaying their
  rental prices.

## Assignment 16

**Topic**: Abstraction with Geometric Shapes

### Description

- Create an abstract class called `Shape` with abstract methods `calculateArea()` and `calculatePerimeter()`.
- Extend the `Shape` class to create concrete subclasses for different shapes, such as `Circle`, `Rectangle`,
  and `Triangle`.
- Implement the abstract methods in each subclass to calculate the area and perimeter.
- Demonstrate abstraction by creating instances of these shapes and calling the calculation methods.

## Assignment 17

**Topic**: Abstraction in a Banking System

### Description

- Design a banking system with an abstract class called `Account` representing various account types.
- Define abstract methods like `deposit()` and `withdraw()` that must be implemented by concrete subclasses such
  as `SavingsAccount` and `CheckingAccount`.
- Create a `Main` class to demonstrate abstraction by performing transactions on different types of accounts.

## Assignment 18

**Topic**: Abstraction in a Music Player

### Description

- Create an abstract class called `Media` to represent different types of media files (e.g., audio, video).
- Define abstract methods like `play()` and `pause()` that must be implemented by concrete subclasses like `AudioFile`
  and `VideoFile`.
- Implement these methods to simulate playing and pausing media.
- Create a `Main` class to demonstrate abstraction by using different media types.

## Assignment 19

**Topic**: Abstraction with Employee Management

### Description

- Build an employee management system with an abstract class called `Employee` representing different types of
  employees.
- Define abstract methods like `calculateSalary()` that must be implemented by concrete subclasses like `Manager`
  and `Technician`.
- Create a `Main` class to demonstrate abstraction by calculating salaries for different employee types.

## Assignment 20

**Topic**: Abstraction in a Shape Drawing System

### Description

- Extend the shape hierarchy from a previous assignment (Assignment 12) with additional shape types, such as `Ellipse`
  and `Polygon`.
- Implement the `Drawable` interface for these new shapes as well.
- Create a `Main` class that stores various shapes in an array and calls the `draw()` method on each of them to display
  their drawings.
- Show how abstraction simplifies the code and allows for easy addition of new shapes.

## Assignment 21

**Topic**: Interface in a Library System

### Description

- Design a library system with an interface called `LibraryItem` that includes methods like `checkout()` and
  `returnItem()`.
- Create classes for different types of library items, such as `Book`, `DVD`, and `Magazine`, that implement
  the `LibraryItem` interface.
- Implement the methods in each class to handle item checkout and return.
- Develop a `Main` class to demonstrate how different types of library items can be managed using the common interface.

## Assignment 22

**Topic**: Interface for Sorting Algorithms

### Description

- Create an interface called `SortAlgorithm` with a method `sort(int[] arr)` for sorting integer arrays.
- Implement this interface with concrete classes for various sorting algorithms, such as `BubbleSort`, `QuickSort`,
  and `MergeSort`.
- Develop a `Main` class that allows the user to choose a sorting algorithm dynamically and sort an array
  using the selected algorithm. Show how interfaces make it easy to switch between different sorting methods.

## Assignment 23

**Topic**: Interface for Payment Methods

### Description

- Develop a payment processing system with an interface called `PaymentMethod` that includes methods
  like `processPayment()` and `refundPayment()`.
- Create classes for different payment methods, such as `CreditCard`, `PayPal`, and `Bitcoin`, that implement
  the `PaymentMethod` interface.
- Implement the methods in each class to handle payment processing and refunds.
- Build a `Main` class to simulate payment transactions using various payment methods.

## Online Shopping System

### Description

Design an online shopping system that models various aspects of object-oriented programming concepts.

### Requirements

1. Create a class called `Product` with private instance variables for `product ID`, `name`, `description`, `price`, and
   `quantity in stock`. Implement getter and setter methods for these variables. Ensure encapsulation by making them
   private.

2. Implement a class `Customer` with private instance variables for customer ID, name, email, and address. Implement
   getter and setter methods for these variables, ensuring encapsulation.

3. Extend the `Product` class to create subclasses for different types of products, such as `Electronics`, `Clothing`,
   and `Books`. Each subclass should have additional properties and methods specific to its type (e.g., `WarrantyPeriod`
   for Electronics). Demonstrate inheritance.

4. Create an interface called `Purchasable` with a method `calculateTotalPrice()` to calculate the total price of a
   product based on the quantity and any applicable discounts. Make sure the `Product` class and its subclasses
   implement this interface. Show abstraction through the interface.

5. Implement a `ShoppingCart` class that allows customers to add and remove products, view the items in the cart, and
   calculate the total cost. Use polymorphism to store different types of products in the cart.

6. Design a `Main` class to simulate an online shopping experience. Create instances of different types of products, add
   them to a shopping cart, and calculate the total cost. Allow customers to provide their information and complete the
   purchase.

**Optional Advanced Challenge**: Implement custom exceptions like `OutOfStockException` and `PaymentFailedException` to
handle exceptional cases gracefully in the shopping system.

**Note**: In this assignment, you will apply all the core OOP concepts - encapsulation, inheritance, polymorphism, and
abstraction - to create a functional and well-structured online shopping system. This will help you to understand how
these concepts work together in a real-world scenario.

## Coffee Maker Simulation

### Description

Design a Java program that simulates a coffee maker, allowing users to make and customize different types of coffee
drinks.

### Requirements

1. Create an abstract class called `CoffeeDrink` with the following properties and methods:
   - Private instance variables for coffee strength (e.g., mild, medium, strong) and coffee size (e.g., small, medium,
     large).
   - A constructor to initialize these properties.
   - Getter and setter methods for both strength and size.
   - An abstract method `brew()` that simulates brewing the coffee.

2. Implement three subclasses: `Late`, `Frappechino`, and `IceCoffee`, which extend the `CoffeeDrink` class. Each
   subclass should:
   - Implement the `brew()` method to display a message indicating the coffee type, strength, and size.
   - Define additional properties or behaviors specific to that type of coffee (e.g., temperature for IceCoffee).

3. Create an interface called `Customizable` with a method `addCondiments()` to customize the coffee drinks with
   condiments (e.g., sugar, milk). Make sure all subclasses implement this interface.

4. Implement a `CoffeeMaker` class that allows users to create coffee drinks of their choice:
   - The `CoffeeMaker` class should contain methods for setting the coffee's strength and size, as well as brewing the
     coffee.
   - Use polymorphism to create different types of coffee drinks based on user input.

5. In the `Main` class, demonstrate the coffee maker's functionality:
   - Create a `CoffeeMaker` object and allow the user to set the coffee's strength and size.
   - Based on user input, use polymorphism to brew the appropriate coffee drink (Late, Frappechino, or IceCoffee).
   - Optionally, allow the user to add condiments to their coffee drink using the `Customizable` interface.

**Optional Advanced Challenge**: Implement exception handling to handle invalid input for coffee strength, size, and
condiments (e.g., if the user enters an unsupported strength level).

**Note**: This assignment integrates all the core OOP concepts - encapsulation, inheritance, polymorphism, and
abstraction - to create a comprehensive coffee maker simulation that allows for different types of coffee drinks with
customization options. Students will practice designing class hierarchies and using interfaces in a real-world scenario.


