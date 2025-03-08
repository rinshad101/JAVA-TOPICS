import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "rinshad3657";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("connected successfully");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}