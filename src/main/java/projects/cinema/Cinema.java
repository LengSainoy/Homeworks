package projects.cinema;

import java.util.Arrays;

public class Cinema {
  final private int TICKET_10 = 10;
  final private int TICKET_8 = 8;
  private char[][] map;
  private int mapRow;
  private int mapCol;
  private int numberOfSeat;

  public Cinema(int row, int col) {
    this.mapRow = row;
    this.mapCol = col;
    this.numberOfSeat = mapRow * mapCol;
    setMap();
  }

  private void setMap() {
    var map = new char[this.mapRow][this.mapCol];
    for (char[] mapRow : map) {
      Arrays.fill(mapRow, 'S');
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
    if (this.numberOfSeat <= 60)
      totalIncome = this.numberOfSeat * TICKET_10;
    else {
      totalIncome += firstHalfRow() * this.mapCol * TICKET_10;
      totalIncome += secondHalfRow() * this.mapCol * TICKET_8;
    }
    return totalIncome;
  }

  private boolean oddRow() {
    return this.mapRow % 2 == 1;
  }

  private int secondHalfRow() {
    int halfRow = firstHalfRow();
    return oddRow() ? halfRow + 1 : halfRow;
  }

  private int firstHalfRow() {
    return this.mapRow / 2;
  }

  private void updateBookedSeat(int row, int col) {
    this.map[row-1][col-1] = 'B';
  }

  private int getTicketPrice(int row) {
    if (this.numberOfSeat <= 60)
      return this.TICKET_10;
    if (row >= secondHalfRow()) return this.TICKET_8;
    else return this.TICKET_10;
  }

  public int buyTicket(int row, int col) {
    updateBookedSeat(row, col);
    return getTicketPrice(row);
  }

}
