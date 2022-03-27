package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author chathura
 * @Date 2022-03-27
 */
public class DbConnect {
    public static Connection getConnection() {

        // replace all the details with yours
        String username = "student_db_admin";
        String pw = "123";
        String host = "localhost";
        String dbName = "studentDb";
        String port = "8889";

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+dbName,username,pw);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}