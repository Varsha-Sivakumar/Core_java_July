package project;

import java.util.*;
import java.time.*;

class Passenger {
    public String name;
    public String gender;

    public Passenger(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
}

class Booking {
    public List<Passenger> passengers;
    public String date;
    public String day;
    public boolean isFestival;
    public String source;
    public String destination;
    public double pricePerTicket;
    public double totalPrice;

    public Booking(List<Passenger> passengers, String date, String day, boolean isFestival,
                   String source, String destination) {
        this.passengers = passengers;
        this.date = date;
        this.day = day;
        this.isFestival = isFestival;
        this.source = source;
        this.destination = destination;
        calculatePrice();
    }

    public void calculatePrice() {
        int distance = 1000; // default distance
        if (TravelAgency.distanceMap.containsKey(source) &&
                TravelAgency.distanceMap.get(source).containsKey(destination)) {
            distance = TravelAgency.distanceMap.get(source).get(destination);
        }

        double basePrice = distance * 5;
        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            basePrice += 200;
        }

        double total = 0;
        for (Passenger p : passengers) {
            double discount = 0;
            if (p.gender.equalsIgnoreCase("Female")) discount += 15;
            if (isFestival) discount += 20;

            double finalTicket = basePrice - (basePrice * discount / 100);
            total += finalTicket;
        }

        pricePerTicket = basePrice;
        totalPrice = total;
    }

    public void display() {
        System.out.println("------------------------------------------------");
        System.out.println("Date: " + date);
        System.out.println("Day: " + day);
        System.out.println("Festival Day: " + (isFestival ? "Yes" : "No"));
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Passengers:");
        for (Passenger p : passengers) {
            System.out.println("  - " + p.name + " (" + p.gender + ")");
        }
        System.out.println("Price per Ticket (Base): ₹" + pricePerTicket);
        System.out.println("Total Price: ₹" + totalPrice);
        System.out.println("------------------------------------------------");
    }
}

public class TravelAgency {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Booking> bookings = new ArrayList<>();
    public static Set<String> festivalDates = new HashSet<>(Arrays.asList("2025-08-15", "2025-10-02", "2025-11-01"));
    public static Map<String, Map<String, Integer>> distanceMap = new HashMap<>();

    public static void initializeDistances() {
        Map<String, Integer> maduraiMap = new HashMap<>();
        maduraiMap.put("chennai", 456);
        maduraiMap.put("salem", 236);
        maduraiMap.put("coimbatore", 216);

        Map<String, Integer> chennaiMap = new HashMap<>();
        chennaiMap.put("madurai", 456);
        chennaiMap.put("salem", 346);
        chennaiMap.put("coimbatore", 508);

        Map<String, Integer> salemMap = new HashMap<>();
        salemMap.put("chennai", 346);
        salemMap.put("coimbatore", 209);
        salemMap.put("madurai", 236);

        Map<String, Integer> coimbatoreMap = new HashMap<>();
        coimbatoreMap.put("chennai", 508);
        coimbatoreMap.put("salem", 209);
        coimbatoreMap.put("madurai", 216);

        distanceMap.put("madurai", maduraiMap);
        distanceMap.put("chennai", chennaiMap);
        distanceMap.put("salem", salemMap);
        distanceMap.put("coimbatore", coimbatoreMap);
    }

    public static void main(String[] args) {
        initializeDistances();

        int choice;
        do {
            System.out.println("\n======= Travel Agency Menu =======");
            System.out.println("1. Add Booking");
            System.out.println("2. View Bookings");
            System.out.println("3. Update Booking");
            System.out.println("4. Delete Booking");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1: addBooking(); break;
                case 2: viewBookings(); break;
                case 3: updateBooking(); break;
                case 4: deleteBooking(); break;
                case 5: System.out.println("✅ Exiting. Thank you!"); break;
                default: System.out.println("❌ Invalid choice.");
            }
        } while (choice != 5);
    }

    public static void addBooking() {
        System.out.print("Enter Travel Date (YYYY-MM-DD): ");
        String date = sc.nextLine();
        String day;
        try {
            LocalDate localDate = LocalDate.parse(date);
            DayOfWeek dow = localDate.getDayOfWeek();
            day = dow.toString().substring(0, 1).toUpperCase() + dow.toString().substring(1).toLowerCase();
        } catch (Exception e) {
            System.out.println("❌ Invalid date.");
            return;
        }

        boolean isFestival = festivalDates.contains(date);

        System.out.print("Enter Source: ");
        String source = sc.nextLine().toLowerCase();
        System.out.print("Enter Destination: ");
        String destination = sc.nextLine().toLowerCase();

        if (!distanceMap.containsKey(source) || !distanceMap.get(source).containsKey(destination)) {
            System.out.println("❌ Route not available.");
            return;
        }

        System.out.print("Enter number of persons: ");
        int count = sc.nextInt(); sc.nextLine();
        List<Passenger> passengers = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter name of person " + i + ": ");
            String name = sc.nextLine();
            System.out.print("Enter gender of person " + i + " (Male/Female): ");
            String gender = sc.nextLine();
            passengers.add(new Passenger(name, gender));
        }

        Booking booking = new Booking(passengers, date, day, isFestival, source, destination);
        bookings.add(booking);
        System.out.println("✅ Booking added successfully.");
        if (isFestival) System.out.println("🎉 Festival discount applied.");
    }

    public static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("📭 No bookings available.");
        } else {
            for (int i = 0; i < bookings.size(); i++) {
                System.out.println("Booking ID: " + i);
                bookings.get(i).display();
            }
        }
    }

    public static void updateBooking() {
        viewBookings();
        if (bookings.isEmpty()) return;

        System.out.print("Enter Booking ID to update: ");
        int id = sc.nextInt(); sc.nextLine();

        if (id < 0 || id >= bookings.size()) {
            System.out.println("❌ Invalid ID.");
            return;
        }

        System.out.println("Re-enter booking details:");
        bookings.remove(id);
        addBooking();
    }

    public static void deleteBooking() {
        viewBookings();
        if (bookings.isEmpty()) return;

        System.out.print("Enter Booking ID to delete: ");
        int id = sc.nextInt(); sc.nextLine();

        if (id < 0 || id >= bookings.size()) {
            System.out.println("❌ Invalid ID.");
            return;
        }

        bookings.remove(id);
        System.out.println("🗑️ Booking deleted successfully.");
    }
}
