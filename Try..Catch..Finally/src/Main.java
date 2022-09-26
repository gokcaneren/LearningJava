
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int[] nums=new int[]{1,2};
			nums[2]=4;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
		}finally {
			System.out.println("Program will continue");
		}
	}

}
