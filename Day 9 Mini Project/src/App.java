import dao.DbConnect;
import dao.StudentDAO;
import model.Student;

import java.sql.Connection;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert Student");

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Student Address:");
        String address = sc.nextLine();

        System.out.println("Enter Student DOB(yyyy-mm-dd)");
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

}
