package pxrad.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DailyKitchen {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();
    private static boolean isFlashSale = false;

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            displayMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after reading the integer choice

            switch (choice) {
                case 1:
                    viewHomePage();
                    break;
                case 2:
                    viewCategories();
                    break;
                case 3:
                    viewTransactionHistory();
                    break;
                case 4:
                    viewFavorites();
                    break;
                case 5:
                    viewChat();
                    break;
                case 6:
                    viewProfile();
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exiting the Daily Kitchen app. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("\n======= Daily Kitchen Main Menu =======");
        System.out.println("1. Home Page (Beranda)");
        System.out.println("2. Categories (Kategori)");
        System.out.println("3. Transaction History (Riwayat)");
        System.out.println("4. Favorites (Favorit)");
        System.out.println("5. Chat");
        System.out.println("6. Profile (Profil)");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void viewHomePage() {
        System.out.println("\n======= Daily Kitchen Home Page =======");
        System.out.println("Welcome to Daily Kitchen!");
        if (isFlashSale) {
            System.out.println("Check out our Flash Sale items!");
            // Display flash sale products
            for (Product product : productList) {
                if (product.isBestSeller()) {
                    System.out.println(product.getName() + " - " + product.getPrice());
                }
            }
        } else {
            System.out.println("Discover our latest products, discounts, and free shipping vouchers.");
        }
    }

    private static void viewCategories() {
        System.out.println("\n======= Daily Kitchen Categories =======");
        System.out.println("Available Categories:");
        // Display categories
        System.out.println("1. Pan");
        System.out.println("2. Thermos");
        System.out.println("3. Jar");
        System.out.println("4. Plate");
        System.out.println("5. Glass");
        System.out.println("6. Bowl");
        // Add more categories as needed
    }

    private static void viewTransactionHistory() {
        System.out.println("\n======= Daily Kitchen Transaction History =======");
        // Implement transaction history logic here
        // Retrieve and display the user's transaction history
    }

    private static void viewFavorites() {
        System.out.println("\n======= Daily Kitchen Favorites =======");
        // Implement favorites logic here
        // Retrieve and display the user's favorite products
    }

    private static void viewChat() {
        System.out.println("\n======= Daily Kitchen Chat =======");
        // Implement chat logic here
        // Allow the user to chat with customer service representatives
    }

    private static void viewProfile() {
        boolean backToMainMenu = false;
        while (!backToMainMenu) {
            displayProfileMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after reading the integer choice

            switch (choice) {
                case 1:
                    editProfile();
                    break;
                case 2:
                    showPlatinumStatus();
                    break;
                case 3:
                    viewPaymentMethods();
                    break;
                case 4:
                    viewTransactionHistory();
                    break;
                case 5:
                    connectSocialMedia();
                    break;
                case 6:
                    showHelpCenter();
                    break;
                case 7:
                    viewSettings();
                    break;
                case 8:
                    viewDataPrivacySettings();
                    break;
                case 9:
                    showAboutUs();
                    break;
                case 10:
                    trackOrder();
                    break;
                case 11:
                    makeQuickPayment();
                    break;
                case 12:
                    backToMainMenu = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayProfileMenu() {
        System.out.println("\n======= Daily Kitchen Profile Menu =======");
        System.out.println("1. Edit Profile (Edit Profil)");
        System.out.println("2. Platinum Customer (Pelanggan Platinum)");
        System.out.println("3. Payment Methods (Metode Pembayaran)");
        System.out.println("4. Transaction History (Riwayat Transaksi)");
        System.out.println("5. Connect Social Media (Hubungkan Media Sosial)");
        System.out.println("6. Help Center (Pusat Bantuan)");
        System.out.println("7. Settings (Setelan)");
        System.out.println("8. Data Privacy Settings (Pengaturan Data dan Privasi)");
        System.out.println("9. About Us (Tentang Kami)");
        System.out.println("10. Track Order (Lacak Pesanan)");
        System.out.println("11. Quick Payment (Pembayaran Cepat - Fingerprint)");
        System.out.println("12. Back to Main Menu (Kembali ke Menu Utama)");
        System.out.print("Enter your choice: ");
    }

    private static void editProfile() {
        System.out.println("\n======= Daily Kitchen Edit Profile =======");
        // Implement edit profile logic here
        // Allow the user to modify their profile information
    }

    private static void showPlatinumStatus() {
        System.out.println("\n======= Daily Kitchen Platinum Customer =======");
        // Implement platinum customer logic here
        // Retrieve and display the user's platinum status
    }

    private static void viewPaymentMethods() {
        System.out.println("\n======= Daily Kitchen Payment Methods =======");
        // Implement payment methods logic here
        // Retrieve and display the available payment methods for the user
    }

    private static void connectSocialMedia() {
        System.out.println("\n======= Daily Kitchen Connect Social Media =======");
        // Implement connect social media logic here
        // Allow the user to connect their social media accounts
    }

    private static void showHelpCenter() {
        System.out.println("\n======= Daily Kitchen Help Center =======");
        // Implement help center logic here
        // Provide information and assistance to the user
    }

    private static void viewSettings() {
        System.out.println("\n======= Daily Kitchen Settings =======");
        // Implement settings logic here
        // Display general settings such as notifications and user preferences
    }

    private static void viewDataPrivacySettings() {
        System.out.println("\n======= Daily Kitchen Data Privacy Settings =======");
        // Implement data privacy settings logic here
        // Allow the user to manage their data privacy settings
    }

    private static void showAboutUs() {
        System.out.println("\n======= Daily Kitchen About Us =======");
        System.out.println("About Daily Kitchen:");
        System.out.println("We are an online shopping platform that offers a wide range of products for your kitchen needs.");
        System.out.println("We offer various brands and have 10,000 products available in our store.");
        System.out.println("Enjoy our fast delivery and take advantage of our special discounts and free shipping vouchers.");
    }

    private static void trackOrder() {
        System.out.println("\n======= Daily Kitchen Track Order =======");
        // Implement order tracking logic here
        // Allow the user to track the status of their orders
    }

    private static void makeQuickPayment() {
        System.out.println("\n======= Daily Kitchen Quick Payment =======");
        // Implement quick payment logic here
        // Allow the user to make fast payments using fingerprint authentication
    }
}

class Product {
    private String name;
    private double price;
    private boolean isBestSeller;

    public Product(String name, double price, boolean isBestSeller) {
        this.name = name;
        this.price = price;
        this.isBestSeller = isBestSeller;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBestSeller() {
        return isBestSeller;
    }

    public void setBestSeller(boolean bestSeller) {
        isBestSeller = bestSeller;
    }
}