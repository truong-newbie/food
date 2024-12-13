package cuoiki;

public class Main {
    public static void main(String[] args) {
        try {
            CarManager manager = new CarManager(10);

            // Thêm xe
            try {
                manager.addCar(new Car(1, "Toyota", 5, 30000, "Red", 1500));
                manager.addCar(new Car(2, "Honda", 12, 25000, "Blue", 1400));
                manager.addCar(new Car(3, "Ford", 8, 28000, "Red", 1600));
                manager.addCar(new Car(4, "BMW", 7, 35000, "Black", 1700));
            } catch (Exception e) {
                System.err.println("Lỗi khi thêm xe: " + e.getMessage());
            }

            // Hiển thị tổng giá
            try {
                System.out.println("Tổng giá: " + manager.getTotalPrice());
            } catch (Exception e) {
                System.err.println("Lỗi khi tính tổng giá: " + e.getMessage());
            }

            // Tìm xe theo màu
            try {
            	manager.searchCarByColor("Red");
            } catch (Exception e) {
                System.err.println("Lỗi khi tìm kiếm xe theo màu: " + e.getMessage());
            }

            // Sắp xếp theo giá
            try {
                manager.sortByPrice();
            } catch (Exception e) {
                System.err.println("Lỗi khi sắp xếp hoặc hiển thị xe: " + e.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Lỗi chung trong chương trình: " + e.getMessage());
        }
    }
}
