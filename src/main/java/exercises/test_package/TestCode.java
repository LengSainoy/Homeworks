package exercises.test_package;

import java.text.NumberFormat;
import java.util.Locale;

public class TestCode {
  public static void main(String[] args) {
    var value = 2000000;
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

    String output = nf.format(value);
    System.out.println(value + " " + output);
  }
}
