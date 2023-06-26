# Exception

## Exception Hierarchy

![hierarchy](C:\Users\Lengg\Documents\GitHub\cohort11-java\src\day43_11thReview\reviewnote\pics\Exception-in-java1.png)

Let’s understand better about Java exceptions and errors better through examples:

## Type of Exception

### Error

```java
class Main {
    public static void main(String[] args) {
        print("Hello"); // this will give an StackOverflowError
    }

    public static void print(String myString) {
        print(myString);
    }
}
```

### Checked Exception

are the compile-time exceptions. compiler will force us to handle exception before run.

Example are

- FileNotFoundException
- IOException
- InterruptedException

### Unchecked Exception

unchecked are Runtime exceptions. Unchecked exceptions do not have to be handled in the code.

Example are

- StringIndexOutOfBoundException
- IllegalFormatConversionException
- ArithmeticException
- NPE

### Error Vs Exception

- **Error**: An Error indicates a serious problem that a reasonable application should not try to catch.
- **Exception**: Exception indicates conditions that a reasonable application might try to catch.

## Exception Handling

Exception handling in Java is important to maintain the normal flow of the program even during the occurrence of
unexpected events. If the exceptions are not handled, they will lead to the crashing of the app resulting in frustrated
customers.

### Traditional Ways

using flag to check that value before using it.

### Try-catch block

A try-catch method is the best way to handle exceptions. To catch specific Java exceptions a try block can be followed
by one or more catch blocks, each specifying a particular type.

![](C:\Users\Lengg\Documents\GitHub\cohort11-java\src\day43_11thReview\reviewnote\pics\Try-Block.jpg)

If there’s an exception in the try block, the exception is thrown to the first catch block, if not caught by this class
it is passed on until it gets caught or misses all.

#### Finally block

The `finally` block is for the code that is to be executed in every case, whether there is an exception or not. It means
the `finally` block is executed every time.

### Using the throws keyword

The throws keyword defines that the method is going to throw an exception Once the exception is thrown the caller has to
handle it using a try-catch block. We can throw either checked or unchecked exceptions.

The throws keyword provides information about the type of exception that the method may throw but does not prevent the
program from getting aborted.

```java
class Main {
    static void testMethod() throws Exception {
        String test = null;
        test.toString();
    }
}
```

## Throws Exception

Learning Throwing exceptions in Java is equally important as handling these exceptions. This feature helps the developer
to create quality code and make debugging easier.

Throwing an exception requires the use of `throw` statement in the code. The exception object is mentioned which needs
to be thrown with a message. This message contains a brief about the exception like user input issue, any server or
backend related issue, etc.

```java
throw new Exception(“Exception message”);
```

Example with existing program.

```java
public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    private boolean isContainSpecial(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i))) return true;
        }
        return false;
    }

    private boolean isStartWithLetter(String name) {
        return Character.isLetter(name.charAt(0));
    }

    public double calCost() {
        return unitPrice * quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) System.out.println("Name cannot be empty or blank");
        else if (!isStartWithLetter(name)) System.out.println("Name must start with letter");
        else if (isContainSpecial(name)) System.out.println("Name cannot contain special character");
        else this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.out.println("Unit price cannot be negative");
        } else this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Quantity cannot be negative");
        } else this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Total cost=" + calCost();
    }
}
```

## Summary

![](C:\Users\Lengg\Documents\GitHub\cohort11-java\src\day43_11thReview\reviewnote\pics\Exception.png)