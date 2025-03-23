package pkgOrgStructure;

/**
 * In the project ManageEmployees, add a package pkgOrgStructre. Within that
 * package add classes Employee, Manager,Developer and Tester and EmployeeDemo.
 * All classes except EmployeeDemo should have its constructor. Connect the
 * valid business classes using Inheritance.
 */
public class Employee {
	String name;
	int empId;
	double salary;

	public Employee(String name, int empId, double salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;

	}

	public void displayInfo() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
//		empId, empNm, empAge, empPanCrd, empAadharCrd, empDept, empSal, empContactNbr,empExp
	}
}
