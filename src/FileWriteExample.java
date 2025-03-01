import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
  public static void main(String[] args) {
    //create a file
    File file = new File("output.txt");
    try {
      //check if the file already exists
      if (!file.exists()) {
        file.createNewFile();
        System.out.println("File created: " + file.getName());
      }
      //create a FileWriter and BufferedWriter objects to write to the file
      FileWriter writer = new FileWriter(file, true);
      BufferedWriter bufferedWriter = new BufferedWriter(writer);

      //write content to the file
      bufferedWriter.write("This is a poem\n");
      bufferedWriter.write("That I wrote\n");
      bufferedWriter.write("Just for you\n");

      //close the BufferedWriter
      bufferedWriter.close();


      } catch (IOException e) {
      throw new RuntimeException(e);
    }
    }
    }