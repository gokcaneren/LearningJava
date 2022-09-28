import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	static String userName="root";
	static String password="gok12345";
	static String dbUrl="jdbc:mysql://localhost:3306/ETrade";
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(dbUrl, userName, password);
			System.out.println("Succesfully connected to database!");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			connection.close();
		}
	}

}
