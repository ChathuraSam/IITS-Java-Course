import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        // To get the user input, we need to import Scanner Class. Check the imports at the top of the code
        // Then create a object of Scanner Class
        Scanner sc = new Scanner(System.in);

        // We use nextInt() method to get a integer input
        System.out.println("Enter a Number : ");
        int num1 = sc.nextInt();
        System.out.println("The number you entered is : "+num1);
    }
}
