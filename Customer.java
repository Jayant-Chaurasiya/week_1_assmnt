package main;

import java.util.Scanner;

import stock.Inventory;

public class Customer extends Order {
	static String choice;
	static int qty;
	public static void main(String[] args) {
		
		Inventory.acessriesObject();
		Inventory.laptopObject();
		Customer c1=new Customer();
		c1.order(c1);
		c1.order(c1);		

	}
	public static void order(Customer c) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Choice : that you want to buy (Laptop/Accessories) : ");
		choice=sc.nextLine().toLowerCase();
		System.out.println("Enter the quantity you want to buy : ");
		qty=sc.nextInt();
		
		switch (choice) {
		case "laptop":c.getLaptop(qty);	
		c=null;
		break;
		case "accessories":c.getAccessories(qty);
		c=null;
		break;

		default:System.out.println("Soory Wrong Choice ! Please try Again");
		
			break;
			
		}
	}

}
