public class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpped;
    String name;
    String modelNumber;
    String company;

    public Car(int noOfWheels, int noOfDoors, int maxSpped, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpped = maxSpped;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    // @Override
    // public String toString() {
    //     // To do Auto-generated method stub
    //     return "Car{" + 
    //             "noOfWheels = " + noOfWheels +
    //             ", noOfDoors = " + noOfDoors +
    //             ", maxSpped = " + maxSpped +
    //             ", name = '" + name + '\'' +
    //             ", modelNumber = '" + modelNumber + '\'' +
    //             ", company = '" + company + '\'' +
    //             '}';
    // }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("noOfWheels = ").append(noOfWheels);
        sb.append(", noOfDoors = ").append(noOfDoors);
        sb.append(", maxSpeed = ").append(maxSpped);
        sb.append(", name = '").append(name).append('\'');
        sb.append(", modelNumber = '").append(modelNumber).append('\'');
        sb.append(", company = '").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Car swift = new Car(4, 4, 120, "Swift", "SW896", "Maruti");
        // System.out.println(swift.toString());
        System.out.println(swift);
    }
}