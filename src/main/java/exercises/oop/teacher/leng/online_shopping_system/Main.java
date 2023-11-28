package exercises.oop.teacher.leng.online_shopping_system;

import exercises.oop.teacher.leng.online_shopping_system.constants.Size;

public class Main {
  public static void main(String[] args) {
    Books b1 = new Books("Harry Potter", 20.00, 20, true);
    Books b2 = new Books("Java for dummy", 12.99, 10, false);
    Clothing tShirt1 = new Clothing("T-Shirt", 25.99, 25, Size.L);
    Clothing tShirt2 = new Clothing("T-Shirt", 18.99, 25, Size.M);
    Electronics tv = new Electronics("Samsung TV", 549.99, 5, 36);
    System.out.println(b1);
    System.out.println(b2);

    ShoppingCart cart = new ShoppingCart();
    cart.add(b1);
    cart.add(b2);
    cart.add(tShirt1);
    cart.add(tShirt2);

    cart.viewCart();

    cart.remove(tv);
    cart.viewCart();
    cart.remove(tShirt2);
    cart.viewCart();
  }
}
