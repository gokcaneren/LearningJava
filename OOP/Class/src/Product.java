
public class Product {

	int Id;
	String Name;
	String Description;
	double Price;
	int Stock;
	
	Product(int id, String name, String description, double price, int stock) {
		Id=id;
		Name=name;
		Description=description;
		Price=price;
		Stock=stock;
	}
	
	Product(){
		
	}
	
	Product(int id, String name){
		Id=id;
		Name=name;
	}
	
	public static void welcome() {
		System.out.println("Welcome to our store!");
	}
	
	public void welcomeB() {
		System.out.println("Welcome to our store!");
	}
}
