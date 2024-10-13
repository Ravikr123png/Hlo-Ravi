import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws ClassNotFoundException {

        String connectionURL =  "jdbc:mysql://localhost:3306/bankaccount";
        String userName="root";
        String password="Ravikr@123#";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded succesfully !!!");
        } catch
        (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection conn = DriverManager.getConnection(connectionURL, userName, password);
            System.out.println("Connection successfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }
}
