package dao;

import model.Student;

import javax.xml.namespace.QName;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {

    // database access logic

    // CRUD - Create(Add), Read(select), Update, Delete\

    // prepared statements
    private static final String INSERT_STUDENT = "INSERT INTO student(student_name, address, dob, age, course_id) values(?,?,?,?,?)";


    // (C)reate // Student
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
            ps.setInt(5, st.getCourseId());
            ps.executeUpdate();

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
}
