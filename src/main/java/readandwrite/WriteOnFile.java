package readandwrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOnFile {
  public static void main(String[] args) {
    BufferedWriter writer = null;
    try {
      writer = new BufferedWriter(new FileWriter("src/main/resources/output-data/outputfile.txt"));
      writer.write("first line");
      writer.write("\nsecond line");
    } catch (IOException e) {
      System.out.println("file not found");
    } finally {
      if (writer != null)
        try {
          writer.close();
        } catch (IOException ignored) {
        }
    }

  }
}
