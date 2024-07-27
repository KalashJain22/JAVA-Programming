package kalash.jain.abstraction;

public abstract class Vehicle implements Transpost {
    private int noOfTires;

    public abstract void makeStartSound();
    
    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    @Override
    public void getSetGo() {
        System.out.println("going to place");
    }

    public int getNoOfTires() {
        return noOfTires;
    } 
    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute() {
        System.out.println("Going");
    }
}