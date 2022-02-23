public class ConstructorOverloading {

    int number;

    // a constructor
    public ConstructorOverloading() {
        System.out.println("Hi Im a Constructor");
    }

    // overloaded constructor
    public ConstructorOverloading(int number) {
        System.out.println("Hi Im also a Constructor with different arguments");
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(10);
    }

}
