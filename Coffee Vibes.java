import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class Latramerame {
	Scanner scan = new Scanner (System.in);
	Random rand = new Random();
	int choose;
	String name;
	ArrayList<String> name1 = new ArrayList<>();
	ArrayList<Integer> price1 = new ArrayList<>();
	ArrayList<Integer> quantity1 = new ArrayList<>();
	String as;
	String bs;
	String cs;
	String ds;
	int price;
	int quantity;
	int a;
	int b;
	int c;
	int d;
	String captcha;
	String inputCaptcha;
	int total = 0;
	int edit;
	int delete;

	public Latramerame() {
		// TODO Auto-generated constructor stub
		menu();
	}

	public void menu() {
		System.out.println("Welcome to Coffee Vibes");
		System.out.println("=======================");
		System.out.println("1. Add new coffee");
		System.out.println("2. View all coffee");
		System.out.println("3. Update coffee");
		System.out.println("4. Delete coffee");
		System.out.println("5. Exit");
		
		do {
			System.out.println(">>");
			choose = scan.nextInt();
			if (choose ==1) {
				total = total + 1;
				do {
					System.out.print("Input coffee's name [Nama harus]: ");
					name = scan.next();
					name = name+scan.nextLine();
					if (!name.equals("")) {
						System.out.print("Coffee's name must be unique and cannot be empty.");
					}
				} while (name.equals(""));
				name1.add(name);
				
				do {
					System.out.println("Input coffee's Price [0-25000]: ");
					price = scan.nextInt();
					if (price < 0 || price > 25000) {
						System.out.println("Please input coffee price.");
					}
				} while (price < 0 || price > 25000);
				price1.add(price);
				
				do {
					System.out.println("Input coffee quantity [0-100]: ");
					quantity = scan.nextInt();
					if (quantity < 0 || quantity > 100) {
						System.out.println("Please input coffee quantity.");
					}
				} while (quantity < 0 || quantity > 100);
				quantity1.add(quantity);
				
				a = rand.nextInt(9-1)+1;
				as = Integer.toString(a);
				b = rand.nextInt(9);
				bs = Integer.toString(b);
				c = rand.nextInt(9);
				cs = Integer.toString(c);
				d = rand.nextInt(9);
				ds = Integer.toString(d);
				captcha = as + bs + cs +ds;
				
				do {
					System.out.println("Input captcha [" + captcha + "]: ");
					inputCaptcha = scan.next();
					inputCaptcha = inputCaptcha + scan.nextLine();
					if (!inputCaptcha.equals(captcha)) {
						System.out.println("");
					}
				} while (!inputCaptcha.equals(captcha));
				System.out.println("Success!");
				System.out.println("Press enter to continue..");
				try {
					System.in.read();
				} catch (Exception e) {}
				menu();
				break;
				
			} else if (choose == 2) {
				if (total == 0) {
					System.out.println("No data!");
				} else if (total > 0) {
				System.out.println("=======================================================================");
				System.out.println("Index|Name                      |Price                  |Quantity      ");
				System.out.println("=======================================================================");
				
				for (int i = 0; i < total; i++) {
					System.out.println("|" + (i+1) + "|" + name1.get(i) + "\t\t\t|" + price1.get(i) + "\t\t\t|" + quantity1.get(i) + "|");
				}
				System.out.println("=======================================================================");
				}
				try {
					System.in.read();
				} catch (Exception e) {}
				menu();
				break;
			} else if (choose == 3) {
				if (total == 0) {
					System.out.println("No data!");
				} else if (total > 0) {
				System.out.println("=======================================================================");
				System.out.println("Index|Name                      |Price                 |Quantity       ");
				System.out.println("=======================================================================");
				
				for (int i = 0; i < total; i++) {
					System.out.println("|" + (i+1) + "|" + name1.get(i) + "\t\t\t|" + price1.get(i) + "\t\t\t|" + quantity1.get(i) + "|");
				}
				System.out.println("=======================================================================");
				do {
					System.out.print("Input index [1 -" + total + "]: ");
					edit = scan.nextInt();
				} while (edit > total || edit < 1);
				
				do {
					System.out.println("Input coffee's name [Nama harus]: ");
					name = scan.next();
					name = name+scan.nextLine();
					if (!name.equals(" ")) {
						System.out.println("Coffee's name must be unique and cannot be empty.");
					}
				} while (name.equals(" "));
				name1.set(edit-1, name);
				
				do {
					System.out.println("Input coffee's Price [0-25000]: ");
					price = scan.nextInt();
					if (price < 0 || price > 25000) {
						System.out.println("Please input coffee price.");
					}
				} while (price < 0 || price > 25000);
				price1.set(edit-1, price);
				
				do {
					System.out.println("Input coffee quantity [0-100]: ");
					quantity = scan.nextInt();
					if (quantity < 0 || quantity > 100) {
						System.out.println("Please input coffee quantity.");
					}
				} while (quantity < 0 || quantity > 100);
				quantity1.set(quantity-1, quantity);
				
				System.out.println("Succesfully updated!");
				System.out.println("Press enter to continue..");
				try {
					System.in.read();
				} catch (Exception e) {}
				menu();
				break;
				
				} else if (choose == 4 ) {
				}
					if (total == 0) {
						System.out.println("No data!");
					} else if (total > 0) {
					System.out.println("=======================================================================");
					System.out.println("Index|Name                      |Price                  |Quantity    1 ");
					System.out.println("=======================================================================");
					
					for (int i = 0; i < total; i++) {
						System.out.println("|" + (i+1) + "|" + name1.get(i) + "\t\t\t|" + price1.get(i) + "\t\t|" + quantity1.get(i) + "|");
					}
					System.out.println("=======================================================================");
				}
					do {
						System.out.println("Input Index [1-" + total + "]: ");
						delete = scan.nextInt();
					} while (delete > total || delete < 1);
					name1.remove(name);
					price1.remove(price);
					quantity1.remove(quantity);
					System.out.println("Succesfully deleted.");
					System.out.println("Press enter to continue..");
					try {
						System.in.read();
					} catch (Exception e) {}
					menu();
					break;
					
				} else if (choose == 5)
					System.exit(0);
			
		} while (choose<1 || choose>5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Latramerame();
	}
}
