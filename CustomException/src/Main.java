import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NotFoundException  {
		// TODO Auto-generated method stub

		
		
		ArrayList cities= new ArrayList();
		cities.add("Ankara");
		cities.add("Mugla");
		cities.add("Eskisehir");
		
		try {
			ArrayManager.isContain(cities, "Dublin");
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
