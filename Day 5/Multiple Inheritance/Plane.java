public class Plane implements LandVehicle, SkyVehicle{

    public void land() {
        System.out.println("Plane is landing with wheels....");
    }

    public void takeOff() {
        System.out.println("Plane is taking off from the ground...");
    }
}
