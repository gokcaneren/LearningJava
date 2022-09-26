import java.util.ArrayList;

public class NotFoundException extends Exception{

	String _message;
	
	public NotFoundException(String message) {
		_message=message;
	}
	
	public String getMessage() {
		return _message;
	}
	
	
	
}
