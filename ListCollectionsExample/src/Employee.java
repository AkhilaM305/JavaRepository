
public class Employee implements Comparable<Employee>{
	private String employeeName;
	private int  employeeId;
	private double salary;
	private int employeeAge;
	private String designation;
	
	public  Employee() {}
	public  Employee(String employeeName,int  employeeId,double salary,int employeeAge,String designation) {
		this.employeeName =employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.employeeAge = employeeAge;
		this.designation = designation;
	}
	public String getEmployeeName() {
		return this.employeeName =employeeName;
	}
	public int getEmployeeId() {
		return this.employeeId = employeeId;
	}
	public double getSalary() {
		return this.salary = salary;
	}
	public int getEmployeeAge() {
		return this.employeeAge = employeeAge;
	}
	public String getDesignation() {
		return this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", salary=" + salary
				+ ", employeeAge=" + employeeAge + ", designation=" + designation + "]";
	}
		
	@Override
	public int compareTo(Employee o) {
		return this.employeeId - o.employeeId;
	}
		
		
		
		
	}
