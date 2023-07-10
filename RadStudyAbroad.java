package pxrad.java;

import java.util.Scanner;

public class RadStudyAbroad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEligible = true;

        System.out.println("=== Study Abroad Eligibility Check ===");
        System.out.println("1. Fill the Form");
        System.out.println("2. Exit");

        System.out.print("Choose an option (1-2): ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter your gender (F/M): ");
                String gender = scanner.next();

                if (!gender.equals("F") && !gender.equals("M")) {
                    System.out.println("Invalid gender input!");
                    break;
                }

                System.out.print("Enter your age: ");
                int age = scanner.nextInt();

                if (age < 20 || age > 30) {
                    System.out.println("Age must be between 20 and 30 (inclusive)!");
                    break;
                }

                System.out.print("Do you have motion sickness? (true/false): ");
                boolean hasMotionSickness = scanner.nextBoolean();

                System.out.print("Do you have any allergies? (true/false): ");
                boolean hasAllergies = scanner.nextBoolean();

                if (gender.equals("F")) {
                    System.out.print("Are you currently pregnant? (true/false): ");
                    boolean isPregnant = scanner.nextBoolean();

                    if (isPregnant) {
                        isEligible = false;
                    }
                }

                if (hasMotionSickness || hasAllergies) {
                    isEligible = false;
                }

                System.out.println("\n=== Eligibility Result ===");
                if (isEligible) {
                    System.out.println("Congratulations! You are eligible to study abroad.");
                } else {
                    System.out.println("Sorry, you are not eligible to study abroad.");
                }
                break;

            case 2:
                System.out.println("Thank you for using the Study Abroad Eligibility Check. Goodbye!");
                break;

            default:
                System.out.println("Invalid option selected!");
                break;
        }

        scanner.close();
    }
}