
public class CountByZeroException extends Exception {
	private String message;
	public CountByZeroException() {
	}
	public CountByZeroException(String message) {
		this.message=message;
	}
	public void setMessage(String message) {
		this.message=message;
	}
	public String getMessage() {
		this.message=message;
		return message;
	}
	
		
	}

