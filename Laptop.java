package material;

import stock.Inventory;

public class Laptop extends Inventory {
	private  int LaptopId;
	private  String LaptopName;
	private int LaptopPrice;
	public static int lowOrderLevelQuantity=3;
	public static int quantity;
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop( int laptopId, String laptopName, int laptopPrice) {
		super();
		LaptopId = laptopId;
		LaptopName = laptopName;
		LaptopPrice = laptopPrice;
		quantity+=1;
	}

	public String getLaptopName() {
		return LaptopName;
	}

	public void setLaptopName(String laptopName) {
		LaptopName = laptopName;
	}

	public int getLaptopPrice() {
		return LaptopPrice;
	}

	public void setLaptopPrice(int laptopPrice) {
		LaptopPrice = laptopPrice;
	}

	public int getLowOrderLevelQuantity() {
		return lowOrderLevelQuantity;
	}

	public void setLowOrderLevelQuantity(int lowOrderLevelQuantity) {
		this.lowOrderLevelQuantity = lowOrderLevelQuantity;
	}

	public static int getQuantity() {
		return quantity;
	}

	public static void setQuantity(int quantity) {
		Laptop.quantity = quantity;
	}

	public int getLaptopId() {
		return LaptopId;
	}

	@Override
	public String toString() {
		return "Laptop [LaptopId=" + LaptopId + ", LaptopName=" + LaptopName + ", LaptopPrice=" + LaptopPrice
				+ ", lowOrderLevelQuantity=" + lowOrderLevelQuantity + "]";
	}
	
	
	
	
	

}
