package material;

import stock.Inventory;

public class Accessories extends Inventory {
	
	private  int accessoryId;
	private  String accessoryName;
	private int accessoryPrice;
	public static int lowOrderLevelQuantity=5;
	public static int quantity;
	

	public Accessories(int accessoryId, String accessoryName, int accessoryPrice) {
		super();
		
		this.accessoryId = accessoryId;
		this.accessoryName = accessoryName;
		this.accessoryPrice = accessoryPrice;
		quantity+=1;
		
	}

	public String getAccessoryName() {
		return accessoryName;
	}

	public void setAccessoryName(String accessoryName) {
		this.accessoryName = accessoryName;
	}
	
	public static int getQuantity() {
		return Accessories.quantity;
	}

	

	public int getAccessoryPrice() {
		return accessoryPrice;
	}

	public void setAccessoryPrice(int accessoryPrice) {
		this.accessoryPrice = accessoryPrice;
	}


	public int getAccessoryId() {
		return accessoryId;
	}

	@Override
	public String toString() {
		return "Accessories [accessoryId=" + accessoryId + ", accessoryName=" + accessoryName + ", accessoryPrice="
				+ accessoryPrice + ", lowOrderLevelQuantity=" + lowOrderLevelQuantity + "]";
	}
	

}
