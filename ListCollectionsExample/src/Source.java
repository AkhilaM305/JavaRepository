import java.util.*;
class SortByName implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}
	
}
class SortByAge implements Comparator<Employee>{
	@Override
	public int compare(Employee o1 , Employee o2) {
		return o1.getEmployeeAge()-(o2.getEmployeeAge());
	}
	}
	
	
public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> lstemp = new ArrayList<Employee>();
		Employee emp1 = new Employee("Akhila",101,22000,20,"developer");
		lstemp.add(emp1);
		lstemp.add(new Employee("Sanjana", 102, 34000 , 23 ,"senior developer"));
		lstemp.add(new Employee("Harshini", 103, 36000 , 21 ,"Analyst"));
		for(Employee employee : lstemp) {
		System.out.println(employee);
		}
		//implementing interface for sorting using classes
		//by name
		Collections.sort(lstemp, new SortByName());
		for(Employee employee : lstemp) {
			System.out.println(employee);
			}
		//sort by age
		Collections.sort(lstemp,new SortByAge());
		for(Employee employee : lstemp) {
			System.out.println(employee);
			}
		//implementing anonymosly
		Collections.sort(lstemp,new Comparator<Employee>(){
			public int compare(Employee o1,Employee o2) {
			return o1.getEmployeeName().compareTo(o2.getEmployeeName());
			}		
			
		});
		for(Employee employee : lstemp) {
			System.out.println(employee);
			}
			// implementing using lambda expressions 
		Collections.sort(lstemp,(o1,o2)->o1.getEmployeeAge()-(o2.getEmployeeAge()));
		for(Employee employee : lstemp) {
			System.out.println(employee);
			}
		}
		
		
		
	}

