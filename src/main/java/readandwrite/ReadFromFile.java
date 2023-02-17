package readandwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
  public static void main(String[] args) {
    FileReader file = null;
    BufferedReader reader = null;
    try {
      file = new FileReader("src/main/resources/fileforread.txt");
      reader = new BufferedReader(file);
      String line;
      while ((line = reader.readLine()) != null)
        System.out.println(line);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if (reader != null)
        try {
          reader.close();
        } catch (IOException ignored) {
        }
    }
  }
}
