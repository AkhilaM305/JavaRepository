package com.capg;

public class Source {
public static void main(String[] args) {
	 ICalculator obj = new ICalculator() {

		@Override
		public void addition() {
			// TODO Auto-generated method stub
			System.out.println(4+9);
		}
		 
	 };
	 obj.addition();
	 ICalculator calc=()->System.out.println(6+6);
	    calc.addition();
	 ICalculator2 calc2=()->System.out.println(9-5);
	     calc2.substraction();
	     ICalculator3 calc3=()->System.out.println(9*5);
	     calc3.multiplication();
}
}
