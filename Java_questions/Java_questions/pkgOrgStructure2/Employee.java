package pkgOrgStructure2;


public class Employee {
	// Private attributes
	private int empId;
	private String empNm;
	private int empAge;
	private String empPanCrd;
	private String empAadharCrd;
	private String empDept;
	private double empSal;
	private String empContactNbr;
	private int empExp;

	// Constructor
	public Employee(int empId, String empNm, int empAge, String empPanCrd, String empAadharCrd, String empDept,
			double empSal, String empContactNbr, int empExp) {
		setEmpId(empId);
		setEmpNm(empNm);
		setEmpAge(empAge);
		setEmpPanCrd(empPanCrd);
		setEmpAadharCrd(empAadharCrd);
		setEmpDept(empDept);
		setEmpSal(empSal);
		setEmpContactNbr(empContactNbr);
		setEmpExp(empExp);
	}

	// Getters and Setters (Accessors and Mutators)
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpNm() {
		return empNm;
	}

	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpPanCrd() {
		return empPanCrd;
	}

	public void setEmpPanCrd(String empPanCrd) {
		this.empPanCrd = empPanCrd;
	}

	public String getEmpAadharCrd() {
		return empAadharCrd;
	}

	public void setEmpAadharCrd(String empAadharCrd) {
		this.empAadharCrd = empAadharCrd;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public String getEmpContactNbr() {
		return empContactNbr;
	}

	public void setEmpContactNbr(String empContactNbr) {
		this.empContactNbr = empContactNbr;
	}

	public int getEmpExp() {
		return empExp;
	}

	public void setEmpExp(int empExp) {
		this.empExp = empExp;
	}

	// Method to display employee details
	public void displayDetails() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empNm);
		System.out.println("Employee Age: " + empAge);
		System.out.println("Employee PAN: " + empPanCrd);
		System.out.println("Employee Aadhar: " + empAadharCrd);
		System.out.println("Employee Department: " + empDept);
		System.out.println("Employee Salary: " + empSal);
		System.out.println("Employee Contact Number: " + empContactNbr);
		System.out.println("Employee Experience: " + empExp + " years");
	}
}