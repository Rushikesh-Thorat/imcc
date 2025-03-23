package pkgQuestion6;

public class Main {
	public static void main(String[] args) {
        // Create objects of ProductionDepartment and EngineeringDepartment
        Employee productionEmployee = new ProductionDepartment();
        Employee engineeringEmployee = new EngineeringDepartment();

        // Enroll employees
        productionEmployee.enroll("Vedant Girjapure", 101);
        engineeringEmployee.enroll("Atharv Kankatre", 102);

        // Calculate pay
        productionEmployee.calculatePay();
        engineeringEmployee.calculatePay();

        // Terminate employees
        productionEmployee.terminate(101);
        engineeringEmployee.terminate(102);

        // Attempt to calculate pay after termination
        productionEmployee.calculatePay();
        engineeringEmployee.calculatePay();
    }
}
