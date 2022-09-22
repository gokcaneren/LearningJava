
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var sum=sum(5,10);
		System.out.println(sum);
		
		var name="Goky";
		
		welcomeMessage(name);
		
		int age=44;
		
		if (youngOrOld(age)) {
			System.out.println("Yes! He is young!");
		}else {
			System.out.println("No! He is old!");
		}
		
	}
	
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	
	
	public static void welcomeMessage(String name) {
		System.out.println(name + " welcome to our java project!");
	}
	
	public static boolean youngOrOld(int age) {
		boolean isYoung=false;
		if (age<35) {
			isYoung=true;
			return isYoung;
		}
		return isYoung;
	}

}
