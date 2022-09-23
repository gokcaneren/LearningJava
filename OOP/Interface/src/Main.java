
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IRepository repository=new ProductRepository();
		
		repository.AddProduct();
		repository.GetProduct();
		repository.UpdateProduct();
		repository.DeleteProduct();
	}

}
