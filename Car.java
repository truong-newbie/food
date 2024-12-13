package cuoiki;

public class Car extends Product {
	protected String color;
	protected int weight;
	
	public Car(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	public Car(int proid, String name, int quantity, double price, String color, int weight) {
		super(proid, name, quantity, price);
		this.color = color;
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return super.toString()+ "Car [color=" + color + ", weight=" + weight + "]";
	}
	public double discount(int quantity) {
		if(quantity >10)	return 0.1*price;
		else 				return 0;
	}
	
	
}
