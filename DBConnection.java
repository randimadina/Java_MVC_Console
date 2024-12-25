import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection dbConn = null;

    private DBConnection(){}
    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            dbConn = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "user1234", "Pass@1234");
        } catch (ClassNotFoundException ex1){
            ex1.printStackTrace();
        } catch (SQLException ex2){
            ex2.printStackTrace();
        }
    }

    public static Connection GetDBConnection(){
        return dbConn;
    }
}
