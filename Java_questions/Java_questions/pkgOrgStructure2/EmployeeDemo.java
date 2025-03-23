package pkgOrgStructure2;

public class EmployeeDemo {
    public static void main(String[] args) {
        // Create objects of Employee, Manager, Developer, and Tester
        Employee employee = new Employee(101, "Vedant", 30, "ABCDE1234F", "123456789012", "HR", 50000, "9876543210", 5);
        Manager manager = new Manager(201, "Yallari", 35, "FGHIJ5678K", "987654321098", "IT", 80000, "8765432109", 10, 3, 15);
        Developer developer = new Developer(301, "Atharv", 28, "LMNOP9012Q", "567890123456", "IT", 60000, "7654321098", 4, "Dev Team 1", "Yallari", "Java, Python");
        Tester tester = new Tester(401, "Kunal", 32, "QRSTU3456V", "654321098765", "QA", 55000, "6543210987", 6, "QA Team 1", "Yallari", "Automation");

        // Display details of each employee
        System.out.println("Employee Details:");
        employee.displayDetails();

        System.out.println("\nManager Details:");
        manager.displayDetails();

        System.out.println("\nDeveloper Details:");
        developer.displayDetails();

        System.out.println("\nTester Details:");
        tester.displayDetails();
    }
}