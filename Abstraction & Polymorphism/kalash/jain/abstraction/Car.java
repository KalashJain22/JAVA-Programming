package kalash.jain.abstraction;

public class Car extends Vehicle {
    private int noOfDoors;

    @Override
    public void makeStartSound() {
        System.out.println("Vrommm.....");   
    }

    public Car() {
        super(4);
    }
}