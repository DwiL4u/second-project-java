import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {
  public static void main(String[] args) {
    try {
      //deserialize the object
      FileInputStream fileIn = new FileInputStream("person.ser");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      Person person = (Person) in.readObject();
      System.out.println("Object deserialized successfully");
      System.out.println("Name: " + person.getName());
      System.out.println("Age: " + person.getAge());
      System.out.println("Password: " + person.getPassword());

    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  }
