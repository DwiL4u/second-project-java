public class Main {
  public static void main(String[] args) {
    Car car = new Car("Toyota", "Red", 10000);
    //car.model = "Honda";

    car.setModel("Honda");
    car.setColor("Blue");
    car.setPrice(-20000);


    System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
  }

}
