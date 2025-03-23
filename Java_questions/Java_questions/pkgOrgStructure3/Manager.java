package pkgOrgStructure3;

public class Manager extends Employee {
	
	    private int noOfTeams, noOfReportees;

	    public Manager(int empId, String empNm, int empAge, String empPanCrd, String empAadharCrd,
	                   String empDept, double empSal, String empContactNbr, int empExp,
	                   int noOfTeams, int noOfReportees) {
	        super(empId, empNm, empAge, empPanCrd, empAadharCrd, empDept, empSal, empContactNbr, empExp);
	        this.noOfTeams = noOfTeams;
	        this.noOfReportees = noOfReportees;
	    }

	    // Override details()
	    @Override
	    public void details() {
	        super.details();
	        System.out.println("Teams Managed: " + noOfTeams + ", Reportees: " + noOfReportees);
	    }

	    // Override computeSalary()
	    @Override
	    public void computeSalary() {
	        empSal *= 8;
	        System.out.println("Updated Manager Salary: " + empSal);
	    }
	}


