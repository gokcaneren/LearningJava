import java.util.ArrayList;

public class ProductRepository implements IRepository<Product> {

	ArrayList<Product> product=new ArrayList<Product>();
	@Override
	public void Add(Product entity) {
		// TODO Auto-generated method stub
		
		product.add(entity);
	}

	@Override
	public void Update(Product entity) {
		// TODO Auto-generated method stub
		entity.id=2;
		product.add(entity);
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		product.remove(id);
	}

}
