package exercises.test_package;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class TestCode {
  public static void main(String[] args) {
    int[] a = {2,3};
    int[] b = {5};
    int[] c = {0,1,2,3};
    int[][] arr = {a,b,c};
    System.out.println(sumOfAverage(arr));
  }

  static double sumOfAverage(int[][] arr) {
    double sum = 0;
    for (int[] ints : arr) {
      sum += findAverage(ints);
    }
    return sum;
  }

  static double findAverage(int[] arr) {
    return findSum(arr) / arr.length;
  }

  static double findSum(int[] arr) {
    return Arrays.stream(arr).sum();
  }
}
