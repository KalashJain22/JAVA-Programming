package kalash.jain.polymorphism;

public class Car extends Vehicle {
    Car() {
        super();
    }

    Car(int noOfTires) {
        super(noOfTires);
    }

    @Override
    public void start() {
        System.out.println(super.getNoOfTires());
        System.out.println("Car is Starting");
    }

    public int noOfDoors() {
        return 5;
    }
}