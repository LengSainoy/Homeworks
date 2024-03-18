package projects.cinema.stage;

import projects.cinema.Cinema;
import projects.cinema.CinemaPrompt;

public class StageThree {
  public static void main(String[] args) {
    // stage 2-3
    int[] cinemaSize = CinemaPrompt.askCinemaSize();
    Cinema c3 = new Cinema(cinemaSize[0], cinemaSize[1]);
    c3.displayMap();
    int[] seatPosition = CinemaPrompt.askSeatPosition();
    int ticketPrice = c3.buyTicket(seatPosition[0], seatPosition[1]);
    CinemaPrompt.displayTicketPrice(ticketPrice);
    c3.displayMap();
  }
}
