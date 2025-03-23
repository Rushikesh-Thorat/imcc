package pkgQuestion6;

// EngineeringDepartment class implementing Employee interface
public class EngineeringDepartment implements Employee {

	    private String employeeName;
	    private int employeeId;
	    private boolean isEnrolled;
	    private double monthlySalary = 5000.0; // Example monthly salary for engineering department

	    @Override
	    public void enroll(String name, int id) {
	        this.employeeName = name;
	        this.employeeId = id;
	        this.isEnrolled = true;
	        System.out.println("Employee " + name + " (ID: " + id + ") enrolled in Engineering Department.");
	    }

	    @Override
	    public void terminate(int id) {
	        if (this.employeeId == id && this.isEnrolled) {
	            this.isEnrolled = false;
	            System.out.println("Employee " + this.employeeName + " (ID: " + id + ") terminated from Engineering Department.");
	        } else {
	            System.out.println("Employee with ID " + id + " not found in Engineering Department.");
	        }
	    }

	    @Override
	    public void calculatePay() {
	        if (this.isEnrolled) {
	            System.out.println("Salary for " + this.employeeName + " (ID: " + this.employeeId + ") in Engineering Department: $" + monthlySalary);
	        } else {
	            System.out.println("Employee " + this.employeeName + " (ID: " + this.employeeId + ") is not enrolled.");
	        }
	    }
	}


