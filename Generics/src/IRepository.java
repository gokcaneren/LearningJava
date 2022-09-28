
public interface IRepository<T> {

	void Add(T entity);
	void Update(T entity);
	void Delete(int id);
}
