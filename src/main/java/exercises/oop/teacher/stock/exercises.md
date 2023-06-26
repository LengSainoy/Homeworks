## Stock Task

Write a Java class named `Stock` that keeps track of a person's purchases of shares of a
particular company. The price of a share of stock changes frequently, so shares bought
at different times are usually purchased at different prices.

our class must have the following:

- A constructor that takes no arguments. New `Stock` objects have no shares or
  cost.
- A method `purchase` that can be called on the `Stock` object to inform it that the
  person has bought some shares of stock at a given price. The method takes two
  arguments: a _number of shares_ as an `int`, and a price per share as a `double`.
  For example, if the person buys 20 shares at $3.50 per share, for $70.00 total, then
  `purchase(20, 3.50)` would be called on the person's `Stock` object.
- A `getProfit` method that can be called on the `Stock` object to find out how
  much money the person has made on shares of the stock (market value is greater
  than total cost). The method takes one argument: the current price per share of
  the stock, as a `double`. If the person has lost money on the stock (market value
  is smaller than total cost), the result of `getProfit` is negative.
  
  The profit is computed by computing in the following way:

  - compute the current _market value_ of all shares of the stock (which is the
    total number of shares purchased so far, times the current price passed in
    to the method)
  - subtract the _total cost_ of all shares of the stock (the total amount of money
    the person has paid for all shares of stock purchased so far)

For example, the following code depicts a person making a net profit of $30.00.
This is because the person buys a total of 30 shares (20 + 10) for a total of $90.00
cost, ($70.00 + $20.00), but the new current share price is $4.00, meaning that the
shares are worth $120.00.

```java
public class TestStock {
  public static void main(String[] args) {
    Stock myStock = new Stock();
    myStock.purchase(20, 3.50);
    myStock.purchase(10, 2.00);
    double profit = myStock.getProfit(4.00);
    System.out.println(profit); // 30.0
  }
}
```
