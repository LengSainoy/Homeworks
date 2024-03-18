package projects.cinema;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public class CinemaPrompt implements Closeable {
  static Scanner scan = new Scanner(System.in);
  public static int[] askCinemaSize() {
    System.out.println("Enter the number of rows:");
    int row = scan.nextInt();
    System.out.println("Enter the number of seats in each row:");
    int col = scan.nextInt();
    return new int[]{row,col};
  }
  public static int[] askSeatPosition() {
    System.out.println("Enter a row number:");
    int row = scan.nextInt();
    System.out.println("Enter a seat number in that row:");
    int col = scan.nextInt();
    return new int[]{row,col};
  }
  public static void displayTicketPrice(int price) {
    System.out.println("Ticket price: $" + price);
  }
  public static int showMenu(){
    System.out.println("1. Show the seats");
    System.out.println("2. By a ticket");
    System.out.println("0. Exit");
    return scan.nextInt();
  }

  @Override
  public void close() throws IOException {
    scan.close();
  }
}
