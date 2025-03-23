package pkgQuestion6;

public class ProductionDepartment implements Employee {

	private String employeeName;
    private int employeeId;
    private boolean isEnrolled;
    private double hourlyRate = 15.0; // Example hourly rate for production department

    @Override
    public void enroll(String name, int id) {
        this.employeeName = name;
        this.employeeId = id;
        this.isEnrolled = true;
        System.out.println("Employee " + name + " (ID: " + id + ") enrolled in Production Department.");
    }

    @Override
    public void terminate(int id) {
        if (this.employeeId == id && this.isEnrolled) {
            this.isEnrolled = false;
            System.out.println("Employee " + this.employeeName + " (ID: " + id + ") terminated from Production Department.");
        } else {
            System.out.println("Employee with ID " + id + " not found in Production Department.");
        }
    }

    @Override
    public void calculatePay() {
        if (this.isEnrolled) {
            double hoursWorked = 40; // Example: assuming 40 hours worked in a week
            double salary = hoursWorked * hourlyRate;
            System.out.println("Salary for " + this.employeeName + " (ID: " + this.employeeId + ") in Production Department: $" + salary);
        } else {
            System.out.println("Employee " + this.employeeName + " (ID: " + this.employeeId + ") is not enrolled.");
        }
    }
}


