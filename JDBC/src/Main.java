import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Main {

	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection connection=null;
		DbHelper dbHelper=new DbHelper();
		Statement statement=null;
		ResultSet resultSet;
		
		try {
			connection=dbHelper.connectDatabase();
			//System.out.println("Succesfully connected to database!");
			
			statement=connection.createStatement();
			
			resultSet=statement.executeQuery("insert into product (Name, Stock) values('Oppo Reno7', 13)");
			//resultSet=statement.executeQuery("select * from product");
			
			//while (resultSet.next()) {
				//System.out.println(resultSet.getString("Name"));
			//}
			
		} catch (SQLException ex) {
			dbHelper.showErrorMessage(ex);
		} finally {
			connection.close();
		}
	}

}
