package projects.cinema;

import java.util.Arrays;

public class Cinema {
  private char[][] map;
  private int mapRow;
  private int mapCol;

  public Cinema(int row, int col) {
    this.mapRow = row;
    this.mapCol = col;
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
      System.out.print(i+1);
      for (int j = 0; j < mapCol; j++) {
        System.out.print(" " + this.map[i][j]);
      }
      System.out.println();
    }
  }
}
