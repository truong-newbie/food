package cuoiki;

public interface ICarManager {
	public void addCar(Car e);
	public void updateCar( Car e);
	public void searchCarByID(int proid);
	public void searchCarByColor(String color);
	public double getTotalPrice();
	public void sortByPrice();
	public void sortByID();
}
