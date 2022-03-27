import dao.DbConnect;
import dao.StudentDAO;
import model.Student;

import java.sql.Connection;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;


/**
 * @author chathura
 * @Date 2022-03-27
 */
public class App {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        boolean exitProgram = false;
        App studentMgSys = new App(); // Create an instance of the App class

        while (!exitProgram) {
            System.out.println("\nDo you want to continue? y/n");
            char choice = sc.nextLine().charAt(0); // you can get the character value in the start of the string
            if(choice == 'y' || choice == 'Y') {
                exitProgram = false;
            }else if(choice == 'n' || choice == 'N') {
                System.out.println("Thank you for Using Student Management System!");
                exitProgram = true;
                break;
            }else{
                System.out.println("The input you entered is not recognized and continue to menu!");
            }

            System.out.println("\n##### Student Management System #####");
            System.out.println("=====================================");
            System.out.println("Main Menu:");
            System.out.println("(1). Add student");
            System.out.println("(2). Get All Students");
            System.out.println("(3). Search Student by ID");
            System.out.println("(4). Search Student by Name");
            System.out.println("(5). Update Student");
            System.out.println("(6). Delete Student");
            System.out.print("Press a number and hit enter >> "); // see carefully I have used a print only. not print(ln)
            int userOption = Integer.parseInt(sc.nextLine());
            System.out.println("=====================================");

            switch (userOption){
                case 1:
                    studentMgSys.addStudent();
                    break;

                case 2:
                    studentMgSys.selectAllStudents();
                    break;

                case 3:
                    studentMgSys.selectStudentById();
                    break;

                case 4:
                    studentMgSys.selectStudentByName();
                    break;

                case 5:
                    studentMgSys.updateStudent();
                    break;

                case 6:
                    studentMgSys.deleteStudent();
                    break;

                default:
                    System.out.println("*****Please enter a valid input");
            }
        }

    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("========== (1). Add student ==========");

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Student Address:");
        String address = sc.nextLine();

        System.out.println("Enter Student DOB(yyyy-mm-dd)"); // 1994-01-78
        String dobString = sc.nextLine();
        java.util.Date utilDate = null;

        try{
            utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(dobString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());


        System.out.println("Enter student age(years):");
        int age = sc.nextInt();

        Student student = new Student(name, address, sqlDate, age);
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.addStudent(student);
    }

    public void selectAllStudents() {
        StudentDAO studentDAO = new StudentDAO();
        List<Student> studentList = studentDAO.getAllStudents();

        System.out.println("Found "+studentList.size()+" students in the database");

        for(Student st : studentList) {
            System.out.println(st);
        }
    }

    public void selectStudentByName() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name to begin search...");
        String searchName = sc.nextLine();

        StudentDAO studentDAO = new StudentDAO();
        Student student = studentDAO.getStudentByName(searchName);

        if(student==null) {
            System.out.println("No Students found for the name");
        }else{
            System.out.println(student);
//            System.out.println("Student Address is : "+student.getAddress());
//            System.out.println("Date of birth is : " + student.getDob());
        }

    }

    public void selectStudentById() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID to begin search...");
        String searchID = sc.nextLine();

        StudentDAO studentDAO = new StudentDAO();
        Student student = studentDAO.getStudentById(Integer.parseInt(searchID));

        if(student==null) {
            System.out.println("No Students found for the ID");
        }else{
            System.out.println(student);
        }

    }

    public void updateStudent() {
        StudentDAO studentDAO = new StudentDAO();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID if the student, need to be updated...");
        int searchId = Integer.parseInt(sc.nextLine());

        System.out.println("To update, enter new details: ");

        System.out.println("Enter Student New Name: ");
        String newName = sc.nextLine();

        System.out.println("Enter Student New Address:");
        String newAddress = sc.nextLine();

        System.out.println("Enter Student New DOB(yyyy-mm-dd)"); // 1994-01-78
        String newDobString = sc.nextLine();
        java.util.Date newUtilDate = null;

        try{
            newUtilDate = new SimpleDateFormat("yyyy-MM-dd").parse(newDobString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date newSqlDate = new java.sql.Date(newUtilDate.getTime());


        System.out.println("Enter New Age");
        int newAge = sc.nextInt();

        studentDAO.updateStudent(searchId, new Student(newName, newAddress, newSqlDate, newAge));

    }

    public void deleteStudent() {
        System.out.println("Enter Student ID to be deleted...");
        Scanner sc = new Scanner(System.in);
        int idToBeDeleted = Integer.parseInt(sc.nextLine());

        StudentDAO studentDAO = new StudentDAO();
        studentDAO.deleteStudent(idToBeDeleted);
    }

}
