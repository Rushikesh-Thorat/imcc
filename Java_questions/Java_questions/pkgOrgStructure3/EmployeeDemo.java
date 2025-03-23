package pkgOrgStructure3;

public class EmployeeDemo{
	
	    public static void main(String[] args) {
	        Manager mgr = new Manager(101, "Alice", 40, "PAN123", "AAD123", "IT", 90000, "1234567890", 15, 3, 10);
	        Developer dev = new Developer(102, "Bob", 30, "PAN456", "AAD456", "IT", 70000, "9876543210", 8, "Alpha", "Alice", "Java, React");
	        Tester tester = new Tester(103, "Charlie", 28, "PAN789", "AAD789", "QA", 60000, "5678901234", 5, "Beta", "Alice", "Manual, Automation");

	        // Display details before salary computation
	        System.out.println("\nBefore Salary Calculation:");
	        mgr.details();
	        dev.details();
	        tester.details();

	        // Compute salaries
	        System.out.println("\nComputing Salaries...");
	        mgr.computeSalary();
	        dev.computeSalary();
	        tester.computeSalary();

	        // Display updated details after salary computation
	        System.out.println("\nAfter Salary Calculation:");
	        mgr.details();
	        dev.details();
	        tester.details();
	    }
	}

