package util;
import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static final Dotenv dotenv = Dotenv.load();

    private static final String URL = dotenv.get("DB_URL");
    private static final String USER = dotenv.get("DB_USER");
    private static final String PASSWORD = dotenv.get("DB_PASSWORD");

    static {
        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("ERROR: PostgreSQL Driver not found! Check your pom.xml dependency.");
            throw new RuntimeException("Driver PostgreSQL não encontrado!", e);
        }
        catch (Exception e){
            e.printStackTrace();
            System.err.println("ERROR: Issue loading enviromnment variables or driver.");
            throw new RuntimeException("Initialization error.", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void close (Connection conn){
        if (conn != null){
            try{
                conn.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
