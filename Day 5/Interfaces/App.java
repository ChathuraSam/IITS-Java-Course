public class App {
    public static void main(String[] args) {
        BusImpl newBus = new BusImpl();
        newBus.start();
        newBus.accelerate();
        newBus.stop();
    }
}
