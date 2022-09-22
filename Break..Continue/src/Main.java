
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Break
		/*
		int i=0;
		while (i<10) {
			System.out.println(i);
			i++;
			if (i==5) {
				break;
			}
		}
		*/
		
		// Continue
		int i=0;
		while (i<10) {
			if (i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;			
		}
	}

}
