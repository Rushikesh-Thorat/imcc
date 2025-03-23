package pkgOrgStructure4;

/**
 * In the previously designed classes, demonstrate use of super keyword to
 * invoke super class details() from within its sub classes.
 */
public class Employee {
	private int empId, empAge, empExp;
	private String empNm, empPanCrd, empAadharCrd, empDept, empContactNbr;
	protected double empSal; // Protected to allow modification in subclasses

	// Constructor
	public Employee(int empId, String empNm, int empAge, String empPanCrd, String empAadharCrd, String empDept,
			double empSal, String empContactNbr, int empExp) {
		this.empId = empId;
		this.empNm = empNm;
		this.empAge = empAge;
		this.empPanCrd = empPanCrd;
		this.empAadharCrd = empAadharCrd;
		this.empDept = empDept;
		this.empSal = empSal;
		this.empContactNbr = empContactNbr;
		this.empExp = empExp;
	}

	// Print Employee details
	public void details() {
		System.out.println("ID: " + empId + ", Name: " + empNm + ", Age: " + empAge + ", PAN: " + empPanCrd
				+ ", Aadhar: " + empAadharCrd + ", Dept: " + empDept + ", Salary: " + empSal + ", Contact: "
				+ empContactNbr + ", Experience: " + empExp + " years");
	}

	// Base method for salary calculation
	public void computeSalary() {
		System.out.println("Employee Base Salary: " + empSal);
	}
}
