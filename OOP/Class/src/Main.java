
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product=new Product();
		Product product2=new Product();
		Product product3=new Product();
		Product product4=new Product(4, "Oppo Reno7", "Smart Phone", 187.3, 18);
		Product product5=new Product(5, "Lenovo");
		
		product.Id=1;
		product.Name="Samsung S10";
		product.Description="Smart Phone";
		product.Price=200.3;
		product.Stock=15;
		
		product2.Id=2;
		product2.Name="Iphone 11 Pro";
		product2.Description="Smart Phone";
		product2.Price=250.3;
		product2.Stock=13;
		
		product3.Id=3;
		product3.Name="Xiaomi Mi 11 Pro";
		product3.Description="Smart Phone";
		product3.Price=178.3;
		product3.Stock=25;
		
		Product[] products= {product,product2,product3,product4,product5};
		
		for (Product producta : products) {
			System.out.println(producta.Id + " " + producta.Name+ " " + producta.Description);
			System.out.println("Price-"+producta.Price + " " +"Stock-"+ producta.Stock);
		}
		
		Product.welcome();
		var proWelcome=new Product();
		proWelcome.welcomeB();
	}

}
