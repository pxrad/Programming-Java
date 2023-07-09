package pxrad.java;

	import java.util.Scanner;

	public class PowkemoN {
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        boolean exit = false;
	        while (!exit) {
	            displayMenu();
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character after reading the integer choice

	            switch (choice) {
	                case 1:
	                    buyNewPowkemoN();
	                    break;
	                case 2:
	                    exit = true;
	                    System.out.println("Exiting the program. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    private static void displayMenu() {
	        System.out.println("\n======= PowkemoN Store Menu =======");
	        System.out.println("1. Buy new PowkemoN");
	        System.out.println("2. Exit");
	        System.out.print("Enter your choice: ");
	    }

	    private static void buyNewPowkemoN() {
	        System.out.print("Enter PowkemoN Type (Fire/Water/Earth/Thunder): ");
	        String powkemonType = scanner.nextLine();

	        if (!isValidPowkemoNType(powkemonType)) {
	            System.out.println("Invalid PowkemoN Type. Please try again.");
	            return;
	        }

	        System.out.print("Enter PowkemoN Name (5-20 characters long): ");
	        String powkemonName = scanner.nextLine();

	        if (!isValidPowkemoNName(powkemonName)) {
	            System.out.println("Invalid PowkemoN Name. Please try again.");
	            return;
	        }

	        System.out.print("Enter PowkemoN Generation (1-8): ");
	        int powkemonGeneration = scanner.nextInt();

	        if (!isValidPowkemoNGeneration(powkemonGeneration)) {
	            System.out.println("Invalid PowkemoN Generation. Please try again.");
	            return;
	        }

	        int typePrice = getTypePrice(powkemonType);
	        int namePrice = getNamePrice(powkemonName);
	        int totalPrice = typePrice + namePrice;
	        int grandTotal = totalPrice + (totalPrice / 10);

	        System.out.println("\n======= PowkemoN Details =======");
	        System.out.println("PowkemoN Name: " + powkemonName);
	        System.out.println("PowkemoN Type: " + powkemonType);
	        System.out.println("PowkemoN Generation: " + powkemonGeneration);
	        System.out.println("Total Price: " + totalPrice);
	        System.out.println("Grand Total: " + grandTotal);

	        System.out.print("Enter payment amount: ");
	        int payment = scanner.nextInt();

	        if (payment < grandTotal) {
	            System.out.println("Insufficient payment. Please try again.");
	            return;
	        }

	        int change = payment - grandTotal;
	        System.out.println("Thank you for your purchase!");
	        System.out.println("Change: " + change);
	    }

	    private static boolean isValidPowkemoNType(String powkemonType) {
	        return powkemonType.equals("Fire")
	                || powkemonType.equals("Water")
	                || powkemonType.equals("Earth")
	                || powkemonType.equals("Thunder");
	    }

	    private static boolean isValidPowkemoNName(String powkemonName) {
	        int length = powkemonName.length();
	        return length >= 5 && length <= 20;
	    }

	    private static boolean isValidPowkemoNGeneration(int powkemonGeneration) {
	        return powkemonGeneration >= 1 && powkemonGeneration <= 8;
	    }

	    private static int getTypePrice(String powkemonType) {
	        switch (powkemonType) {
	            case "Fire":
	                return 500;
	            case "Water":
	                return 300;
	            case "Earth":
	                return 200;
	            case "Thunder":
	                return 250;
	            default:
	                return 0;
	        }
	    }

	    private static int getNamePrice(String powkemonName) {
	        int length = powkemonName.length();
	        if (length >= 15 && length <= 20) {
	            return 300;
	        } else if (length >= 10 && length <= 14) {
	            return 200;
	        } else if (length >= 5 && length <= 9) {
	            return 100;
	        } else {
	            return 0;
	        }
	    }
	}