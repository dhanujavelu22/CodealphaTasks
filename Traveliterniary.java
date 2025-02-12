package dhanuintern2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Travelitineraryplanner {
	    static ArrayList<HashMap<String, String>> itinerary = new ArrayList<>();
	    static double totalBudget = 0.0;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        System.out.println("Welcome to Travel Itinerary Planner!");
	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add a Destination");
	            System.out.println("2. View Itinerary");
	            System.out.println("3. Calculate Budget");
	            System.out.println("4. Simulate Weather");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine();

	            switch (choice) {
	                case 1:
	                    addDestination(scanner);
	                    break;
	                case 2:
	                    viewItinerary();
	                    break;
	                case 3:
	                    calculateBudget(scanner);
	                    break;
	                case 4:
	                    simulateWeather(scanner);
	                    break;
	                case 5:
	                    System.out.println("Thank you for using Travel Itinerary Planner. Safe travels!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);

	        scanner.close();
	    }
	    public static void addDestination(Scanner scanner) {
	        HashMap<String, String> destinationDetails = new HashMap<>();

	        System.out.print("Enter destination: ");
	        String destination = scanner.nextLine();

	        System.out.print("Enter travel dates (e.g., 12-15 Oct): ");
	        String dates = scanner.nextLine();

	        System.out.print("Enter your preferences (e.g., sightseeing, adventure): ");
	        String preferences = scanner.nextLine();

	        destinationDetails.put("Destination", destination);
	        destinationDetails.put("Dates", dates);
	        destinationDetails.put("Preferences", preferences);

	        itinerary.add(destinationDetails);
	        System.out.println("Destination added successfully!");
	    }
	    public static void viewItinerary() {
	        if (itinerary.isEmpty()) {
	            System.out.println("Your itinerary is empty.");
	        } else {
	            System.out.println("\nYour Travel Itinerary:");
	            for (int i = 0; i < itinerary.size(); i++) {
	                HashMap<String, String> destinationDetails = itinerary.get(i);
	                System.out.println("Destination " + (i + 1) + ": " + destinationDetails.get("Destination"));
	                System.out.println("Dates: " + destinationDetails.get("Dates"));
	                System.out.println("Preferences: " + destinationDetails.get("Preferences"));
	                System.out.println("-----------------------");
	            }
	        }
	    }
	    public static void calculateBudget(Scanner scanner) {
	        System.out.print("Enter budget for this trip: $");
	        double budget = scanner.nextDouble();
	        totalBudget += budget;
	        System.out.println("Total budget updated to: $" + totalBudget);
	    }
	    public static void simulateWeather(Scanner scanner) {
	        System.out.print("Enter destination for weather simulation: ");
	        String destination = scanner.nextLine();
	        System.out.println("Fetching weather data for " + destination + "...");
	        System.out.println("Weather : Snow, -1°C");
	    }
	}



















