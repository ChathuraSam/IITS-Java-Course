public class BikeApp {
    public static void main(String[] args) {
        Bike b = new Bike();

        // set the state values
        b.brand = "honda";
        b.cylinderCapacity = 100;
        b.maxSpeed = 250;

        System.out.println("Max speed is : "+b.maxSpeed);
        System.out.println("Cylinder capacity is : "+b.cylinderCapacity);
        System.out.println("Brand is : "+b.brand);

        // accessing the behaviours
        b.start();
        b.accelarate();
    }
}
