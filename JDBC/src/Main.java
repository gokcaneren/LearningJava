import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class Main {

	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection connection=null;
		DbHelper dbHelper=new DbHelper();
		Statement statement=null;
		ResultSet resultSet;
		
		ArrayList<Product> products=new ArrayList<Product>();
		
		try {
			connection=dbHelper.connectDatabase();
			//System.out.println("Succesfully connected to database!");
			
			statement=connection.createStatement();
			
			resultSet=statement.executeQuery("select * from product");
			
			while (resultSet.next()) {
				products.add(new Product(
						resultSet.getInt("Id"),
						resultSet.getString("Name"),
						resultSet.getInt("Stock")
						));
			}
			
			System.out.println(products.size());
			
		} catch (SQLException ex) {
			dbHelper.showErrorMessage(ex);
		} finally {
			connection.close();
		}
	}

}
