package exercises.oop.teacher.leng.online_shopping_system.exceptions;

public class PaymentFailedException extends ArithmeticException {
  public PaymentFailedException() {
    super("Payment is invalid, please try with different payment");
  }
}
