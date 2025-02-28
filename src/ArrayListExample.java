import java.util.ArrayList;

public class ArrayListExample {
  public static void main(String[] args) {
    //create an ArrayList
    ArrayList<String> fruits = new ArrayList<>();

    //add elements to the ArrayList
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

    //access elements by index
    System.out.println("First fruit: " + fruits.getFirst());

    //change the element by index
    fruits.set(1, "Orange");

    //remove the element by index
    fruits.remove(2);

    //geting the size of the ArrayList
    System.out.println("Number of fruits: " + fruits.size());

    //check if the ArrayList contains an element
    if (fruits.contains("Apple")) {
      System.out.println("Apple is in the list");
    }

    //iterate over the ArrayList
    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    //clear the ArrayList
    fruits.clear();
    System.out.println("Is the list empty? " + true);
  }
  }
// Output:
// First fruit: Apple
// Number of fruits: 2
// Apple is in the list
// Apple
// Orange
// Is the list empty? true

