import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
  public static void main(String[] args) {
    //create a file
    File file = new File("art.txt");
    try {
      //check if the file already exists
      if (!file.exists()) {
        file.createNewFile();
        System.out.println("File created: " + file.getName());
      }
      //create a FileReader and BufferedReader objects to read from the file
      FileReader reader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(reader);

      //read content from the file
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }

      //close the BufferedReader
      bufferedReader.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

}
