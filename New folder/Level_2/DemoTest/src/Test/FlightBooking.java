package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightBooking {
    static String[] flights = {
        "Delhi to Mumbai",
        "Mumbai to Bangalore",
        "Delhi to Ranchi",
        "Kolkata to Hyderabad",
        "Hyderabad to Pune"
    };

    static List<String> bookings = new ArrayList<>();

    // Method to search flights
    public static void searchFlights(String query) {
        System.out.println("Available Flights matching \"" + query + "\":");
        boolean found = false;
        for (String flight : flights) {
            if (flight.toLowerCase().contains(query.toLowerCase())) {
                System.out.println(" - " + flight);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No flights found.");
        }
    }

    // Method to book a flight
    public static void bookFlight(String flightName) {
        boolean exists = false;
        for (String flight : flights) {
            if (flight.equalsIgnoreCase(flightName)) {
                bookings.add(flight);
                System.out.println("Booking confirmed for: " + flight);
                exists = true;
                break;
            }
        }
        if (!exists) {
            System.out.println("Flight not found. Please check the name.");
        }
    }

    // Method to view bookings
    public static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            System.out.println("Your Bookings:");
            for (String booking : bookings) {
                System.out.println(" - " + booking);
            }
        }
    }

    // Main method to simulate the system
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Flight Booking System ---");
            System.out.println("1. Search Flights");
            System.out.println("2. Book a Flight");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter destination or route to search: ");
                    String searchQuery = sc.nextLine();
                    searchFlights(searchQuery);
                    break;
                case 2:
                    System.out.print("Enter exact flight name to book: ");
                    String flightToBook = sc.nextLine();
                    bookFlight(flightToBook);
                    break;
                case 3:
                    viewBookings();
                    break;
                case 4:
                    System.out.println("Thank you for using the Flight Booking System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
