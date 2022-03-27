package dao;

/**
 * @author chathura
 * @Date 2022-03-27
 */
import model.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDAO {

    // database access logic

    // CRUD - Create(Add), Read(select), Update, Delete\

    // prepared statements
    private static final String INSERT_STUDENT = "INSERT INTO student(student_name, address, dob, age) values(?,?,?,?)";
    private static final String SELECT_ALL_STUDENTS = "SELECT * FROM student";
    private static final String SELECT_STUDENT_BY_NAME = "SELECT * FROM student WHERE student_name = ?";
    private static final String SELECT_STUDENT_BY_ID = "SELECT * FROM student WHERE student_id = ?";
    private static final String UPDATE_STUDENT = "UPDATE student SET student_name=?, address=?, dob=?, " +
            "age=? WHERE student_id=?"; // 6
    private static final String DELETE_STUDENT = "DELETE FROM student WHERE student_id=?";

    // joins, innner join, outer join, left

    // (C)Create // Student
    public void addStudent(Student st) {
        Connection con = null;
        PreparedStatement ps = null;

        try{
            con = DbConnect.getConnection();
            ps = con.prepareStatement(INSERT_STUDENT);
            ps.setString(1, st.getName());
            ps.setString(2, st.getAddress());
            ps.setDate(3, (Date) st.getDob());
            ps.setInt(4, st.getAge());
            ps.executeUpdate();
            System.out.println("Created Successfully !");

        } catch (SQLException e){
            System.out.println(e);
        } finally {
            try{
                if(con!=null){
                    con.close();
                }
                if(ps!=null){
                    ps.close();
                }
            } catch (SQLException e){
                System.out.println(e);
            }
        }
    }

    // Select (READ) all students <LIST>
    public List<Student> getAllStudents() {
        Connection con = null;

        List<Student> studentList = new ArrayList<Student>(); // arrayList, Dynamically Grow, Generics, Collections
        Statement st = null;
        ResultSet rs = null;

        try{
            con = DbConnect.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(SELECT_ALL_STUDENTS); // rs{}

            while(rs.next()) {
                studentList.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getDate(4), rs.getInt(5)));
            }

        }catch(SQLException e) {
            e.printStackTrace();
        } finally {
            try{
                if(con!=null) {
                    con.close();
                }
                if(st!=null) {
                    st.close();
                }
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
        return studentList;
    }

    // select (READ) a student by name
    public Student getStudentByName(String name) {
        Student student = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(SELECT_STUDENT_BY_NAME);
            ps.setString(1, name);
            rs = ps.executeQuery();

            while (rs.next()) { // result = 0
                student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getDate(4), rs.getInt(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(con!=null) {
                    con.close();
                }if(ps!=null) {
                    ps.close();
                }if(rs!=null) {
                    rs.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return student;
    }

    // select (READ) a student by ID
    public Student getStudentById(int id) {
        Student student = null;

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            con = DbConnect.getConnection();
            ps = con.prepareStatement(SELECT_STUDENT_BY_ID);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getDate(4), rs.getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(con!=null) {
                    con.close();
                }
                if (ps!=null) {
                    ps.close();
                }if(rs!=null) {
                    rs.close();
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return student;
    }

    // Update Student
    public void updateStudent(int searchID, Student newStudent) {
        StudentDAO studentDAO = new StudentDAO();
        Student searchStudent = studentDAO.getStudentById(searchID);

        if (searchStudent==null) {
            System.out.println("No Student Found. Do you want to insert as a New Student(y/n)!");

            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();

            if(choice.equals("y")) {
                studentDAO.addStudent(newStudent);
            }else if(choice.equals("n")){
            }else{
                System.out.println("The choice you entered is wrong");
            }

        }else{
            Connection con = null;
            PreparedStatement ps = null;

            try {

                //    private static final String UPDATE_STUDENT = "UPDATE student SET student_name=?, address=?, dob=?, " +
                //            "age=?, course_id=? WHERE student_id=?"; // 6
                con = DbConnect.getConnection();
                ps = con.prepareStatement(UPDATE_STUDENT);
                ps.setString(1, newStudent.getName());
                ps.setString(2, newStudent.getAddress());
                ps.setDate(3, newStudent.getDob());
                ps.setInt(4, newStudent.getAge());
                ps.setInt(5, searchID);
                ps.executeUpdate();
                System.out.println("Updated Successfully !");

            }catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try{
                    if(con!=null){
                        con.close();
                    }
                    if(ps!=null){
                        ps.close();
                    }
                } catch (SQLException e){
                    System.out.println(e);
                }
            }
        }
    }

    // Delete Student (D), int id
    public void deleteStudent(int deleteId) {

        StudentDAO studentDAO = new StudentDAO();
        Student searchStudent = studentDAO.getStudentById(deleteId);

        if(searchStudent!=null) {
            Connection con = null;
            PreparedStatement ps = null;

            try{
                con = DbConnect.getConnection();
                ps = con.prepareStatement(DELETE_STUDENT);
                ps.setInt(1, deleteId);
                ps.executeUpdate();
                System.out.println("Successfully deleted!");
            }catch (SQLException e){
                e.printStackTrace();
            } finally {
                try {
                    if(con!=null) {
                        con.close();
                    }if(ps!=null) {
                        ps.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }else{
            System.out.println("Student with the id:"+deleteId +" cannot be found");
        }
    }
}
