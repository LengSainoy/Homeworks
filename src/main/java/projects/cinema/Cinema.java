package projects.cinema;

import java.util.Arrays;

public class Cinema {
  private char[][] map;
  private int mapRow;
  private int mapCol;
  private int numberOfSeat;

  public Cinema(int row, int col) {
    this.mapRow = row;
    this.mapCol = col;
    this.numberOfSeat = row * col;
    setMap();
  }

  public void setMap() {
    var map = new char[this.mapRow][this.mapCol];
    for (char[] mapRow : map) {
      Arrays.fill(mapRow,'S');
    }
    this.map = map;
  }

  public void displayMap() {
    int mapCol = this.map[0].length;
    System.out.println("Cinema:");
    System.out.print(" ");
    for (int i = 0; i < mapCol; i++) {
      System.out.print(" " + (i+1));
    }
    System.out.println();
    for (int i = 0; i < this.map.length; i++) {
      System.out.print(i + 1);
      for (int j = 0; j < mapCol; j++) {
        System.out.print(" " + this.map[i][j]);
      }
      System.out.println();
    }
  }

  public int calculateTotalIncome() {
    int totalIncome = 0;
    final int TICKET_10 = 10;
    final int TICKET_8 = 8;
    if (this.numberOfSeat <= 60)
      totalIncome = this.numberOfSeat * TICKET_10;
    else {
      int secondHalf;
      int firstHalf = mapRow/2;
      totalIncome += firstHalf * this.mapCol * TICKET_10;
      if (mapRow % 2 == 1) // if row is odd number
        secondHalf = mapRow / 2 + 1;
      else
        secondHalf = firstHalf;
      totalIncome += secondHalf * this.mapCol * TICKET_8;
    }
    return totalIncome;
  }
}
