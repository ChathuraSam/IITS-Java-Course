public class Main {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        double num4 = 10.5;
        double num5 = 5.5;

        int sumOf2Ints = add(num1, num2);
        System.out.println("Sum is: " + sumOf2Ints);

        int sumOf3Ints = add(num1, num2,num3);
        System.out.println("Sum is: " + sumOf3Ints);
    }

    public static int add(int n1, int n2) {
        System.out.println("2 parameter method is called");
        return (n1+n2);
    }

    // overloading add method
    public static int add(int n1, int n2, int n3) {
        System.out.println("3 parameter method is called");
        return (n1+n2);

    }

    // overloading add method again
    public static void add(double n1, double n2) {
        System.out.println("doule value method is called");
    }

    // overloading - by changing the no OfArguments, by changing the data type of the arguments
}
