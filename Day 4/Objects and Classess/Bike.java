public class Bike {
    // states are variables
    int maxSpeed;
    String brand;
    int cylinderCapacity;

    // no args constructor
    public Bike() {}

    // parameterized constructor
    public Bike(int maxSpeed, String brand, int cylinderCapacity){
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.cylinderCapacity = cylinderCapacity;
    }

    // behaviours are methods
    public void start() {
        System.out.println("Bike Started!");
    }

    public void accelarate() {
        System.out.println("Bike Accelerating!!!");
    }
}
