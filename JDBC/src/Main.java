import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection connection=null;
		DbHelper dbHelper=new DbHelper();
		
		try {
			connection=dbHelper.connectDatabase();
			System.out.println("Succesfully connected to database!");
			
			connection.nativeSQL("insert into product (Name, Stock) values ('Oppo Reno6', 13)");
			
		} catch (SQLException ex) {
			dbHelper.showErrorMessage(ex);
		} finally {
			connection.close();
		}
	}

}
