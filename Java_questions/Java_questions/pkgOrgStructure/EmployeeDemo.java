package pkgOrgStructure;

public class EmployeeDemo {
	public static void main(String[] args) {
		Manager mgr = new Manager("Vedant", 101, 75000, "IT");
		Developer dev = new Developer("Atharv", 102, 60000, "Java");
		Tester tester = new Tester("Yallari", 103, 50000, "Selenium");
		
		
		System.out.println("Manager Details: ");
		mgr.displayInfo();
		System.out.println();
		
		System.out.println("Developer Details: ");
		dev.displayInfo();
		System.out.println();
		
		System.out.println("Tester Details: ");
		tester.displayInfo();
		
	}
}
