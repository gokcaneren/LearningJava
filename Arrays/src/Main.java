
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] students= {"Micheal","George","John","Carol","May"};
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		};
		
		System.out.println("------------------------");
		
		for (String student : students) {
			System.out.println(student);
		}
		
		System.out.println("------------------------");
		
		String[] cars=new String[3];
		cars[0]="Volvo";
		cars[1]="Skoda";
		cars[2]="Mercedes";
		
		
		System.out.println(cars[2]);
		
		System.out.println("------------------------");
		
		double[] nums= {0.3,4.3,3.5,1.2,8.1};
		double total=0;
		
		for (double num : nums) {
			total=total+num;
		}
		System.out.println(total);
	}

}
