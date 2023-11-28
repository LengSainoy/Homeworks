package exercises.oop.teacher.leng.online_shopping_system;

public class Product implements Purchasable{
  private String productId;
  private String name;
  private String description;
  private double price;
  private int quantityInStock;
  public Product(String productId, String name, String description, double price, int quantityInStock) {
    this.productId = productId;
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityInStock = quantityInStock;
  }
  public Product(String name, String description, double price, int quantityInStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityInStock = quantityInStock;
  }
  public Product(String name, double price, int quantityInStock) {
    this.name = name;
    this.price = price;
    this.quantityInStock = quantityInStock;
  }
  public String getProductId() {
    return productId;
  }
  protected void setProductId(String id) {
    this.productId = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public int getQuantityInStock() {
    return quantityInStock;
  }
  public void setQuantityInStock(int quantityInStock) {
    this.quantityInStock = quantityInStock;
  }
  @Override
  public double calculateTotalPrice() {
    double totalPrice = quantityInStock * price;
    if (this.quantityInStock > 10)
      return totalPrice * 0.9;
    return totalPrice;
  }
}
