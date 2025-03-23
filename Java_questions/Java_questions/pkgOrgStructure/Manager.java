package pkgOrgStructure;

public class Manager extends Employee{
	String department;
	
	public Manager(String name, int empId, double salary, String department) {
		super(name, empId, salary);
		this.department = department;
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Department: "+ department);
	}
}
