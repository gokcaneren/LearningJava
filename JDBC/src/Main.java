import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class Main {

	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection connection=null;
		DbHelper dbHelper=new DbHelper();
		PreparedStatement statement=null;
		ResultSet resultSet;
		
		ArrayList<Product> products=new ArrayList<Product>();
		
		try {
			connection=dbHelper.connectDatabase();
			//System.out.println("Succesfully connected to database!");
			
			statement=connection.prepareStatement("insert into product (Name, Stock) values ('Vivo V21e', 20)");
			
			statement.executeUpdate();
			
			System.out.println("New data added to Product!");
			/*
			resultSet=statement.executeQuery("select * from product");
			
			while (resultSet.next()) {
				products.add(new Product(
						resultSet.getInt("Id"),
						resultSet.getString("Name"),
						resultSet.getInt("Stock")
						));
			}
			System.out.println(products.size());
			*/
			
			
		} catch (SQLException ex) {
			dbHelper.showErrorMessage(ex);
		} finally {
			connection.close();
		}
	}

}
