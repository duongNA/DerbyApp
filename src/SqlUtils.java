import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SqlUtils {
	public static Connection connect() {
		try {
			String dbUrl = "jdbc:derby:TestDB;create=true";
			
			Connection connection = DriverManager.getConnection(dbUrl);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static boolean disconnect() {
		try {
			String shutdownUrl = "jdbc:derby:;shutdown=true";
			DriverManager.getConnection(shutdownUrl);
		} catch (SQLException e) {
			if (e.getMessage().equals("Derby system shutdown.")) {
				return true;
			}
		}
		return false;
	}
}
