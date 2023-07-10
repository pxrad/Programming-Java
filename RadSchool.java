package pxrad.java;

import java.util.Date;
import java.util.Scanner;

public class RadSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter your date of birth (yyyy-MM-dd): ");
        String dobString = scanner.nextLine();
        Date dob = parseDate(dobString);

        System.out.print("Enter your desired major: ");
        String major = scanner.nextLine();

        System.out.print("Enter the average value of your report card: ");
        double averageValue = scanner.nextDouble();

        // Display the user's information
        System.out.println("\nRegistration Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Desired Major: " + major);
        System.out.println("Average Value of Report Card: " + averageValue);

        // Close the scanner
        scanner.close();
    }

    private static Date parseDate(String dateString) {
        // Implement date parsing logic here
        // You can use SimpleDateFormat or any other date parsing method

        // For simplicity, let's assume the date is in the format yyyy-MM-dd
        // You can modify this method to handle different date formats

        // Dummy implementation - just return the current date
        return new Date();
    }
}