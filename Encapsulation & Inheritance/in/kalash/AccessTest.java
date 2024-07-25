package in.kalash;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Red";
        car.model = "Swift";
        System.out.println(car);
        car.costOfPurchase = 2354;

        Car newCar = new Car("Red", "BMW", 1, 5000);
        System.out.println(newCar);

        Default def = new Default();
    }
}
