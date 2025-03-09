import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String root = "root";
        String pass = "rinshad3657";

//      Insert data
        try (Connection con = DriverManager.getConnection(url, root, pass)) {
            System.out.println("connected");
            String sql = "INSERT INTO users ( name,email) VALUES (?,?)";
            PreparedStatement psmt = con.prepareStatement(sql);

            psmt.setString(1, "rinshad");
            psmt.setString(2, "Rinshad@gmail.com");

            int row = psmt.executeUpdate();
            if (row > 0) {
                System.out.println("user inserted successfully");
            }

            con.close();
        } catch (SQLException e) {
            System.out.println("not connected");
            e.printStackTrace();
        }

//      select data
        try (Connection con = DriverManager.getConnection(url, root, pass)) {
            System.out.println("connected");
            String sql1 = "SELECT * FROM users";
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql1);
            while (rs.next()) {
                System.out.println("ID:" + rs.getInt("id") + "NAME:" + rs.getString("name") + "email:" + rs.getString("email"));

            }
        } catch (SQLException e) {
            System.out.println("not connected");
            e.printStackTrace();
        }
    }
}