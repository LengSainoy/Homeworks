package exercises.oop.teacher.leng.online_shopping_system;

public class Electronics extends Product implements IdInterface {
  private static int electronicId = 1;
  private int warrantyPeriodInMonth;
  public Electronics(String name, String description, double price, int quantityInStock, int warrantyPeriodInMonth) {
    super(name, description, price, quantityInStock);
    setProductId(generateId());
    this.setWarrantyPeriodInMonth(warrantyPeriodInMonth);
  }
  public Electronics(String name, double price, int quantityInStock, int warrantyPeriodInMonth) {
    super(name, price, quantityInStock);
    setProductId(generateId());
    this.setWarrantyPeriodInMonth(warrantyPeriodInMonth);
  }

  @Override
  public String generateId() {
    return "book@" + electronicId++;
  }
  public int getWarrantyPeriodInMonth() {
    return warrantyPeriodInMonth;
  }
  public void setWarrantyPeriodInMonth(int warrantyPeriodInMonth) {
    this.warrantyPeriodInMonth = warrantyPeriodInMonth;
  }
}
