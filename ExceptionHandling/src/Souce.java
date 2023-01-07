
public class Souce {

	public static void main(String[] args) {
		try{
			Calculator.doAverage(5,5,6);
		Calculator.doAverage(5,7,5);
		Calculator.doAverage();
		}
		catch(CountByZeroException ex) {
			System.out.println(ex.getMessage());
	
		}
		
		
		
		
	}
}
