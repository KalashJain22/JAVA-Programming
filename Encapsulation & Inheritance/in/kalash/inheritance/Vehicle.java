package in.kalash.inheritance;

public class Vehicle {
    protected int noOfTires;

    public void setNumberOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Vehicle no. of tires: " + noOfTires;
    }
    
    public void commute() {
        System.out.printf("I am going from A to place B using %d tires\n", noOfTires);
    }
}