package pxrad.java;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class DarLaundry {
	    private static Scanner scanner = new Scanner(System.in);
	    private static List<Order> orderList = new ArrayList<>();
	    private static int orderCount = 1;

	    public static void main(String[] args) {
	        boolean exit = false;
	        while (!exit) {
	            displayMainMenu();
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character after reading the integer choice

	            switch (choice) {
	                case 1:
	                    placeOrder();
	                    break;
	                case 2:
	                    checkOrderStatus();
	                    break;
	                case 3:
	                    viewOrderHistory();
	                    break;
	                case 4:
	                    viewProfile();
	                    break;
	                case 5:
	                    exit = true;
	                    System.out.println("Exiting the Dar's Laundry app. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    private static void displayMainMenu() {
	        System.out.println("\n======= Dar's Laundry Main Menu =======");
	        System.out.println("1. Place Order (Pesan Layanan)");
	        System.out.println("2. Check Order Status (Cek Status Pesanan)");
	        System.out.println("3. View Order History (Riwayat Pesanan)");
	        System.out.println("4. View Profile (Profil)");
	        System.out.println("5. Exit");
	        System.out.print("Enter your choice: ");
	    }

	    private static void placeOrder() {
	        System.out.println("\n======= Place Order =======");
	        System.out.print("Select Service (Cuci Kering, Cuci Setrika, Cuci Satuan, etc.): ");
	        String service = scanner.nextLine();

	        System.out.print("Enter Pickup Time: ");
	        String pickupTime = scanner.nextLine();

	        System.out.print("Enter Delivery Time: ");
	        String deliveryTime = scanner.nextLine();

	        System.out.print("Enter Contact Information: ");
	        String contactInfo = scanner.nextLine();

	        System.out.print("Enter Pickup Address: ");
	        String pickupAddress = scanner.nextLine();

	        System.out.print("Enter Delivery Address: ");
	        String deliveryAddress = scanner.nextLine();

	        Order newOrder = new Order(orderCount, service, pickupTime, deliveryTime, contactInfo, pickupAddress, deliveryAddress);
	        orderList.add(newOrder);
	        orderCount++;

	        System.out.println("Order placed successfully!");
	    }

	    private static void checkOrderStatus() {
	        System.out.println("\n======= Check Order Status =======");
	        System.out.print("Enter Order Number: ");
	        int orderNumber = scanner.nextInt();
	        scanner.nextLine(); // Consume newline character after reading the integer orderNumber

	        boolean found = false;
	        for (Order order : orderList) {
	            if (order.getOrderNumber() == orderNumber) {
	                System.out.println("Order Number: " + order.getOrderNumber());
	                System.out.println("Status: " + order.getStatus());
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Order not found. Please check your order number.");
	        }
	    }

	    private static void viewOrderHistory() {
	        System.out.println("\n======= Order History =======");
	        if (orderList.isEmpty()) {
	            System.out.println("No orders yet.");
	        } else {
	            for (Order order : orderList) {
	                System.out.println("Order Number: " + order.getOrderNumber());
	                System.out.println("Service: " + order.getService());
	                System.out.println("Status: " + order.getStatus());
	                System.out.println("-----------------------");
	            }
	        }
	    }

	    private static void viewProfile() {
	        System.out.println("\n======= Profile =======");
	        System.out.println("Name: John Doe");
	        System.out.println("Phone Number: 1234567890");
	        System.out.println("Address: 123 Street, City");
	    }
	}

	class Order {
	    private int orderNumber;
	    private String service;
	    private String pickupTime;
	    private String deliveryTime;
	    private String contactInfo;
	    private String pickupAddress;
	    private String deliveryAddress;
	    private String status;

	    public Order(int orderNumber, String service, String pickupTime, String deliveryTime, String contactInfo,
	                 String pickupAddress, String deliveryAddress) {
	        this.orderNumber = orderNumber;
	        this.service = service;
	        this.pickupTime = pickupTime;
	        this.deliveryTime = deliveryTime;
	        this.contactInfo = contactInfo;
	        this.pickupAddress = pickupAddress;
	        this.deliveryAddress = deliveryAddress;
	        this.status = "Pending"; // Default status is "Pending"
	    }

	    // Getters and setters

	    public int getOrderNumber() {
	        return orderNumber;
	    }

	    public String getService() {
	        return service;
	    }

	    public String getPickupTime() {
	        return pickupTime;
	    }

	    public String getDeliveryTime() {
	        return deliveryTime;
	    }

	    public String getContactInfo() {
	        return contactInfo;
	    }

	    public String getPickupAddress() {
	        return pickupAddress;
	    }

	    public String getDeliveryAddress() {
	        return deliveryAddress;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }
	}