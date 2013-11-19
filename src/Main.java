import java.sql.Connection;


public class Main {

	public static void main(String[] args) {
		Connection c = SqlUtils.getConnection();
		SqlUtils.insertFeature("bye", 4, 2, 99.7);
		SqlUtils.listFeatures();
		SqlUtils.shutdownDerby();
	}
}
