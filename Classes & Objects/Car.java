public class Car {
    
    //Instance Variables 
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuel;
    int noOfSeats;
    
    //Static keyword
    static int noOfCarsSold; //acts as a universal variable
    static {
        noOfCarsSold = 0;
        System.out.println("I am in static block"); //only runs one time when class is load
    }

    //Code Block
    {
        noOfCarsSold++;
        System.out.println("I am in intializtion block"); //runs every time with creation of objects
    }

    //Constructor
    /**
     * if we add add parameters in default constructor it will be parameterized constructor
     * @param color
     */
    Car() {
        this("Black");
        currentFuel = 5;
    }
    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuel = 2;
        noOfSeats = 5;
    }

    //Instance Method
    /**
     * in this "this" keyword is use to return the Car reference
     * @return
     */
    public Car start() {
        if(currentFuel == 0) {
            System.out.println("Car is out of fuel, can not start");
        } else if(currentFuel <= 5) {
            System.out.println("Car is in reserved mode, please refuel");
        } else {
            System.out.println("Car is started");
        }
        return this;
    }
    public void drive() {
        currentFuel--;
        System.out.println("Car is driving");  
    }
    /**
     * in this "this" keyword is use to utilize same name as different
     * @param currentFuel
     */
    public void addFuel(float currentFuel) {
        this.currentFuel += currentFuel;
    }
    public float getCurrentFuel() {
        return currentFuel;
    }

    //Finalize method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("I am in finalizes");
    }
}
