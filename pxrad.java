package pxrad.java;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class pxrad {
	    private static List<Coffee> coffeeList = new ArrayList<>();
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        boolean exit = false;
	        while (!exit) {
	            displayMenu();
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character after reading the integer choice

	            switch (choice) {
	                case 1:
	                    addNewCoffee();
	                    break;
	                case 2:
	                    viewAllCoffee();
	                    break;
	                case 3:
	                    updateCoffee();
	                    break;
	                case 4:
	                    deleteCoffee();
	                    break;
	                case 5:
	                    exit = true;
	                    System.out.println("Exiting the application. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    private static void displayMenu() {
	        System.out.println("\n======= Cafe Vibes Menu =======");
	        System.out.println("1. Add new coffee");
	        System.out.println("2. View all coffee");
	        System.out.println("3. Update coffee");
	        System.out.println("4. Delete coffee");
	        System.out.println("5. Exit");
	        System.out.print("Enter your choice: ");
	    }

	    private static void addNewCoffee() {
	        System.out.print("Enter coffee name: ");
	        String name = scanner.nextLine();

	        if (isCoffeeNameTaken(name)) {
	            System.out.println("Coffee name already exists. Please try again.");
	            return;
	        }

	        System.out.print("Enter coffee price: ");
	        double price = scanner.nextDouble();

	        if (price < 0 || price > 25000) {
	            System.out.println("Invalid price. Price must be between 0 and 25000 (inclusive).");
	            return;
	        }

	        System.out.print("Enter coffee quantity: ");
	        int quantity = scanner.nextInt();

	        if (quantity < 0 || quantity > 100) {
	            System.out.println("Invalid quantity. Quantity must be between 0 and 100 (inclusive).");
	            return;
	        }

	        scanner.nextLine(); // Consume newline character after reading the integer quantity

	        System.out.print("Enter the captcha: ");
	        String captchaInput = scanner.nextLine();
	        String generatedCaptcha = generateCaptcha();

	        if (!captchaInput.equals(generatedCaptcha)) {
	            System.out.println("Invalid captcha. Please try again.");
	            return;
	        }

	        Coffee coffee = new Coffee(name, price, quantity);
	        coffeeList.add(coffee);
	        System.out.println("Coffee added successfully!");
	    }

	    private static void viewAllCoffee() {
	        if (coffeeList.isEmpty()) {
	            System.out.println("No data!");
	            return;
	        }

	        System.out.println("\n======= Coffee Menu =======");
	        for (int i = 0; i < coffeeList.size(); i++) {
	            Coffee coffee = coffeeList.get(i);
	            System.out.println("Index: " + i);
	            System.out.println("Name: " + coffee.getName());
	            System.out.println("Price: " + coffee.getPrice());
	            System.out.println("Quantity: " + coffee.getQuantity());
	            System.out.println();
	        }
	    }

	    private static void updateCoffee() {
	        if (coffeeList.isEmpty()) {
	            System.out.println("No data!");
	            return;
	        }

	        viewAllCoffee();
	        System.out.print("Enter the index of the coffee to update: ");
	        int index = scanner.nextInt();

	        if (index < 0 || index >= coffeeList.size()) {
	            System.out.println("Invalid index. Please try again.");
	            return;
	        }

	        scanner.nextLine(); // Consume newline character after reading the integer index

	        Coffee coffee = coffeeList.get(index);
	        System.out.print("Enter new coffee name: ");
	        String newName = scanner.nextLine();

	        if (!newName.equals(coffee.getName()) && isCoffeeNameTaken(newName)) {
	            System.out.println("Coffee name already exists. Please try again.");
	            return;
	        }

	        System.out.print("Enter new coffee price: ");
	        double newPrice = scanner.nextDouble();

	        if (newPrice < 0 || newPrice > 25000) {
	            System.out.println("Invalid price. Price must be between 0 and 25000 (inclusive).");
	            return;
	        }

	        System.out.print("Enter new coffee quantity: ");
	        int newQuantity = scanner.nextInt();

	        if (newQuantity < 0 || newQuantity > 100) {
	            System.out.println("Invalid quantity. Quantity must be between 0 and 100 (inclusive).");
	            return;
	        }

	        coffee.setName(newName);
	        coffee.setPrice(newPrice);
	        coffee.setQuantity(newQuantity);
	        System.out.println("Coffee updated successfully!");
	    }

	    private static void deleteCoffee() {
	        if (coffeeList.isEmpty()) {
	            System.out.println("No data!");
	            return;
	        }

	        viewAllCoffee();
	        System.out.print("Enter the index of the coffee to delete: ");
	        int index = scanner.nextInt();

	        if (index < 0 || index >= coffeeList.size()) {
	            System.out.println("Invalid index. Please try again.");
	            return;
	        }

	        coffeeList.remove(index);
	        System.out.println("Coffee deleted successfully!");
	    }

	    private static boolean isCoffeeNameTaken(String name) {
	        for (Coffee coffee : coffeeList) {
	            if (coffee.getName().equalsIgnoreCase(name)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    private static String generateCaptcha() {
	        // Generate a random captcha here and return it as a string
	        // You can use libraries or custom logic to generate the captcha
	        // For simplicity, let's return a fixed captcha for now
	        return "1712";
	    }
	}

	class Coffee {
	    private String name;
	    private double price;
	    private int quantity;

	    public Coffee(String name, double price, int quantity) {
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
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

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;}

	public void pxrad() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
