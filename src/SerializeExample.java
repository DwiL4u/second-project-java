import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {

  public static void main(String[] args) {
    //create a Person object
    Person person = new Person("Alice", 30, "SecretPassw0rd");

    try {
      //serialize the object
      FileOutputStream fileOut = new FileOutputStream("person.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(person);
      System.out.println("Object serialized successfully");

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
