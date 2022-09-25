import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ArrayList arrList=new ArrayList();
		
		arrList.add(3);
		arrList.add(15);
		arrList.add("Volvo");
		
		//System.out.println(arrList.size());
		//System.out.println(arrList.get(2));
		
		arrList.set(0, "Mercedes");
		
		//arrList.remove(0);
		//arrList.clear();
		//System.out.println(arrList.get(0));
		
		for (Object i : arrList) {
			System.out.println(i);
		}
		
		
		ArrayList<String> cities=new ArrayList<String>();
		
		cities.add("Ankara");
		cities.add("İstanbul");
		cities.add("Eskisehir");
		cities.add("Adana");
		
		cities.remove("İstanbul");
		
		Collections.sort(cities);
		
		for (String city : cities) {
			System.out.println(city);
		}
		*/
		
		HashMap<String, String> cars=new HashMap<String, String>();
		
		cars.put("Volvo", "S90");
		cars.put("Toyota", "Corolla");
		cars.put("Mercedes", "E200");
		
		System.out.println(cars.size());
		
		for (String car : cars.keySet()) {
			System.out.println(car+" "+cars.get(car));
		}
		
		cars.remove("Volvo");
		cars.clear();
		System.out.println(cars.get("Volvo"));
	}

}
