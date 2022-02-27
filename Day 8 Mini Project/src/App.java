import java.sql.Connection;

public class App {
    public static void main(String[] args) {

        Connection con = DbConnect.getConnection(); // returning a connection object

        if(con!=null) {
            System.out.println("Connection created!");
        }else{
            System.out.println("Connection is not created successfuly");
        }
    }
}
