package cuoiki;

import java.util.Scanner;

public class CarManager implements ICarManager {
	Scanner sc= new Scanner(System.in);
	private Car[] car;
	private int size;
	public CarManager(int capacity) {
        car = new Car[capacity];
        size = 0;
    }

    @Override
    public void addCar(Car e) {
        if (size >= car.length) {
            System.out.println("Không thể thêm xe mới");
            return;
        }
        car[size++] = e;
    }

	@Override
	public void updateCar(Car e) {
		boolean tim=false;
		for(Car x : car) {
			if(x.getProid() == e.getProid()) {
				tim= true;
				String name= sc.nextLine();
				int quantity= sc.nextInt();
				double price= sc.nextDouble();
				String color= sc.nextLine();
				int weight= sc.nextInt();
			}
		}
		if(!tim) {
			System.out.print("Khongg tim thay");
		}
		
	}

	@Override
	public void searchCarByID(int proid) {
		boolean tim= false;
		for(Car x: car) {
			if(x.getProid() == proid) {
				tim=true;
				System.out.println("tom tai xe nay");
			}
		}
		if(!tim) {
			System.out.println("khong tim thay ");
		}
		
		
	}

	@Override
	public void searchCarByColor(String color) {
		boolean tim= false;
		for(Car x: car) {
			if(x.getColor().equals(color)) {
				tim=true;
				System.out.println("tom tai xe nay");
			}
		}
		if(!tim) {
			System.out.println("khong tim thay ");
		}
		
	}

	@Override
	public double getTotalPrice() {
		double total=0;
		for(Car x: car) {
			if (car != null) {
                total += x.getPrice();
            }
		}
		return total;
		
	}

	@Override
	public void sortByPrice() {
		for(int i=0; i< size ; i++) {
			for(int j=i+1; j<size;j++ ) {
				if(car[i].getPrice() < car[j].getPrice()) {
					Car e= car[i];
					car[i]= car[j];
					car[j]= e;
				}
			}
		}
		
	}

	@Override
	public void sortByID() {
		for(int i=0; i< size ; i++) {
			for(int j=i+1; j<size;j++ ) {
				if(car[i].getProid() < car[j].getProid()) {
					Car e= car[i];
					car[i]= car[j];
					car[j]= e;
				}
			}
		}
		
	}
}
