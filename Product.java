package cuoiki;

public abstract class Product {
	protected int proid;
	protected String name;
	protected int quantity;
	protected double price;
	public abstract double  discount (int quantity);
	public Product(int proid, String name, int quantity, double price) {
		super();
		this.proid = proid;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public Product() {
		super();
	}
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [proid=" + proid + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}
