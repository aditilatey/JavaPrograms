//create a program to calculate the annual salary of an employee by using inheritance

package PractisePrograms;

class User
{
	int id;
	String sname;
	public User(int id, String sname)   //parameterized constructor
	{
		this.id=id;
		this.sname=sname;
	}
}
class Employee extends User{
	double salary;
	
	public Employee(int id, String name, double salary) {
		super(id, name);
		this.salary=salary;
	}
	
	public double calculationOfAnnual() {
		return salary * 12;
	}
}

public class PractiseExample1 {

	public static void main(String[] args) {
		 Employee e = new Employee(1, "Aditi Latey", 15000);

	     
	        double annualSalary = e.calculationOfAnnual();
	        System.out.println("Employee ID: " + e.id);
	        System.out.println("Employee Name: " + e.sname);
	        System.out.println("Monthly Salary: rs " + e.salary);
	        System.out.println("Annual Salary: rs " + annualSalary);

	}

}
