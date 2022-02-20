import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("********Student management System*********");
        System.out.println("Enter Student ID:");
        int studentId = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());

        Student student = new Student(studentId, firstName, lastName, age);

        System.out.println(student);


        System.out.println("do you want to change firt Name (yes, no)?");

        String userChoice = scanner.nextLine(); // yes, no
        boolean choiceInBoolean;

        if(userChoice.equals("yes")) {
            choiceInBoolean = true;
        }else{
            choiceInBoolean = false;
        }

        if(choiceInBoolean) {
            System.out.println("Ok then. enter new name:");
            String newName = scanner.nextLine();
            student.setFirstName(newName);
        }else{
            System.out.println("Have a nice day!");
        }

        System.out.println(student);
    }
}
