package pkgOrgStructure4;

public class EmployeeDemo {
	    public static void main(String[] args) {
	        // Creating Manager object
	        Manager mgr = new Manager(101, "Vedant", 40, "PAN123", "AAD123", "IT", 90000, "1234567890", 15, 3, 10);
	        
	        // Creating Developer object
	        Developer dev = new Developer(102, "Atharv", 30, "PAN456", "AAD456", "IT", 70000, "9876543210", 8, "Alpha", "Vedant", "Java, React");
	        
	        // Creating Tester object
	        Tester tester = new Tester(103, "Yallari", 28, "PAN789", "AAD789", "QA", 60000, "5678901234", 5, "Beta", "Vedant", "Manual, Automation");

	        // Calling details() and computeSalary() for each object
	        mgr.details();
	        mgr.computeSalary();

	        dev.details();
	        dev.computeSalary();

	        tester.details();
	        tester.computeSalary();
	    }
	}


