package exercises.oop.teacher.leng.online_shopping_system.exceptions;

public class OutOfStockException extends ArithmeticException {
  public OutOfStockException() {
    super("This product is out of stock");
  }
}
