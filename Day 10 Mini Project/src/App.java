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

public class App {
    public static void main(String[] args) {
        updateStudent();






    }

    public static void addStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert Student");

        System.out.println("Enter Student Name: ");
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


        System.out.println("Enter Age");
        int age = sc.nextInt();

        System.out.println("Enter Course ID");
        int courseID = sc.nextInt();

        Student student = new Student(name, address, sqlDate, age, courseID);
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.addStudent(student);

        System.out.println("Student added! ");
        System.out.println(student);

    }

    public static void selectAllStudents() {
        StudentDAO studentDAO = new StudentDAO();
        List<Student> studentList = studentDAO.getAllStudents();

        for(Student st : studentList) {
            System.out.println(st);
        }
    }

    public static void selectStudentByName() {

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

    public static void selectStudentById() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID to begin search...");
        String searchID = sc.nextLine();

        StudentDAO studentDAO = new StudentDAO();
        Student student = studentDAO.getStudentById(Integer.parseInt(searchID));

        if(student==null) {
            System.out.println("No Students found for the name");
        }else{
            System.out.println(student);
        }

    }

    public static void updateStudent() {
        StudentDAO studentDAO = new StudentDAO();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID if the student, need to be updated...");
        int searchId = Integer.parseInt(sc.nextLine());
        System.out.println("Existing Student Detail");
        System.out.println(studentDAO.getStudentById(searchId));

        System.out.println("To update, enter new details: ");

        System.out.println("New name :");
        String newName = sc.nextLine();

        System.out.println("New address :");
        String newAddress = sc.nextLine();

        String dobString = "1999-09-09";
        java.util.Date utilDate = null;

        try{
            utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(dobString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        Student updatedStudent = new Student(searchId, newName, newAddress, sqlDate, 89, 1888);

        studentDAO.updateStudent(updatedStudent);
    }
}
