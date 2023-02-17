package exercises.test_package;

public class Patterns {
  public static void main(String[] args) {
    printMultiplicationGrid(9);
  }

  private static void printTriangle(char symbol, int size) {
    for (int i = 0; i < size; i++) {
      for (int j = i; j < size; j++) {
        System.out.print(symbol);
      }
      System.out.println();
    }
  }

  private static void printPatternA(char symbol, int size) {
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size; j++) {
        if (j == i)
          System.out.print(symbol + " ");
        else
          System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  private static void printNumberTriangle(int size) {
    if (size > 0 && size < 10) {
      for (int i = 1; i <= size; i++) {
        for (int j = 0; j < i; j++)
          System.out.print(i);
        System.out.println();
      }
    }
    else System.out.println("only accept 1-9");
  }

  private static void printMultiplicationGrid(int size) {
    int max = 20, min = 0;
    if (size > min && size <= max) {
      for (int i = 1; i <= size; i++) {
        for (int j = 1; j <= size; j++) {
          System.out.printf("%-3d ", j*i);
        }
        System.out.println();
      }
    }
    else System.out.printf("only accept %d-%d", min, max);
  }

  private static void printDiamond(char symbol, int size) {

  }
}
