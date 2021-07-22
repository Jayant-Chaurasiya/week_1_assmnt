package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import material.Accessories;
import material.Laptop;
import stock.Inventory;

public class Order extends Inventory {
	Laptop l;
	Accessories a;
	

	public void getLaptop(int qty)
	{
		
		System.out.println("Total Quantity of Laptops : "+Laptop.getQuantity());
		System.out.println("Low Order Level Quantity for Laptop : "+Laptop.lowOrderLevelQuantity);
		
		if(Laptop.getQuantity()-qty>=Laptop.lowOrderLevelQuantity)
		{
			System.out.println("Order Placed Suceessfully");
			
			Laptop.quantity=Laptop.getQuantity()-qty;
			
			
		}
		else
		{
			System.out.println("Request for Material");
		}
	}
	
	public void getAccessories(int qty)
	{
		
		System.out.println("Total Quantity of Accessories : "+Accessories.getQuantity());
		System.out.println("Low Order Level Quantity for Accessories : "+Accessories.lowOrderLevelQuantity);
		if(Accessories.getQuantity()-qty>=Accessories.lowOrderLevelQuantity)
		{
			System.out.println("Order Placed Suceessfully");
			Accessories.quantity=Accessories.getQuantity()-qty;
			
		}
		else
		{
			System.out.println("Request for Material");
		}
	}
	

}
