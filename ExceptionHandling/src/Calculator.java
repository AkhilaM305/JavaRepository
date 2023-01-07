
public class Calculator {
	public static void doAverage(int...a) throws CountByZeroException{
	float average;
	int sum=0;
	for(int x:a) {
		sum+=x;
	}
	if(a.length==0) {
		throw new CountByZeroException{"Zero count found"};
	}
	
		average=sum/a.length;
		System.out.println("Average"+ average);
	}
}

