package projects.cinema;

public class TestCinema {
  public static void main(String[] args) {
    // stage 1-5
    Cinema cinema1 = new Cinema(7, 8);
    cinema1.displayMap();

    // stage 2-5
    Cinema cinema2 = new Cinema(4,5);
    int totalIncome1 = cinema2.calculateTotalIncome();
    System.out.println(totalIncome1);

    Cinema cinema3 = new Cinema(9,7);
    int totalIncome2 = cinema3.calculateTotalIncome();
    System.out.println(totalIncome2);

  }
}
