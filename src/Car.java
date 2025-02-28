public class Car {
  private String model;
  private String color;
  private int price;

  Car (String model, String color, int price) {
    this.model = model;
    this.color = color;
    this.price = price;
  }
  String getModel() {
    return model;
  }
  String getColor() {
    return color;
  }
 String getPrice() {
    return "$" +this.price;
  }
  void setModel(String model) {
    this.model = model;
  }
  void setColor(String color) {
    this.color = color;
  }
  void setPrice(int price) {
    if (price < 0) {
      System.out.println("Price cannot be negative");
    }
    else {
      this.price = price;
    }

  }

}
