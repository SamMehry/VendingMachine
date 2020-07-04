package VendingMachine;

public class Product {

	

	private String name;
	private double price;
	private int size;
	private String location;
	private int quantity;

	
	
	
	public Product() {
		super();
	}

	public Product(String name, double price, int size, String location, int quantity) {
	
		this.name = name;
		this.price = price;
		this.size = size;
		this.location = location;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getSize() {
		return size;
	}

	public String getLocation() {
		return location;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setSize(int size) {
		System.out.println(size++);
		setSize(size);
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
