package exercises.oop.teacher.leng.online_shopping_system;

import exercises.oop.teacher.leng.online_shopping_system.constants.Size;

public class Clothing extends Product implements IdInterface{
  private static int clothingId = 1;
  private final Size SIZE;
  public Clothing(String name, double price, int quantityInStock, Size size) {
    super(name, price, quantityInStock);
    setProductId(generateId());
    this.SIZE = size;
  }
  @Override
  public String generateId() {
    return "clothing@" + clothingId++;
  }
}
