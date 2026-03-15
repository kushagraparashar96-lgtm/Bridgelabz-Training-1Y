package Level_2;

import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Assigned";
        this.price = 0.0;
    }

    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Booking successful for: " + movieName);
    }

    public void displayTicket() {
        System.out.println("\n--- Movie Ticket ---");
        System.out.println("Movie  : " + movieName);
        System.out.println("Seat   : " + seatNumber);
        System.out.printf("Price  : $%.2f%n", price);
        System.out.println("--------------------");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movie = scanner.nextLine();

        MovieTicket ticket = new MovieTicket(movie);

        System.out.print("Enter seat number (e.g., A12): ");
        String seat = scanner.next();

        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();

        ticket.bookTicket(seat, price);
        ticket.displayTicket();

        scanner.close();
    }
}