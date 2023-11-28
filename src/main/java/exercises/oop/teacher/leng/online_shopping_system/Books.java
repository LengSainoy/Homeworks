package exercises.oop.teacher.leng.online_shopping_system;

public class Books extends Product implements IdInterface{
  private static int bookId = 1;
  private final boolean isFiction;
  @Override
  public String generateId() {
    return "books@" + bookId++;
  }
  public Books(String name, double price, int quantityInStock, boolean isFiction) {
    super(name, price, quantityInStock);
    setProductId(generateId());
    this.isFiction = isFiction;
  }
  public boolean isFiction() {
    return isFiction;
  }
  @Override
  public String toString() {
    return "Books{" +
        "productId=" + getProductId() +
        ",name=" + getName() +
        ",price=" + getPrice() +
        ",isFiction=" + isFiction +
        '}';
  }
}
