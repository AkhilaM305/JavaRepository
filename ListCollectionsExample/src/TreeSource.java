import java.util.*;
class NameSort implements Comparator<Employee>{
	@Override
	public int compare(Employee o1,Employee o2) {
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
		
	}
}
public class TreeSource {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> tsemp = new TreeSet<Employee>();
		Employee emp1 = new Employee("Akhila",101,22000,20,"developer");
		tsemp.add(emp1);
		tsemp.add(new Employee("Sanjana", 102, 34000 , 23 ,"senior developer"));
		tsemp.add(new Employee("Harshini", 103, 36000 , 21 ,"Analyst"));
		//sorting by default with comparable in main class(employee) if we not do comparable class clast exception occurs because treelist is naturally sorted
		for(Employee employee : tsemp) {
		System.out.println(employee);
		}
		//sorting by class
		TreeSet<Employee> empName=new TreeSet<Employee>(new NameSort());
		empName.addAll(tsemp);
		for (Employee employee : empName) {
			System.out.println(employee);
		}
		}
		//sorting by age with lambda
		TreeSet<Employee> tsDes=new TreeSet<Employee>((o1,o2)->o1.getDesignation().compareTo(o2.getDesignation()));
		
		
}
		
		
      


