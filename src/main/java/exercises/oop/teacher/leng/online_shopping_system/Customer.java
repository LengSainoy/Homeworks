package exercises.oop.teacher.leng.online_shopping_system;

public class Customer {
  private String customerId;
  private String name;
  private String email;
  private String address;
  public Customer(String customerId, String name, String email, String address) {
    this.customerId = customerId;
    this.setName(name);
    this.setEmail(email);
    this.setAddress(address);
  }
  public String getCustomerId() {
    return customerId;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
}
