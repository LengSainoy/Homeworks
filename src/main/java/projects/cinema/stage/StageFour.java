package projects.cinema.stage;

import projects.cinema.Cinema;
import projects.cinema.CinemaPrompt;

public class StageFour {
  public static void main(String[] args) {
    // stage 4-5
    int[] cinemaSize = CinemaPrompt.askCinemaSize();
    Cinema c4 = new Cinema(cinemaSize[0], cinemaSize[1]);
    mainMenu:
    while (true) {
      int selectMenu = CinemaPrompt.showMenu();
      switch (selectMenu) {
        case 1 -> {
          c4.displayMap();
        }
        case 2 -> {
          int[] seatPosition = CinemaPrompt.askSeatPosition();
          int ticketPrice = c4.buyTicket(seatPosition[0], seatPosition[1]);
          CinemaPrompt.displayTicketPrice(ticketPrice);
        }
        case 0 -> {
          break mainMenu;
        }
      }
    }
  }
}
