class CountByZeroException extends Exception{
	private String message;
	public CountByZeroException() {}
	public CountByZeroException(String message) {
		this.message=message;
	}
	public void setMessage(String message) {
		this.message=message;
	}
	public String getMessage() {
		return this.message;
	}
}
public class Calculator {
	public static void doAverage(int...a)throws CountByZeroException{
		float average = 0;
		int sum = 0;
		for(int x:a) {
			sum+=x;
		}
		if(a.length==0) {
			throw new CountByZeroException("numbers not found");
		}
		average = sum/a.length;
		System.out.println("average is" + average);
	}
}
class Source{
  public static void main(String args[]) {
	  try {
	Calculator.doAverage(2,5,7);
	Calculator.doAverage(7,8,9);
	Calculator.doAverage();
}
	  catch(CountByZeroException message) {
		  System.out.println(message);
	  }
}
}

