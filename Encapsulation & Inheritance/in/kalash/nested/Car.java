package in.kalash.nested;

public class Car {
    private int noOfDoors;

    public void repair() {
        Tyre t = new Tyre();
    }

    protected class Tyre {
        private double width;
        private double pressure;
        private String material;

        public void inflate() {
            noOfDoors = 4;
        }
    }   
}