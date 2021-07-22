package stock;

import java.util.ArrayList;
import java.util.List;

import material.Accessories;
import material.Laptop;

public class Inventory {
	static int quantity;
	static int lowOrderLevelQWuantity;

	

	public static void laptopObject() {
		Laptop l = new Laptop(1, "Dell", 30000);
		List<Laptop> li2 = new ArrayList<Laptop>();
		li2.add(l);
		li2.add(new Laptop(1, "Lenovo", 50000));
		li2.add(new Laptop(2, "Acer", 38000));
		li2.add(new Laptop(3, "Samsung", 35000));
		li2.add(new Laptop(4, "HP", 30000));

	}

	public static void acessriesObject() {
		Accessories a = new Accessories(2, "Charger", 350);
		List<Accessories> li = new ArrayList<Accessories>();
		li.add(a);
		li.add(new Accessories(1, "HeadPhone", 250));
		li.add(new Accessories(3, "Pin", 50));
		li.add(new Accessories(4, "Cable", 150));
		li.add(new Accessories(5, "Battery", 550));
		li.add(new Accessories(6, "Type C", 2050));
		li.add(new Accessories(7, "Type B", 1250));
		li.add(new Accessories(8, "Cover", 850));
		li.add(new Accessories(9, "Folder", 950));
		li.add(new Accessories(10, "Touch", 1050));
	}

}
