import java.util.LinkedList;

public class LinkedListSample {
  public static void main(String[] args) {
    //create a LinkedList
    LinkedList<String> cars = new LinkedList<>();

    //add elements to the LinkedList
    cars.add("Toyota");
    cars.add("Ford");
    cars.add("BMW");
    cars.addFirst("Mercedes");
    cars.addLast("Audi");

    //print the LinkedList
    System.out.println("LinkedList: " + cars);

    //access elements by index
    System.out.println("First car: " + cars.getFirst());
    System.out.println("Last car: " + cars.getLast());

    //change the element by index
    cars.set(1, "Honda");

    //print the updated LinkedList
    System.out.println("Updated LinkedList: " + cars);

    //check the size of the LinkedList
    System.out.println("Number of cars: " + cars.size());

    //check if the LinkedList contains an element
    if (cars.contains("BMW")) {
      System.out.println("BMW is in the list");
    }

    //iterate over the LinkedList
    for (String car : cars) {
      System.out.println(car);
    }

    //remove the element by index
    cars.remove(2);
    System.out.println("Updated LinkedList: " + cars);

  }

}
