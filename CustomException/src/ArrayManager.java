import java.util.ArrayList;

public class ArrayManager {

	public static void isContain(ArrayList<?> arr, String city ) throws NotFoundException {
		if (arr.contains(city)) {
			System.out.println(arr+" has "+city);
		}else {
			throw new NotFoundException(city+" not found!");
		}
	}
}