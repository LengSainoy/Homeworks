package exercises.oop.teacher.leng.online_shopping_system;

import java.util.ArrayList;
import java.util.Optional;

public class ShoppingCart {
  private static String fileName;

  private final ArrayList<Product> cart;
  public ShoppingCart() {
    this.cart = new ArrayList<>();
  }

  public boolean add(Product p) {
    if (isValid(p))
      return this.cart.add(p);
    else {
      System.out.println(p.getProductId() + " is invalid");
      return false;
    }
  }

  public boolean remove(Product p) {
    if (cart.contains(p))
      return cart.remove(p);
    else {
      System.out.println(p.getProductId() + " is not in the cart");
      return false;
    }
  }

  public void viewCart() {
    System.out.println("==== Cart Items ====");
    int number = 1;
    for (Product product : cart) {
      System.out.printf("%d. %-20s\t\t$%.2f\n", number++, product.getName(), product.getPrice());
    }
    System.out.printf(">  %-20s\t\t$%.2f\n", "Total Price", getTotalPrice());
  }

  private double getTotalPrice() {
    Optional<Double> total = cart.stream().map(p -> p.getPrice()).reduce((a, b) -> a + b);
    return  total.orElse(0.0);
  }

  private boolean isValid(Product p) {
    return p != null &&
        !p.getName().isBlank() &&
        p.getPrice() > 0 &&
        p.getQuantityInStock() > 0;
  }
}
