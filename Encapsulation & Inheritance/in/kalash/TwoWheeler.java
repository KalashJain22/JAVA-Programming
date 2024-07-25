package in.kalash;

import in.kalash.inheritance.Vehicle;

public class TwoWheeler extends Vehicle{
    public TwoWheeler() {
        setNumberOfTires(2);
        noOfTires = 3;
    }

    public void balance() {
        System.out.println("I am balancing on two tyres");
    }
}