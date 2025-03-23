package pkgOrgStructure4;

public class Tester extends Employee {

	    private String nameOfTheTeam, nameOfManager, testingType;

	    public Tester(int empId, String empNm, int empAge, String empPanCrd, String empAadharCrd,
	                  String empDept, double empSal, String empContactNbr, int empExp,
	                  String nameOfTheTeam, String nameOfManager, String testingType) {
	        super(empId, empNm, empAge, empPanCrd, empAadharCrd, empDept, empSal, empContactNbr, empExp);
	        this.nameOfTheTeam = nameOfTheTeam;
	        this.nameOfManager = nameOfManager;
	        this.testingType = testingType;
	    }

	    // Override details() and use super.details()
	    @Override
	    public void details() {
	        super.details();
	        System.out.println("Team: " + nameOfTheTeam + ", Manager: " + nameOfManager +
	                ", Testing Type: " + testingType);
	    }

	    // Override computeSalary()
	    @Override
	    public void computeSalary() {
	        empSal *= 5;
	        System.out.println("Updated Tester Salary: " + empSal);
	    }
	}


